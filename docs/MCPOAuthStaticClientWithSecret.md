

# MCPOAuthStaticClientWithSecret


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Unique identifier for the OAuth2 client. |  |
|**clientName** | **String** | Human-readable name for the OAuth2 client. |  |
|**redirectUris** | **List&lt;String&gt;** | List of allowed redirect URIs for the authorization code flow. |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the client was registered. |  |
|**id** | **Long** | Numeric ID of the OAuth client, used to delete it. |  |
|**createdBy** | **Long** | ID of the user who created the client. |  |
|**expiryDate** | **OffsetDateTime** | The date the client credentials expire. |  [optional] |
|**clientSecret** | **String** | The generated client secret. Only returned once on creation. |  |



