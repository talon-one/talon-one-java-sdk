

# ReturnIntegrationRequest

The body of a return integration API request. Next to the cart items details, this contains an optional listing of extra properties that should be returned in the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_return** | [**NewReturn**](NewReturn.md) | The returned cart items details. |  |
|**responseContent** | [**List&lt;ResponseContentEnum&gt;**](#List&lt;ResponseContentEnum&gt;) | Extends the response with the chosen data entities. Use this property to get as much data as you need in one _Update customer session_ request instead of sending extra requests to other endpoints.  |  [optional] |



## Enum: List&lt;ResponseContentEnum&gt;

| Name | Value |
|---- | -----|
| CUSTOMER_SESSION | &quot;customerSession&quot; |
| CUSTOMER_PROFILE | &quot;customerProfile&quot; |
| COUPONS | &quot;coupons&quot; |
| TRIGGERED_CAMPAIGNS | &quot;triggeredCampaigns&quot; |
| REFERRAL | &quot;referral&quot; |
| LOYALTY | &quot;loyalty&quot; |
| EVENT | &quot;event&quot; |
| PREVIOUS_RETURNS | &quot;previousReturns&quot; |



