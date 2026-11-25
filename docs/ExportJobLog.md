

# ExportJobLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | The internal ID of this entity. |  |
|**exportJobId** | **Long** | The internal ID of the connected export job. |  |
|**type** | **ExportJobType** |  |  |
|**result** | **ExportJobLogResult** |  |  |
|**filename** | **String** | Name of the exported file, without extension. |  |
|**log** | **String** | The log text. |  |
|**startedAt** | **OffsetDateTime** | Time when the export job run started. |  |
|**finishedAt** | **OffsetDateTime** | Time when the export job run finished. |  [optional] |



