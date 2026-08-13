

# AwardDiscountBundleItem

Selects which slot inside a bundle a discount applies to. The `type` field picks the selection mode.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A bundle-item selector of type &#x60;byIndex&#x60;. |  |
|**value** | **Long** | The zero-based index of the slot within the bundle. |  |
|**attribute** | **String** | A per-item attribute expression used to rank bundle items. |  |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Ranking direction. &#x60;highest&#x60; picks the item with the largest attribute value, &#x60;lowest&#x60; the smallest. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BY_INDEX | &quot;byIndex&quot; |
| BY_ATTRIBUTE | &quot;byAttribute&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| HIGHEST | &quot;highest&quot; |
| LOWEST | &quot;lowest&quot; |



