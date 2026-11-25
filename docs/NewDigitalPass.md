

# NewDigitalPass


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loyaltyProgramId** | **Long** | The ID of the associated loyalty program. |  |
|**passTemplateId** | **UUID** | The ID of the digital pass template used to generate the pass. |  |
|**profileIntegrationId** | **String** | The integration ID of the customer profile the pass is issued for. |  |
|**loyaltyCardId** | **String** | The identifier of the loyalty card the pass is issued for.  **Note**: Only applicable for card-based loyalty programs.  |  [optional] |
|**platform** | [**PlatformEnum**](#PlatformEnum) | The wallet platform the pass is generated for. Possible values:  - &#x60;apple&#x60;: The digital pass is generated for Apple Wallet. - &#x60;google&#x60;: The digital pass is generated for Google Wallet.  |  |
|**attributes** | **Map&lt;String, String&gt;** | A map of placeholder values that you provide to fill in the pass template. Pass templates reference each value as &#x60;CustomerProfile.Attributes.&lt;key&gt;&#x60;.  Each key must start with a letter or an underscore and can contain only letters, digits, and underscores. If the template requires a value that is missing, the request fails with a &#x60;422&#x60; error.  |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| APPLE | &quot;apple&quot; |
| GOOGLE | &quot;google&quot; |



