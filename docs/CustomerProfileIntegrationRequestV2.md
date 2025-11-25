

# CustomerProfileIntegrationRequestV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Object** | Arbitrary properties associated with this item. |  [optional] |
|**evaluableCampaignIds** | **List&lt;Long&gt;** | When using the &#x60;dry&#x60; query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them.  |  [optional] |
|**audiencesChanges** | [**ProfileAudiencesChanges**](ProfileAudiencesChanges.md) | Audiences memberships changes for this profile. |  [optional] |
|**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Extends the response with the chosen data entities. Use this property to get as much data as you need in one _Update customer profile_ request instead of sending extra requests to other endpoints.  |  [optional] |



## Enum: List&lt;ResponseContentEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMER_PROFILE | &quot;customerProfile&quot; |
| TRIGGERED_CAMPAIGNS | &quot;triggeredCampaigns&quot; |
| LOYALTY | &quot;loyalty&quot; |
| EVENT | &quot;event&quot; |
| AWARDED_GIVEAWAYS | &quot;awardedGiveaways&quot; |
| RULE_FAILURE_REASONS | &quot;ruleFailureReasons&quot; |



