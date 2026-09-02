

# CheckAudienceBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares its elements. |  |
|**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to check against the audience. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. |  |
|**audience** | [**CheckAudienceBlock1Audience**](CheckAudienceBlock1Audience.md) |  |  |
|**onFailure** | [**List&lt;Block&gt;**](Block.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |
| NOT_MEMBER_ | &quot;not(member)&quot; |
| JUST_JOINED | &quot;justJoined&quot; |
| JUST_LEFT | &quot;justLeft&quot; |



## Enum: ProfileEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;Current&quot; |
| ADVOCATE | &quot;Advocate&quot; |



