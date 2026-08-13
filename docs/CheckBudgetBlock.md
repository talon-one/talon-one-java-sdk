

# CheckBudgetBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the limit. &#x60;available&#x60; checks if there is budget available for a given limitable action; &#x60;enoughFor&#x60; checks if the available budget meets or exceeds a specific value limit. |  |
|**action** | [**ActionEnum**](#ActionEnum) | The limitable action to check. |  |
|**value** | **BigDecimal** | The value to check against when using the &#x60;enoughFor&#x60; operator. |  [optional] |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| ENOUGH_FOR | &quot;enoughFor&quot; |



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



