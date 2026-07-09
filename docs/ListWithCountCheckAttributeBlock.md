

# ListWithCountCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that test list membership with a minimum or exact count threshold.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | The list membership operator with a count threshold applied to the attribute. |  [optional] |
|**values** | **Object** |  |  |
|**count** | **Object** |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| CONTAINS_AT_LEAST | &quot;containsAtLeast&quot; |
| CONTAINS_EXACTLY | &quot;containsExactly&quot; |



