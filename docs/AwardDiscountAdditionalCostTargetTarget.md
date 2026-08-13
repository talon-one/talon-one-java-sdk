

# AwardDiscountAdditionalCostTargetTarget

A subset of cart items whose additional cost the discount applies to. Cannot be another `additionalCost` target.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;cart&#x60;. |  |
|**prorated** | **Boolean** | Whether to distribute the discount proportionally across the selected items. |  [optional] |
|**name** | **String** | The name of the selector binding the discount targets. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CART | &quot;cart&quot; |
| ALL_ITEMS | &quot;allItems&quot; |
| GLOBAL_FILTER | &quot;globalFilter&quot; |
| SELECTOR | &quot;selector&quot; |



