

# IntegrationUnlockRewardRequest

The request body for unlocking a reward for a customer profile, optionally using the balance of one of the customer's loyalty cards. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integrationId** | **String** | The integration ID to assign to the created customer reward unlock. |  |
|**profileIntegrationId** | **String** | The integration ID of the customer profile unlocking the reward. |  |
|**cardIdentifier** | **String** | The identifier of the loyalty card unlocking the reward. When provided, the required points are deducted from the card&#39;s balance and the unlocked reward belongs to the card, which makes it available to all customer profiles linked to that card. The customer profile given in &#x60;profileIntegrationId&#x60; must be linked to the card, and the card must be active. |  [optional] |
|**loyaltyProgramId** | **Long** | The ID of the loyalty program from which points will be deducted. Required when the reward has &#x60;pointsRequired&#x60; configured. |  [optional] |
|**subledgerId** | **String** | The ID of the subledger from which points will be deducted. Required when the reward has &#x60;pointsRequired&#x60; configured.  To specify the main ledger, provide an empty string (\&quot;\&quot;).  |  [optional] |
|**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Determines which data is included in the response. Add any of the following optional values to the array to get that data in the response: &#x60;customerProfile&#x60;, &#x60;ruleFailureReasons&#x60;, &#x60;loyalty&#x60;. &#x60;effects&#x60; is always returned regardless of whether it is included here. |  [optional] |



## Enum: List&lt;ResponseContentEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMER_PROFILE | &quot;customerProfile&quot; |
| EFFECTS | &quot;effects&quot; |
| RULE_FAILURE_REASONS | &quot;ruleFailureReasons&quot; |
| LOYALTY | &quot;loyalty&quot; |



