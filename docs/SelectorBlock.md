

# SelectorBlock

A predicate block valid inside a selector filter step. The `type` field determines the block variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  |
|**type** | [**TypeEnum**](#TypeEnum) | A block discriminator of type &#x60;group&#x60;. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | Logical operator applied across child blocks. &#x60;all&#x60; requires every child to pass, &#x60;atLeastOne&#x60; requires at least one, &#x60;none&#x60; requires all to fail. |  |
|**blocks** | [**List&lt;SelectorBlock&gt;**](SelectorBlock.md) | Child predicate blocks evaluated according to the operator. |  |
|**expression** | **List&lt;Object&gt;** | The raw Talang expression as an array. For a function call, the first element is the function name and subsequent elements are its arguments. For any other expression (for example a bare attribute path or a literal value), this is a single-element array containing that value. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |
| PASSTHROUGH | &quot;passthrough&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| AT_LEAST_ONE | &quot;atLeastOne&quot; |
| NONE | &quot;none&quot; |



