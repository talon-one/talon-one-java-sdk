

# LoyaltyDashboardData

Datapoint for the graphs and cards on a loyalty program dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | Date at which data point was collected. |  |
|**totalActivePoints** | **BigDecimal** | Total of active points for this loyalty program. |  |
|**totalPendingPoints** | **BigDecimal** | Total of pending points for this loyalty program. |  |
|**totalSpentPoints** | **BigDecimal** | Total of spent points for this loyalty program. |  |
|**totalExpiredPoints** | **BigDecimal** | Total of expired points for this loyalty program. |  |
|**totalNegativePoints** | **BigDecimal** | Total of negative points for this loyalty program. |  |
|**totalMembers** | **BigDecimal** | Number of loyalty program members. |  |
|**newMembers** | **BigDecimal** | Number of members who joined on this day. |  |
|**spentPoints** | [**LoyaltyDashboardPointsBreakdown**](LoyaltyDashboardPointsBreakdown.md) | Points spent on this day. |  |
|**earnedPoints** | [**LoyaltyDashboardPointsBreakdown**](LoyaltyDashboardPointsBreakdown.md) | Points that were earned on this day. |  |



