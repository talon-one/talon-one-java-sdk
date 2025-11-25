

# ApplicationCampaignAnalytics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **OffsetDateTime** | The start of the aggregation time frame in UTC. |  |
|**endTime** | **OffsetDateTime** | The end of the aggregation time frame in UTC. |  |
|**campaignId** | **Long** | The ID of the campaign. |  |
|**campaignName** | **String** | The name of the campaign. |  |
|**campaignTags** | **List&lt;String&gt;** | A list of tags for the campaign. |  |
|**campaignState** | [**CampaignStateEnum**](#CampaignStateEnum) | The state of the campaign.  **Note:** A disabled or archived campaign is not evaluated for rules or coupons.  |  |
|**totalRevenue** | [**AnalyticsDataPointWithTrendAndInfluencedRate**](AnalyticsDataPointWithTrendAndInfluencedRate.md) | The total, pre-discount value of all items purchased in a customer session. |  [optional] |
|**sessionsCount** | [**AnalyticsDataPointWithTrendAndInfluencedRate**](AnalyticsDataPointWithTrendAndInfluencedRate.md) | The number of all closed sessions. The &#x60;influenced&#x60; value includes only sessions with at least one applied effect. |  [optional] |
|**avgItemsPerSession** | [**AnalyticsDataPointWithTrendAndUplift**](AnalyticsDataPointWithTrendAndUplift.md) | The number of items from sessions divided by the number of sessions. The &#x60;influenced&#x60; value includes only sessions with at least one applied effect. |  [optional] |
|**avgSessionValue** | [**AnalyticsDataPointWithTrendAndUplift**](AnalyticsDataPointWithTrendAndUplift.md) | The average customer session value, calculated by dividing the revenue value by the number of sessions. The &#x60;influenced&#x60; value includes only sessions with at least one applied effect. |  [optional] |
|**totalDiscounts** | [**AnalyticsDataPointWithTrend**](AnalyticsDataPointWithTrend.md) | The total value of discounts given for cart items in influenced sessions. |  [optional] |
|**couponsCount** | [**AnalyticsDataPointWithTrend**](AnalyticsDataPointWithTrend.md) | The number of times a coupon was successfully redeemed in influenced sessions. |  [optional] |



## Enum: CampaignStateEnum

| Name | Value |
|---- | -----|
| EXPIRED | &quot;expired&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| RUNNING | &quot;running&quot; |
| DISABLED | &quot;disabled&quot; |
| ARCHIVED | &quot;archived&quot; |
| STAGED | &quot;staged&quot; |



