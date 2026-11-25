

# ExportJobDestination


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Destination type can be Google Cloud Storage (gcs) or file. |  |
|**compression** | [**CompressionEnum**](#CompressionEnum) | Compression applied to the exported file. |  [optional] |
|**path** | **String** | Directory on the exporter host where the file is written. Required for file destinations; must be omitted for gcs. |  [optional] |
|**bucket** | **String** | GCS bucket name for storage. Absent for file. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GCS | &quot;gcs&quot; |
| FILE | &quot;file&quot; |



## Enum: CompressionEnum

| Name | Value |
|---- | -----|
| ZIP | &quot;zip&quot; |
| GZIP | &quot;gzip&quot; |
| NONE | &quot;none&quot; |



