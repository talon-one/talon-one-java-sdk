

# PromotionBlock

Describes a part of the logic of the rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The update operation applied to the attribute. |  |
|**blocks** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Child blocks evaluated according to the operator. |  |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |
|**onError** | **Map&lt;String, List&lt;PromotionBlock&gt;&gt;** | Named error handlers evaluated when a specific error occurs. |  [optional] |
|**expression** | **List&lt;Object&gt;** | The raw Talang expression as an array. For a function call, the first element is the function name and subsequent elements are its arguments. For any other expression (for example a bare attribute path or a literal value), this is a single-element array containing that value. |  |
|**notificationType** | **String** | The type of notification to display. |  |
|**title** | **String** | The notification heading shown to the customer. |  |
|**body** | **String** | The notification body text. Supports template placeholders (e.g. \&quot;{{$Session.Total}}\&quot;) evaluated at rule execution time. |  [optional] |
|**sku** | **String** | The stock keeping unit of the item to award. |  |
|**name** | **String** | The display name of the item to award. |  |
|**quantity** | **String** | The number of items to award. Supports template placeholders (e.g. \&quot;{{$Session.Total / 2}}\&quot;) for dynamic quantities. |  |
|**partial** | **Boolean** | When set to &#x60;true&#x60;, applies a partial item reward if the remaining budget is insufficient to award the full reward. |  [optional] |
|**giveawayPool** | [**AwardGiveawayBlock1GiveawayPool**](AwardGiveawayBlock1GiveawayPool.md) |  |  |
|**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to add or remove from the audience. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. |  |
|**attribute** | [**UpdateAttributeValueBlock1Attribute**](UpdateAttributeValueBlock1Attribute.md) |  |  |
|**value** | **Object** |  |  |
|**min** | **Object** |  |  [optional] |
|**max** | **Object** |  |  [optional] |
|**values** | **Object** |  |  [optional] |
|**count** | **Object** |  |  [optional] |
|**audience** | [**UpdateAudienceMembershipBlock1Audience**](UpdateAudienceMembershipBlock1Audience.md) |  |  |
|**redeem** | **Boolean** | When &#x60;true&#x60;, the referral code is redeemed. |  |
|**achievement** | [**UpdateAchievementProgressBlock1Achievement**](UpdateAchievementProgressBlock1Achievement.md) |  |  |
|**target** | [**UpdateAttributeValueBlock1Target**](UpdateAttributeValueBlock1Target.md) |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| SET_TO | &quot;setTo&quot; |
| INCREASE_BY | &quot;increaseBy&quot; |
| DECREASE_BY | &quot;decreaseBy&quot; |
| MULTIPLY_BY | &quot;multiplyBy&quot; |
| DIVIDE_BY | &quot;divideBy&quot; |
| TOGGLE | &quot;toggle&quot; |
| LATER_BY | &quot;laterBy&quot; |
| EARLIER_BY | &quot;earlierBy&quot; |



## Enum: ProfileEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;Current&quot; |
| ADVOCATE | &quot;Advocate&quot; |



