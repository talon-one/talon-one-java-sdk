

# RedeemLoyaltyPointsBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**program** | [**RedeemLoyaltyPointsBlock1Program**](RedeemLoyaltyPointsBlock1Program.md) |  |  |
|**subledger** | **String** | The name of the subledger to deduct points from. Can be empty if this block deducts from the loyalty program&#39;s main ledger instead of a subledger. |  |
|**value** | [**RedeemLoyaltyPointsBlock1Value**](RedeemLoyaltyPointsBlock1Value.md) |  |  |
|**name** | **String** | A custom description recorded as the reason for the point deduction. |  [optional] |
|**onFailure** | [**List&lt;PromotionBlock&gt;**](PromotionBlock.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



