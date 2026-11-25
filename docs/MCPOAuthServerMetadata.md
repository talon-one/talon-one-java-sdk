

# MCPOAuthServerMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issuer** | **String** | The authorization server&#39;s issuer identifier (its base URL). |  |
|**authorizationEndpoint** | **String** | URL of the authorization endpoint. |  |
|**tokenEndpoint** | **String** | URL of the token endpoint. |  |
|**registrationEndpoint** | **String** | URL of the client registration endpoint. |  |
|**responseTypesSupported** | **List&lt;String&gt;** | List of supported OAuth2 response types. |  |
|**grantTypesSupported** | **List&lt;String&gt;** | List of supported OAuth2 grant types. |  |
|**codeChallengeMethodsSupported** | **List&lt;String&gt;** | List of supported PKCE code challenge methods. |  |
|**tokenEndpointAuthMethodsSupported** | **List&lt;String&gt;** | List of supported client authentication methods at the token endpoint. Public clients use &#x60;none&#x60;; confidential clients use &#x60;client_secret_post&#x60; or &#x60;client_secret_basic&#x60;. |  [optional] |



