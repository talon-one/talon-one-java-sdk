

# GeoJSONGeometryCollection

A group of different shapes combined into a single location, following the GeoJSON format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The geometry type discriminator. |  |
|**geometries** | [**List&lt;GeoJSONGeometry&gt;**](GeoJSONGeometry.md) | The shapes contained in this group. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GEOMETRY_COLLECTION | &quot;GeometryCollection&quot; |



