

# PassthroughBlock

A block representing a Talang expression that could not be mapped to a typed block. The expression is preserved in its raw Talang array form for diagnostic and round-trip purposes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type discriminator for this block. |  |
|**expression** | **List&lt;Object&gt;** | The raw Talang expression as an array. The first element is the function name; subsequent elements are its arguments, which may themselves be nested expressions. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PASSTHROUGH | &quot;passthrough&quot; |



