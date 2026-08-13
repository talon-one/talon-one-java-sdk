

# AwardDiscountTarget

Identifies the scope a discount applies to. The `type` field selects the concrete target variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;cart&#x60;. |  |
|**prorated** | **Boolean** | Whether to distribute the discount proportionally across the bundle&#39;s items. |  [optional] |
|**name** | **String** | Name of the bundle binding the discount targets. |  |
|**item** | [**AwardDiscountBundleItem**](AwardDiscountBundleItem.md) |  |  [optional] |
|**additionalCost** | [**AdditionalCostReference**](AdditionalCostReference.md) |  |  |
|**target** | [**AwardDiscountAdditionalCostTargetTarget**](AwardDiscountAdditionalCostTargetTarget.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CART | &quot;cart&quot; |
| ALL_ITEMS | &quot;allItems&quot; |
| GLOBAL_FILTER | &quot;globalFilter&quot; |
| SELECTOR | &quot;selector&quot; |
| BUNDLE | &quot;bundle&quot; |
| ADDITIONAL_COST | &quot;additionalCost&quot; |



