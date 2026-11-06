

# History


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The ID of the price record. |  |
|**observedAt** | **OffsetDateTime** | The date and time from which the price record is effective. |  |
|**contextIds** | **List&lt;String&gt;** | The identifiers of the relevant context (the sales events, e.g. \&quot;Spring Sale\&quot;, \&quot;Summer Sale\&quot;) at the time from which the price record is effective. Includes the context IDs of any price adjustments and of the campaigns that influenced the final price.  |  |
|**price** | **BigDecimal** | Price of the item. |  |
|**metadata** | [**BestPriorPriceMetadata**](BestPriorPriceMetadata.md) |  |  |
|**target** | [**LabelTarget**](LabelTarget.md) |  |  |
|**excludedAt** | **OffsetDateTime** | The date and time when the price record was excluded. |  [optional] |
|**exclusionReason** | **String** | The reason for excluding this price record. |  [optional] |



