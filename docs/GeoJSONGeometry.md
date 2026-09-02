

# GeoJSONGeometry

A shape used to represent a geographical location. The `type` field determines the kind of shape.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The geometry type discriminator. |  |
|**coordinates** | **List&lt;List&lt;List&lt;List&lt;BigDecimal&gt;&gt;&gt;&gt;** | The shapes in this group. Each one follows the same boundary structure as a polygon. |  |
|**geometries** | [**List&lt;GeoJSONGeometry&gt;**](GeoJSONGeometry.md) | The shapes contained in this group. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINT | &quot;Point&quot; |
| POLYGON | &quot;Polygon&quot; |
| MULTI_POLYGON | &quot;MultiPolygon&quot; |
| GEOMETRY_COLLECTION | &quot;GeometryCollection&quot; |



