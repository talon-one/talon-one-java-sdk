

# WebhookAuthenticationBasic

A webhook authentication that uses Basic HTTP authentication.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the webhook authentication. |  |
|**type** | [**TypeEnum**](#TypeEnum) | A webhook authentication discriminator of type &#x60;basic&#x60;. |  |
|**data** | [**WebhookAuthenticationDataBasic**](WebhookAuthenticationDataBasic.md) | The credentials of the webhook authentication. |  |
|**createdBy** | **String** | The name of the user who created the webhook authentication. |  |
|**modifiedBy** | **String** | The name of the user who last modified the webhook authentication. |  |
|**webhooks** | [**List&lt;WebhookAuthenticationWebhookRef&gt;**](WebhookAuthenticationWebhookRef.md) |  |  |
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**modified** | **OffsetDateTime** | The time this entity was last modified. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;basic&quot; |



