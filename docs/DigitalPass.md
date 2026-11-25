

# DigitalPass


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**passId** | **UUID** | The ID of the generated digital pass. |  |
|**passTemplateId** | **UUID** | The ID of the digital pass template used to generate the pass. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the digital pass.  &#x60;created&#x60; indicates that the pass was generated and is ready to be added to a wallet.  |  |
|**passUrl** | **URI** | The URL you can use to let the customer add the digital pass to their wallet.  **Note**: For Google Wallet, the URL is valid for 30 days. After 30 days, create the pass again to get a new URL.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |



