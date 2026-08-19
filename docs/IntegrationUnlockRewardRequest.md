

# IntegrationUnlockRewardRequest

The request body for unlocking a reward for a customer profile.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**integrationId** | **String** | The integration ID to assign to the created customer reward unlock. |  |
|**profileIntegrationId** | **String** | The integration ID of the customer profile unlocking the reward. |  |
|**loyaltyProgramId** | **Long** | The ID of the loyalty program from which points will be deducted. Required when the reward has &#x60;pointsRequired&#x60; configured. |  [optional] |
|**subledgerId** | **String** | The ID of the subledger from which points will be deducted. Required when the reward has &#x60;pointsRequired&#x60; configured.  To specify the main ledger, provide an empty string (\&quot;\&quot;).  |  [optional] |
|**responseContent** | **List&lt;String&gt;** | Determines which data is included in the response. Add any of the following optional values to the array to get that data in the response: &#x60;customerProfile&#x60;, &#x60;effects&#x60;, &#x60;ruleFailureReasons&#x60;, &#x60;loyalty&#x60;. |  [optional] |



