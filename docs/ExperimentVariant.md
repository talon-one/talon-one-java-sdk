

# ExperimentVariant


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**name** | **String** |  |  |
|**experimentId** | **Long** |  |  [optional] |
|**ruleset** | [**Ruleset**](Ruleset.md) |  |  [optional] |
|**weight** | **Long** |  |  [optional] |
|**isPrimary** | **Boolean** | **Deprecated.** Use &#x60;order&#x60; instead. Indicates whether this is the primary variant. This is computed as &#x60;order &#x3D;&#x3D; 0&#x60;.  |  [optional] |
|**order** | **Long** | The position of this variant in the experiment. The variant with &#x60;order: 0&#x60; is the primary variant.  |  [optional] |
|**audienceId** | **Long** | The ID of the audience this variant targets. Only used when the experiment &#x60;assignmentType&#x60; is &#x60;audience&#x60;.  |  [optional] |



