

# CampaignSetBranchNode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the node type. |  |
|**name** | **String** | Name of the set. |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | An indicator of how the set operates on its elements. |  |
|**elements** | [**List&lt;CampaignSetNode&gt;**](CampaignSetNode.md) | Child elements of this set. |  |
|**groupId** | **Long** | The ID of the campaign set. |  |
|**locked** | **Boolean** | An indicator of whether the campaign set is locked for modification. |  |
|**description** | **String** | A description of the campaign set. |  [optional] |
|**evaluationMode** | [**EvaluationModeEnum**](#EvaluationModeEnum) | The mode by which campaigns in the campaign evaluation group are evaluated. |  |
|**evaluationScope** | [**EvaluationScopeEnum**](#EvaluationScopeEnum) | The evaluation scope of the campaign evaluation group. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SET | &quot;SET&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| FIRST | &quot;FIRST&quot; |



## Enum: EvaluationModeEnum

| Name | Value |
|---- | -----|
| STACKABLE | &quot;stackable&quot; |
| LIST_ORDER | &quot;listOrder&quot; |
| LOWEST_DISCOUNT | &quot;lowestDiscount&quot; |
| HIGHEST_DISCOUNT | &quot;highestDiscount&quot; |



## Enum: EvaluationScopeEnum

| Name | Value |
|---- | -----|
| CART_ITEM | &quot;cartItem&quot; |
| SESSION | &quot;session&quot; |



