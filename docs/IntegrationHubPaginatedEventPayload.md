

# IntegrationHubPaginatedEventPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalResultSize** | **Long** |  |  |
|**batchedAt** | **OffsetDateTime** | Timestamp when the batch was created. |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**data** | **List&lt;Object&gt;** |  |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_POINTS_CHANGED | &quot;LoyaltyPointsChanged&quot; |
| LOYALTY_TIER_DOWNGRADE | &quot;LoyaltyTierDowngrade&quot; |
| LOYALTY_TIER_UPGRADE | &quot;LoyaltyTierUpgrade&quot; |
| COUPON_CREATED | &quot;CouponCreated&quot; |
| COUPON_UPDATED | &quot;CouponUpdated&quot; |
| COUPON_DELETED | &quot;CouponDeleted&quot; |



