

# WebhookAuthentication


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**modified** | **OffsetDateTime** | The time this entity was last modified. |  |
|**createdBy** | **String** | The name of the user who created the webhook authentication. |  |
|**modifiedBy** | **String** | The name of the user who last modified the webhook authentication. |  |
|**webhooks** | [**List&lt;WebhookAuthenticationWebhookRef&gt;**](WebhookAuthenticationWebhookRef.md) |  |  |
|**name** | **String** | The name of the webhook authentication. |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**data** | **Object** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;basic&quot; |
| CUSTOM | &quot;custom&quot; |



