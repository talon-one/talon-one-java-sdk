

# PromotionBlock

Describes a part of the logic of the rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares its elements. |  |
|**blocks** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Child blocks evaluated according to the operator. |  |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |
|**onError** | **Map&lt;String, List&lt;PromotionBlock&gt;&gt;** | Named error handlers evaluated when a specific error occurs. |  [optional] |
|**name** | **String** | A custom description recorded as the reason for the point deduction. |  |
|**value** | [**RedeemLoyaltyPointsBlock1Value**](RedeemLoyaltyPointsBlock1Value.md) |  |  |
|**partial** | **Boolean** | When set to &#x60;true&#x60;, applies a partial item reward if the remaining budget is insufficient to award the full reward. |  |
|**target** | [**TriggerCustomEffectBlock1Target**](TriggerCustomEffectBlock1Target.md) |  |  |
|**expression** | **List&lt;Object&gt;** | The raw Talang expression as an array. For a function call, the first element is the function name and subsequent elements are its arguments. For any other expression (for example a bare attribute path or a literal value), this is a single-element array containing that value. |  |
|**notificationType** | **String** | The type of notification to display. |  |
|**title** | **String** | The notification heading shown to the customer. |  |
|**body** | **String** | The notification body text. Supports template placeholders (e.g. \&quot;{{$Session.Total}}\&quot;) evaluated at rule execution time. |  [optional] |
|**sku** | **String** | The stock keeping unit of the item to award. |  |
|**quantity** | **String** | The number of items to award. Supports template placeholders (e.g. \&quot;{{$Session.Total / 2}}\&quot;) for dynamic quantities. |  |
|**giveawayPool** | [**AwardGiveawayBlock1GiveawayPool**](AwardGiveawayBlock1GiveawayPool.md) |  |  |
|**profile** | [**ProfileEnum**](#ProfileEnum) | The customer profile to add or remove from the audience. &#x60;Current&#x60; targets the customer in the current session; &#x60;Advocate&#x60; targets the person who invited their friend via referral program. |  |
|**attribute** | [**UpdateAttributeValueBlock1Attribute**](UpdateAttributeValueBlock1Attribute.md) |  |  |
|**min** | **Object** |  |  [optional] |
|**max** | **Object** |  |  [optional] |
|**start** | **Object** |  |  [optional] |
|**end** | **Object** |  |  [optional] |
|**startInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;start&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**endInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;end&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**timezoneInsensitive** | **Boolean** | Indicates whether the &#x60;within&#x60; operator ignores time zones and compares the wall-clock time only. When &#x60;false&#x60;, time zones are taken into account. |  [optional] |
|**values** | **Object** |  |  [optional] |
|**count** | **Object** |  |  [optional] |
|**audience** | [**UpdateAudienceMembershipBlock1Audience**](UpdateAudienceMembershipBlock1Audience.md) |  |  |
|**program** | [**RedeemLoyaltyPointsBlock1Program**](RedeemLoyaltyPointsBlock1Program.md) |  |  |
|**subledger** | **String** | The name of the subledger to deduct points from. Can be empty if this block deducts from the loyalty program&#39;s main ledger instead of a subledger. |  |
|**balance** | [**BalanceEnum**](#BalanceEnum) | The type of balance to check:  - &#x60;current&#x60; is the sum of currently active points  - &#x60;pending&#x60; is the sum of pending points.  - &#x60;negative&#x60; is the sum of negative points.  - &#x60;tentativeCurrent&#x60; is the tentative points balance within the current open customer session. |  |
|**redeem** | **Boolean** | When &#x60;true&#x60;, the referral code is redeemed. |  |
|**achievement** | [**CheckAchievementBlock1Achievement**](CheckAchievementBlock1Achievement.md) |  |  |
|**webhook** | [**TriggerWebhookBlock1Webhook**](TriggerWebhookBlock1Webhook.md) |  |  |
|**params** | **Map&lt;String, Object&gt;** | The custom effect&#39;s parameters, in configured order. Each property name is the parameter&#39;s title, lowercased with spaces replaced by underscores (for example, &#x60;Order ID&#x60; becomes &#x60;order_id&#x60;); falls back to &#x60;param_0&#x60;, &#x60;param_1&#x60;, and so on if a title is blank or collides with another. |  [optional] |
|**customEffect** | [**TriggerCustomEffectBlock1CustomEffect**](TriggerCustomEffectBlock1CustomEffect.md) |  |  |
|**eventType** | **String** | The event type to check against. |  |
|**matchers** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) |  |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The limitable action to check. |  |
|**campaignId** | [**CreateReferralBlock1CampaignId**](CreateReferralBlock1CampaignId.md) |  |  |
|**recipientId** | **String** | The integration ID of the customer that is allowed to redeem this coupon. |  |
|**storeInSession** | **Boolean** | When &#x60;true&#x60;, the referral code is stored in the session. |  |
|**usageLimit** | [**CreateReferralBlock1UsageLimit**](CreateReferralBlock1UsageLimit.md) |  |  [optional] |
|**discountLimit** | [**CreateCouponBlock1DiscountLimit**](CreateCouponBlock1DiscountLimit.md) |  |  [optional] |
|**startDate** | **Object** |  |  [optional] |
|**expiryDate** | **Object** |  |  [optional] |
|**attributes** | **Object** |  |  [optional] |
|**validCharacters** | **String** | Characters used to generate the random parts of a code. |  [optional] |
|**pattern** | **String** | The pattern used to generate codes, such as coupon codes, referral codes, and loyalty cards. The character &#x60;#&#x60; is a placeholder and is replaced by a random character from the &#x60;validCharacters&#x60; set.  |  [optional] |
|**friendId** | **String** | An optional integration ID of the friend&#39;s profile. |  |
|**tier** | [**CheckTierBlock1Tier**](CheckTierBlock1Tier.md) |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |
| NOT_MEMBER_ | &quot;not(member)&quot; |



## Enum: ProfileEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;Current&quot; |
| ADVOCATE | &quot;Advocate&quot; |



## Enum: BalanceEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;current&quot; |
| PENDING | &quot;pending&quot; |
| NEGATIVE | &quot;negative&quot; |
| TENTATIVE_CURRENT | &quot;tentativeCurrent&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| REDEEM_COUPON | &quot;redeemCoupon&quot; |
| REDEEM_REFERRAL | &quot;redeemReferral&quot; |
| SET_DISCOUNT | &quot;setDiscount&quot; |
| CREATE_COUPON | &quot;createCoupon&quot; |
| CREATE_REFERRAL | &quot;createReferral&quot; |
| SET_DISCOUNT_EFFECT | &quot;setDiscountEffect&quot; |
| CREATE_LOYALTY_POINTS | &quot;createLoyaltyPoints&quot; |
| CREATE_LOYALTY_POINTS_EFFECT | &quot;createLoyaltyPointsEffect&quot; |
| REDEEM_LOYALTY_POINTS | &quot;redeemLoyaltyPoints&quot; |
| REDEEM_LOYALTY_POINTS_EFFECT | &quot;redeemLoyaltyPointsEffect&quot; |
| AWARD_GIVEAWAY | &quot;awardGiveaway&quot; |
| ADD_FREE_ITEM_EFFECT | &quot;addFreeItemEffect&quot; |
| CUSTOM_EFFECT | &quot;customEffect&quot; |
| CALL_API | &quot;callApi&quot; |



