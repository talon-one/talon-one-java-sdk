

# AwardLoyaltyPointsTarget

Identifies the scope over which loyalty points are awarded. The `type` field selects the target variant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;cart&#x60;. |  |
|**name** | **String** | Name of the bundle the points target. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CART | &quot;cart&quot; |
| ALL_ITEMS | &quot;allItems&quot; |
| GLOBAL_FILTER | &quot;globalFilter&quot; |
| SELECTOR | &quot;selector&quot; |
| BUNDLE | &quot;bundle&quot; |



