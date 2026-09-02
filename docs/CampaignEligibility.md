

# CampaignEligibility


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **Long** | The ID of the Application that owns this entity. |  |
|**id** | **Long** | Unique ID of Campaign. |  |
|**name** | **String** | The name of the campaign. |  |
|**description** | **String** | A detailed description of the campaign. |  [optional] |
|**startTime** | **OffsetDateTime** | Timestamp when the campaign will become active. |  [optional] |
|**endTime** | **OffsetDateTime** | Timestamp when the campaign will become inactive. |  [optional] |
|**attributes** | **Object** | Arbitrary properties associated with this campaign. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the campaign.  |  |
|**tags** | **List&lt;String&gt;** | A list of tags for the campaign. |  |
|**features** | [**List&lt;FeaturesEnum&gt;**](#List&lt;FeaturesEnum&gt;) | The features enabled in this campaign. |  |
|**eligibility** | [**List&lt;CampaignEligibilityDetails&gt;**](CampaignEligibilityDetails.md) | The customer&#39;s eligibility for each campaign in the current customer session. |  |
|**rules** | [**List&lt;RuleMetadataEligibility&gt;**](RuleMetadataEligibility.md) | A list of rules containing customer-facing details of the rewards defined in the campaign. |  |
|**experiment** | [**CampaignEligibilityExperiment**](CampaignEligibilityExperiment.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |



## Enum: List&lt;FeaturesEnum&gt;

| Name | Value |
|---- | -----|
| COUPONS | &quot;coupons&quot; |
| REFERRALS | &quot;referrals&quot; |
| LOYALTY | &quot;loyalty&quot; |
| GIVEAWAYS | &quot;giveaways&quot; |
| STRIKETHROUGH | &quot;strikethrough&quot; |
| ACHIEVEMENTS | &quot;achievements&quot; |
| ADVANCED_EVENTS | &quot;advancedEvents&quot; |



