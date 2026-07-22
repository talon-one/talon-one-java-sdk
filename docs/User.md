

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**created** | **OffsetDateTime** | The time this entity was created. |  |
|**modified** | **OffsetDateTime** | The time this entity was last modified. |  |
|**email** | **String** | The email address associated with the user profile. |  |
|**accountId** | **Long** | The ID of the account that owns this entity. |  |
|**name** | **String** | Name of the user. |  |
|**state** | [**StateEnum**](#StateEnum) | State of the user. |  |
|**inviteToken** | **String** | Invitation token of the user.  **Note**: If the user has already accepted their invitation, this is &#x60;null&#x60;.  |  |
|**isAdmin** | **Boolean** | Indicates whether the user is an &#x60;admin&#x60;. |  [optional] |
|**policy** | **Object** | Access level of the user. |  |
|**roles** | **List&lt;Long&gt;** | A list of the IDs of the roles assigned to the user. |  [optional] |
|**authMethod** | **String** | Authentication method for this user. |  [optional] |
|**applicationNotificationSubscriptions** | **Object** | Application notifications that the user is subscribed to. |  [optional] |
|**lastSignedIn** | **OffsetDateTime** | Timestamp when the user last signed in to Talon.One. |  [optional] |
|**lastAccessed** | **OffsetDateTime** | Timestamp of the user&#39;s last activity after signing in to Talon.One. |  [optional] |
|**latestFeedTimestamp** | **OffsetDateTime** | Timestamp when the user was notified for feed. |  [optional] |
|**additionalAttributes** | **Object** | Additional user attributes, created and used by external identity providers. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| INVITED | &quot;invited&quot; |
| ACTIVE | &quot;active&quot; |
| DEACTIVATED | &quot;deactivated&quot; |



