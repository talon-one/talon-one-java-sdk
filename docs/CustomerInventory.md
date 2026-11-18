

# CustomerInventory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profile** | [**CustomerProfile**](CustomerProfile.md) |  |  [optional] |
|**loyalty** | [**Loyalty**](Loyalty.md) |  |  [optional] |
|**referrals** | [**List&lt;InventoryReferral&gt;**](InventoryReferral.md) |  |  [optional] |
|**coupons** | [**List&lt;InventoryCoupon&gt;**](InventoryCoupon.md) | The coupons reserved by this profile. This array includes hard and soft reservations.  |  [optional] |
|**giveaways** | [**List&lt;Giveaway&gt;**](Giveaway.md) |  |  [optional] |
|**achievements** | [**List&lt;AchievementProgressWithDefinition&gt;**](AchievementProgressWithDefinition.md) | The customer&#39;s progress in each achievement they have participated in.  Only achievements the customer has started are included, whether they  are in progress, completed, or expired. Recurring achievements can appear  more than once, once per iteration.  |  [optional] |
|**rewards** | [**List&lt;RewardWithUnlocks&gt;**](RewardWithUnlocks.md) | The rewards that the customer has unlocked but not used. Expired customer rewards are not returned. |  [optional] |



