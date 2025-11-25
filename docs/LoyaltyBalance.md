

# LoyaltyBalance

Point balance of a ledger in the Loyalty Program.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activePoints** | **BigDecimal** | Total amount of points awarded to this customer and available to spend. |  [optional] |
|**pendingPoints** | **BigDecimal** | Total amount of points awarded to this customer but not available until their start date. |  [optional] |
|**spentPoints** | **BigDecimal** | Total amount of points already spent by this customer. |  [optional] |
|**expiredPoints** | **BigDecimal** | Total amount of points awarded but never redeemed. They cannot be used anymore. |  [optional] |
|**negativePoints** | **BigDecimal** | Total amount of negative points. This implies that &#x60;activePoints&#x60; is &#x60;0&#x60;. |  [optional] |



