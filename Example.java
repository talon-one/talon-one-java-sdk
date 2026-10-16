package com.example.consumer;

import com.google.gson.Gson;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.auth.ApiKeyAuth;
import one.talon.model.*;

import java.time.OffsetDateTime;
import java.util.*;

public class Example {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        ApiClient apiClient = new ApiClient();

        // Setup: Base path
        apiClient.setBasePath("http://localhost:9000");

        // Setup: Authorization
        ApiKeyAuth apiKeyV1 = (ApiKeyAuth) apiClient.getAuthentication("api_key_v1");
        apiKeyV1.setApiKeyPrefix("ApiKey-v1");
        apiKeyV1.setApiKey(System.getenv("TALON_API_KEY"));

        IntegrationApi iApi = new IntegrationApi(apiClient);
        verifyProfileAttributeCanBeCleared(iApi);

        // Creating a cart item object
        CartItem cartItem = new CartItem();
        cartItem.setName("Hawaiian Pizza");
        cartItem.setSku("pizza-x");
        cartItem.setQuantity(1L);
        cartItem.setPrice(new java.math.BigDecimal("5.5"));

        // Creating a customer session of V2
        NewCustomerSessionV2 customerSession = new NewCustomerSessionV2();
        customerSession.setProfileId("Cool_Dude");
        customerSession.addCouponCodesItem("Cool-Summer!");
        customerSession.addCartItemsItem(cartItem);

        // Initiating integration request wrapping the customer session update
        IntegrationRequest request = new IntegrationRequest()
                .customerSession(customerSession)
                // Optional parameter of requested information to be present on the response
                // related to the customer session update
                .responseContent(Arrays.asList(
                        IntegrationRequest.ResponseContentEnum.CUSTOMER_SESSION,
                        IntegrationRequest.ResponseContentEnum.CUSTOMER_PROFILE));

        // Flag to communicate whether the request is a "dry run"
        Boolean dryRun = false;

        // Create/update a customer session using `updateCustomerSessionV2` function
        IntegrationStateV2 is = iApi.updateCustomerSessionV2(
                "deetdoot",
                request,
                dryRun,
                null,
                null);
        System.out.println(is.toString());

        // Parsing the returned effects list, please consult
        // https://developers.talon.one/Integration-API/handling-effects-v2 for the full
        // list of effects and their corresponding properties
        for (Effect eff : is.getEffects()) {
            if (eff.getSchemaType().equals("addLoyaltyPoints")) {
                // Typecasting according to the specific effect type
                AddLoyaltyPointsEffectProps props = gson.fromJson(
                        gson.toJson(eff.getEffectAddLoyaltyPoints().getProps()),
                        AddLoyaltyPointsEffectProps.class);
                // Access the specific effect's properties
                System.out.println(props.getName());
                System.out.println(props.getProgramId());
                System.out.println(props.getValue());
            }
            if (eff.getSchemaType().equals("acceptCoupon")) {
                // Typecasting according to the specific effect type
                AcceptCouponEffectProps props = gson.fromJson(
                        gson.toJson(eff.getEffectAcceptCoupon().getProps()),
                        AcceptCouponEffectProps.class);
                // work with AcceptCouponEffectProps' properties
                // ...
            }
        }
    }

    private static void verifyProfileAttributeCanBeCleared(IntegrationApi iApi) throws Exception {
        // Regression for issue #30: clearing an attribute must remove its previously stored value.
        String profileId = "java-sdk-null-attribute-" + UUID.randomUUID();
        String attributeName = "Name"; // Built-in customer profile attribute; no custom setup needed.
        String initialValue = "Java SDK null attribute regression";
        Map<String, Object> attributes = new LinkedHashMap<>();
        attributes.put(attributeName, initialValue);
        iApi.updateCustomerProfileV2(profileId,
                new CustomerProfileIntegrationRequestV2().attributes(attributes), false, null, null);

        CustomerProfile before = iApi.getCustomerInventory(
                profileId, true, false, false, false, false, false, false).getProfile();
        if (before == null || before.getAttributes() == null
                || !initialValue.equals(before.getAttributes().get(attributeName))) {
            throw new IllegalStateException("Profile attribute was not stored before clearing it");
        }

        attributes.put(attributeName, null);
        iApi.updateCustomerProfileV2(profileId,
                new CustomerProfileIntegrationRequestV2().attributes(attributes), false, null, null);

        CustomerProfile after = iApi.getCustomerInventory(
                profileId, true, false, false, false, false, false, false).getProfile();
        if (after == null) {
            throw new IllegalStateException("Customer profile was not returned after clearing its attribute");
        }
        // Cleared attributes are removed from the stored map, so get() must return null.
        if (after.getAttributes() != null && after.getAttributes().get(attributeName) != null) {
            throw new IllegalStateException("Profile attribute still has a value after being set to null: "
                    + after.getAttributes().get(attributeName));
        }
        System.out.println("Profile attribute successfully cleared: " + profileId);
    }
}
