

# Export


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**accountId** | **Long** | The ID of the account that owns this entity. |  |
|**userId** | **Long** | The ID of the user associated with this entity. |  |
|**entity** | [**EntityEnum**](#EntityEnum) | The name of the entity that was exported. |  |
|**filter** | **Object** | Map of keys and values that were used to filter the exported rows. |  |



## Enum: EntityEnum

| Name | Value |
|---- | -----|
| COUPON | &quot;Coupon&quot; |
| REFERRAL | &quot;Referral&quot; |
| EFFECT | &quot;Effect&quot; |
| CUSTOMER_SESSION | &quot;CustomerSession&quot; |
| LOYALTY_LEDGER | &quot;LoyaltyLedger&quot; |
| LOYALTY_LEDGER_LOG | &quot;LoyaltyLedgerLog&quot; |
| COLLECTION | &quot;Collection&quot; |



