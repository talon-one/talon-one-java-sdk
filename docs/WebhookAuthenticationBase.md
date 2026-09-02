

# WebhookAuthenticationBase

Definition of all the properties that are needed to create or update a webhook authentication. The `type` field selects the concrete authentication variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the webhook authentication. |  |
|**type** | [**TypeEnum**](#TypeEnum) | A webhook authentication discriminator of type &#x60;basic&#x60;. |  |
|**data** | [**WebhookAuthenticationDataCustom**](WebhookAuthenticationDataCustom.md) | The credentials of the webhook authentication. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASIC | &quot;basic&quot; |
| CUSTOM | &quot;custom&quot; |



