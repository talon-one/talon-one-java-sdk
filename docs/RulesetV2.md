

# RulesetV2

Ruleset in the V2 JSON block format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | Internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**userId** | **Long** | The ID of the user that created this ruleset. |  |
|**campaignId** | **Long** | The ID of the campaign that owns this entity. |  [optional] |
|**templateId** | **Long** | The ID of the campaign template that owns this entity. |  [optional] |
|**activatedAt** | **OffsetDateTime** | Timestamp indicating when this ruleset was activated. |  [optional] |
|**promotionRules** | [**List&lt;PromotionRuleV2&gt;**](PromotionRuleV2.md) | Set of promotion rules. |  |
|**strikethroughRules** | [**List&lt;StrikethroughRuleV2&gt;**](StrikethroughRuleV2.md) | Set of strikethrough rules. |  |
|**selectors** | [**List&lt;Selector&gt;**](Selector.md) | Variable bindings of type selector. |  [optional] |
|**bundles** | [**List&lt;Bundle&gt;**](Bundle.md) | Variable bindings of type bundle. |  [optional] |
|**parameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter.md) | Variable bindings of type template parameter. |  [optional] |



