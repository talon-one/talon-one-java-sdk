

# AwardDiscountBlock


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for this block. |  [optional] [readonly] |
|**type** | **String** | Identifies the block variant and determines which additional properties are present in it. |  |
|**tags** | **List&lt;String&gt;** | Semantic labels attached to this block. |  [optional] [readonly] |
|**name** | **String** | The human-readable label attached to the discount. |  |
|**value** | [**AwardDiscountBlock1Value**](AwardDiscountBlock1Value.md) |  |  |
|**partial** | **Boolean** | Whether to apply a partial discount when the requested value exceeds the configured budget. |  |
|**target** | [**AwardDiscountTarget**](AwardDiscountTarget.md) |  |  |



