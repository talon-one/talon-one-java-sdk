

# Reward


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**accountId** | **Long** | The ID of the account that owns this entity. |  |
|**name** | **String** | The name of the reward. |  |
|**apiName** | **String** | A unique identifier used to reference the reward in API integrations. |  |
|**description** | **String** | A description of the reward. |  [optional] |
|**applicationIds** | **List&lt;Long&gt;** | The IDs of the Applications this reward is connected to.   **Note**: Currently, a reward can only be connected to one Application.  |  |
|**sandbox** | **Boolean** | Indicates if this is a live or sandbox reward. Rewards of a given type can only be connected to Applications of the same type. |  |
|**visibilityConditions** | [**Rule**](Rule.md) | An optional rule that manages who can see this reward. If not specified, the reward is visible to all customers.  **Note:** Only the &#x60;condition&#x60; field is evaluated within this rule. The &#x60;effects&#x60; field must be an empty array, and &#x60;bindings&#x60; are not supported.  |  [optional] |
|**rule** | [**Rule**](Rule.md) | Rule to apply.  **Note**: The &#x60;bindings&#x60; field inside the rule must not be used in this endpoint. All bindings should be defined at the reward level via the top-level &#x60;bindings&#x60; field.  |  [optional] |
|**bindings** | [**List&lt;Binding&gt;**](Binding.md) | A list of named variables created before the reward&#39;s rules are evaluated.  Each binding pairs a name with a talang expression. The expression is evaluated once  and its result is available by name in any rule condition or effect. Bindings must be defined outside of individual rules. |  [optional] |
|**modified** | **OffsetDateTime** | The timestamp when the reward was last updated in RFC3339 format. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the reward. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



