

# CampaignEvaluationGroup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applicationId** | **Long** | The ID of the Application that owns this entity. |  |
|**name** | **String** | The name of the campaign evaluation group. |  |
|**parentId** | **Long** | The ID of the parent group that contains the campaign evaluation group. |  |
|**description** | **String** | A description of the campaign evaluation group. |  [optional] |
|**evaluationMode** | [**EvaluationModeEnum**](#EvaluationModeEnum) | The mode by which campaigns in the campaign evaluation group are evaluated. |  |
|**evaluationScope** | [**EvaluationScopeEnum**](#EvaluationScopeEnum) | The evaluation scope of the campaign evaluation group. |  |
|**locked** | **Boolean** | An indicator of whether the campaign evaluation group is locked for modification. |  |
|**id** | **Long** | Unique ID for this entity. Not to be confused with the Integration ID, which is set by your integration layer and used in most endpoints. |  |



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



