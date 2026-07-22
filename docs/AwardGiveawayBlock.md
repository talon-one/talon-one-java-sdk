

# AwardGiveawayBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**giveawayPool** | [**AwardGiveawayBlock1GiveawayPool**](AwardGiveawayBlock1GiveawayPool.md) |  |  |
|**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to award the giveaway to. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. |  |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Blocks evaluated when this block fails or returns false. |  [optional] |
|**onError** | **Map&lt;String, List&lt;PromotionBlock&gt;&gt;** | Named error handlers evaluated when a specific error occurs. |  [optional] |



## Enum: ProfileEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;Current&quot; |
| ADVOCATE | &quot;Advocate&quot; |



