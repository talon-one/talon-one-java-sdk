

# UpdateReward


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the reward. |  |
|**description** | **String** | A description of the reward. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the reward. |  |
|**rule** | [**List&lt;Rule&gt;**](Rule.md) | Rule to apply.  **Note**: The &#x60;bindings&#x60; field inside the rule must not be used in this endpoint. All bindings should be defined at the reward level via the top-level &#x60;bindings&#x60; field.  |  [optional] |
|**bindings** | [**List&lt;Binding&gt;**](Binding.md) | A list of named variables created before the reward&#39;s rules are evaluated.  Each binding pairs a name with a talang expression. The expression is evaluated once  and its result is available by name in any rule condition or effect. Bindings must be defined outside of individual rules. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



