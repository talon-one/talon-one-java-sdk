

# CheckAttributeBlockBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The comparison operator applied to the attribute. |  |
|**attribute** | **Object** | The attribute path identifier (e.g. \&quot;$Session.Total\&quot;). |  |
|**value** | **Object** | The comparison value for scalar operators. |  [optional] |
|**min** | **Object** | The minimum value allowed for the &#x60;between&#x60; operator. |  [optional] |
|**max** | **Object** | The maximum value allowed for the &#x60;between&#x60; operator. |  [optional] |
|**start** | **Object** | The start value for the &#x60;within&#x60; operator. |  [optional] |
|**end** | **Object** | The end value for the &#x60;within&#x60; operator. |  [optional] |
|**startInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;start&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**endInclusive** | **Boolean** | When &#x60;true&#x60;, the &#x60;end&#x60; value is included in the range for the &#x60;within&#x60; operator. |  [optional] |
|**timezoneInsensitive** | **Boolean** | Indicates whether the &#x60;within&#x60; operator ignores time zones and compares the wall-clock time only. When &#x60;false&#x60;, time zones are taken into account. |  [optional] |
|**values** | **Object** | The set of values to match against for list operators. For location operators (&#x60;in&#x60;, &#x60;not(in)&#x60;), an array of objects with a &#x60;geometry&#x60; (see &#x60;GeoJSONGeometry&#x60;) and an optional &#x60;name&#x60;, or a string reference to a list attribute. |  [optional] |
|**count** | **Object** | The count threshold for &#x60;containsAtLeast&#x60; and &#x60;containsExactly&#x60; operators. |  [optional] |
|**onFailure** | [**List&lt;Block&gt;**](Block.md) | Promotion blocks evaluated when this block fails or returns false. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUALS | &quot;equals&quot; |
| NOT_EQUALS_ | &quot;not(equals)&quot; |
| LESS_THAN | &quot;lessThan&quot; |
| LESS_THAN_OR_EQUAL | &quot;lessThanOrEqual&quot; |
| GREATER_THAN | &quot;greaterThan&quot; |
| GREATER_THAN_OR_EQUAL | &quot;greaterThanOrEqual&quot; |
| BETWEEN | &quot;between&quot; |
| CONTAINS | &quot;contains&quot; |
| NOT_CONTAINS_ | &quot;not(contains)&quot; |
| MATCHES_REGEXP | &quot;matchesRegexp&quot; |
| STARTS_WITH | &quot;startsWith&quot; |
| ENDS_WITH | &quot;endsWith&quot; |
| ONE_OF | &quot;oneOf&quot; |
| NOT_ONE_OF_ | &quot;not(oneOf)&quot; |
| IN_COLLECTION | &quot;inCollection&quot; |
| NOT_IN_COLLECTION_ | &quot;not(inCollection)&quot; |
| EMPTY | &quot;empty&quot; |
| NOT_EMPTY_ | &quot;not(empty)&quot; |
| EXISTS | &quot;exists&quot; |
| NOT_EXISTS_ | &quot;not(exists)&quot; |
| IS_TRUE | &quot;isTrue&quot; |
| IS_FALSE | &quot;isFalse&quot; |
| CONTAINS_AT_LEAST | &quot;containsAtLeast&quot; |
| CONTAINS_EXACTLY | &quot;containsExactly&quot; |
| CONTAINS_ONE_OF | &quot;containsOneOf&quot; |
| CONTAINS_NONE_OF | &quot;containsNoneOf&quot; |
| CONTAINS_ALL_OF | &quot;containsAllOf&quot; |
| AFTER | &quot;after&quot; |
| BEFORE | &quot;before&quot; |
| WITHIN | &quot;within&quot; |
| NOT_WITHIN_ | &quot;not(within)&quot; |
| IN | &quot;in&quot; |
| NOT_IN_ | &quot;not(in)&quot; |



