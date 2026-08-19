

# CatalogAction

Definition of all the properties that are needed for a single catalog sync action. The `type` field selects the concrete action variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A catalog sync action discriminator of type &#x60;ADD&#x60;. |  |
|**payload** | [**AddPriceAdjustmentCatalogAction**](AddPriceAdjustmentCatalogAction.md) | The payload of sync action. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| PATCH | &quot;PATCH&quot; |
| PATCH_MANY | &quot;PATCH_MANY&quot; |
| REMOVE | &quot;REMOVE&quot; |
| REMOVE_MANY | &quot;REMOVE_MANY&quot; |
| ADD_PRICE_ADJUSTMENT | &quot;ADD_PRICE_ADJUSTMENT&quot; |



