

# ListCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that test list membership against a set of values.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | The list membership operator applied to the attribute. |  [optional] |
|**values** | **Object** |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| CONTAINS_ONE_OF | &quot;containsOneOf&quot; |
| CONTAINS_NONE_OF | &quot;containsNoneOf&quot; |
| CONTAINS_ALL_OF | &quot;containsAllOf&quot; |



