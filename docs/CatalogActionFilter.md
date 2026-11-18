

# CatalogActionFilter

The properties for a single filtering condition in a catalog sync action.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attr** | **String** | The name of the attribute to filter on. The attribute must exist in the catalog. For the &#x60;LT&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, and &#x60;GE&#x60; comparison operators, the attribute must be of type &#x60;number&#x60;. |  |
|**op** | [**OpEnum**](#OpEnum) | The filtering operator. |  |
|**value** | **Object** | The value to filter for. For the &#x60;LT&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, and &#x60;GE&#x60; comparison operators, the value must be a number or a numeric string. |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| EQ | &quot;EQ&quot; |
| LT | &quot;LT&quot; |
| LE | &quot;LE&quot; |
| GT | &quot;GT&quot; |
| GE | &quot;GE&quot; |
| IN | &quot;IN&quot; |



