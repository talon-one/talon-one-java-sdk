

# ScalarCheckAttributeBlock

Variant of `CheckAttributeBlock` for operators that compare an attribute against a single value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the attribute. |  [optional] |
|**value** | **Object** |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;equals&quot; |
| NOT_EQUALS_ | &quot;not(equals)&quot; |
| LESS_THAN | &quot;lessThan&quot; |
| LESS_THAN_OR_EQUAL | &quot;lessThanOrEqual&quot; |
| GREATER_THAN | &quot;greaterThan&quot; |
| GREATER_THAN_OR_EQUAL | &quot;greaterThanOrEqual&quot; |
| CONTAINS | &quot;contains&quot; |
| NOT_CONTAINS_ | &quot;not(contains)&quot; |
| MATCHES_REGEXP | &quot;matchesRegexp&quot; |
| STARTS_WITH | &quot;startsWith&quot; |
| ENDS_WITH | &quot;endsWith&quot; |
| ONE_OF | &quot;oneOf&quot; |
| NOT_ONE_OF_ | &quot;not(oneOf)&quot; |
| IN_COLLECTION | &quot;inCollection&quot; |
| NOT_IN_COLLECTION_ | &quot;not(inCollection)&quot; |



