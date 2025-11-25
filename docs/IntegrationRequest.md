

# IntegrationRequest

The body of a V2 integration API request (customer session update). Next to the customer session details, this contains an optional listing of extra properties that should be returned in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerSession** | [**NewCustomerSessionV2**](NewCustomerSessionV2.md) | The customer session update details. |  |
|**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Extends the response with the chosen data entities. Use this property to get as much data as you need in one _Update customer session_ request instead of sending extra requests to other endpoints.  **Note:** To retrieve loyalty card details, your request must include a loyalty card ID.  |  [optional] |



## Enum: List&lt;ResponseContentEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMER_SESSION | &quot;customerSession&quot; |
| CUSTOMER_PROFILE | &quot;customerProfile&quot; |
| COUPONS | &quot;coupons&quot; |
| TRIGGERED_CAMPAIGNS | &quot;triggeredCampaigns&quot; |
| REFERRAL | &quot;referral&quot; |
| LOYALTY | &quot;loyalty&quot; |
| EVENT | &quot;event&quot; |
| AWARDED_GIVEAWAYS | &quot;awardedGiveaways&quot; |
| RULE_FAILURE_REASONS | &quot;ruleFailureReasons&quot; |
| PREVIOUS_RETURNS | &quot;previousReturns&quot; |



