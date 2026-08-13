

# SelectorStep

A single step in a selector item pipeline. The `type` field determines the step variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A step discriminator of type &#x60;filter&#x60;. |  |
|**predicate** | [**SelectorBlock**](SelectorBlock.md) |  |  |
|**fields** | [**List&lt;SortSelectorStepField&gt;**](SortSelectorStepField.md) | One or more fields to sort by, applied in order. Each field has its own direction. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The aggregation operator applied to the items produced by the preceding step: - &#x60;max&#x60;, &#x60;min&#x60;, and &#x60;sum&#x60; operate on numeric values. - &#x60;count&#x60; returns the number of items. - &#x60;empty&#x60; reports whether the list is empty.  |  |
|**from** | [**SelectSelectorStepFrom**](SelectSelectorStepFrom.md) |  |  [optional] |
|**to** | **Integer** | The end index for the &#x60;between&#x60; operator. The item at this index is not included. |  [optional] |
|**count** | **Integer** | The maximum number of items to select for the &#x60;many&#x60; operator. |  [optional] |
|**index** | **Integer** | The exact position of the item to select for the &#x60;one&#x60; operator. |  [optional] |
|**partial** | **Boolean** | Indicates if the step returns fewer items than requested when the source list is shorter than the range needs. Always &#x60;true&#x60; for the &#x60;many&#x60; and &#x60;between&#x60; operators; not present for &#x60;one&#x60;, which fails instead of returning a partial result. |  [optional] |
|**expression** | **String** | The attribute path each item is mapped to. |  |
|**valueMap** | [**SelectorValueMapRef**](SelectorValueMapRef.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILTER | &quot;filter&quot; |
| SORT | &quot;sort&quot; |
| SELECT | &quot;select&quot; |
| MAP | &quot;map&quot; |
| REDUCE | &quot;reduce&quot; |
| REVERSE | &quot;reverse&quot; |
| FILTER_AND_MAP_VALUES | &quot;filterAndMapValues&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| MAX | &quot;max&quot; |
| MIN | &quot;min&quot; |
| SUM | &quot;sum&quot; |
| COUNT | &quot;count&quot; |
| EMPTY | &quot;empty&quot; |



