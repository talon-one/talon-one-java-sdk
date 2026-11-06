

# BestPriorPrice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the price record. |  |
|**sku** | **String** | sku |  |
|**observedAt** | **OffsetDateTime** | The date and time when the price change was recorded. |  |
|**contextIds** | **List&lt;String&gt;** | The identifiers of the relevant context (the sales events, e.g. \&quot;Spring Sale\&quot;, \&quot;Summer Sale\&quot;) at the time the price change was recorded. Includes the context IDs of any price adjustments and of the campaigns that influenced the final price.  |  |
|**price** | **BigDecimal** | Price of the item. |  |
|**metadata** | [**BestPriorPriceMetadata**](BestPriorPriceMetadata.md) |  |  |
|**target** | [**LabelTarget**](LabelTarget.md) |  |  |



