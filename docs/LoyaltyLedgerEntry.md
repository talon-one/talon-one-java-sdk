

# LoyaltyLedgerEntry

A single row of the ledger, describing one addition or deduction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **OffsetDateTime** |  |  |
|**programID** | **Long** |  |  |
|**customerProfileID** | **String** |  |  [optional] |
|**cardID** | **Long** |  |  [optional] |
|**customerSessionID** | **String** |  |  [optional] |
|**eventID** | **Long** |  |  [optional] |
|**type** | **String** | The type of the ledger transaction. Possible values are: - &#x60;addition&#x60; - &#x60;subtraction&#x60; - &#x60;expire&#x60; - &#x60;expiring&#x60; (for expiring points ledgers)  |  |
|**amount** | **BigDecimal** |  |  |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**expiryDate** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** | A name referencing the condition or effect that added this entry, or the specific name provided in an API call. |  |
|**subLedgerID** | **String** | This specifies if we are adding loyalty points to the main ledger or a subledger. |  |
|**userID** | **Long** | This is the ID of the user who created this entry, if the addition or subtraction was done manually. |  [optional] |
|**archived** | **Boolean** | Indicates if the entry belongs to the archived session. |  [optional] |
|**flags** | [**LoyaltyLedgerEntryFlags**](LoyaltyLedgerEntryFlags.md) | A map of flags providing additional details about the entry. |  [optional] |



