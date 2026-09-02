

# GeoJSONMultiPolygon

One or more separate shapes grouped together as a single location, following the GeoJSON format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The geometry type discriminator. |  |
|**coordinates** | **List&lt;List&lt;List&lt;List&lt;BigDecimal&gt;&gt;&gt;&gt;** | The shapes in this group. Each one follows the same boundary structure as a polygon. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MULTI_POLYGON | &quot;MultiPolygon&quot; |



