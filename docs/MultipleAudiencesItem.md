

# MultipleAudiencesItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**name** | **String** | The human-friendly display name for this audience. |  |
|**subscribedApplicationsIds** | **Set&lt;Long&gt;** | A list of the IDs of the Applications that are connected to this audience. |  [optional] |
|**integrationId** | **String** | The ID of this audience in the third-party integration. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether the audience is new, updated or unmodified by the request.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNMODIFIED | &quot;unmodified&quot; |
| UPDATED | &quot;updated&quot; |
| NEW | &quot;new&quot; |



