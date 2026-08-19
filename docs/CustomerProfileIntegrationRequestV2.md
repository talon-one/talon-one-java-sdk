

# CustomerProfileIntegrationRequestV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | **Map&lt;String, Object&gt;** | Arbitrary properties associated with this item. |  [optional] |
|**evaluableCampaignIds** | **List&lt;Long&gt;** | When using the &#x60;dry&#x60; query parameter, use this property to list the campaign to be evaluated by the Rule Engine.  These campaigns will be evaluated, even if they are disabled, allowing you to test specific campaigns before activating them.  |  [optional] |
|**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Extends the response with the chosen data entities. Use this property to get as much data back as needed from one request instead of sending extra requests to other endpoints.  |  [optional] |
|**audiencesChanges** | [**ProfileAudiencesChanges**](ProfileAudiencesChanges.md) | Audiences memberships changes for this profile. |  [optional] |



## Enum: List&lt;ResponseContentEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMER_PROFILE | &quot;customerProfile&quot; |
| TRIGGERED_CAMPAIGNS | &quot;triggeredCampaigns&quot; |
| LOYALTY | &quot;loyalty&quot; |
| EVENT | &quot;event&quot; |
| AWARDED_GIVEAWAYS | &quot;awardedGiveaways&quot; |
| RULE_FAILURE_REASONS | &quot;ruleFailureReasons&quot; |
| CAMPAIGN_ELIGIBILITY | &quot;campaignEligibility&quot; |
| ACHIEVEMENTS | &quot;achievements&quot; |
| UNLOCKED_REWARDS | &quot;unlockedRewards&quot; |



