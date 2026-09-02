

# CheckLoyaltyBalanceBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the block compares the balance to the value. |  |
|**program** | [**CheckLoyaltyBalanceBlock1Program**](CheckLoyaltyBalanceBlock1Program.md) |  |  |
|**subledger** | **String** | The name of the subledger to check the balance of. Can be empty if this block checks the loyalty program&#39;s main ledger balance instead of a subledger. |  |
|**balance** | [**BalanceEnum**](#BalanceEnum) | The type of balance to check:  - &#x60;current&#x60; is the sum of currently active points  - &#x60;pending&#x60; is the sum of pending points.  - &#x60;negative&#x60; is the sum of negative points.  - &#x60;tentativeCurrent&#x60; is the tentative points balance within the current open customer session. |  |
|**value** | **BigDecimal** | The numeric value to compare the balance against. |  |
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



## Enum: BalanceEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;current&quot; |
| PENDING | &quot;pending&quot; |
| NEGATIVE | &quot;negative&quot; |
| TENTATIVE_CURRENT | &quot;tentativeCurrent&quot; |



