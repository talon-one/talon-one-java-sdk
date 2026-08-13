

# AwardDiscountAdditionalCostTarget

Applies the discount to an additional cost. The `target` field determines which subset of cart items the additional cost contribution is applied to.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | A target discriminator of type &#x60;additionalCost&#x60;. |  |
|**additionalCost** | [**AdditionalCostReference**](AdditionalCostReference.md) |  |  |
|**target** | [**AwardDiscountAdditionalCostTargetTarget**](AwardDiscountAdditionalCostTargetTarget.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ADDITIONAL_COST | &quot;additionalCost&quot; |



