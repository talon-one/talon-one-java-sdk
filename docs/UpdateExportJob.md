

# UpdateExportJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **ExportJobType** |  |  |
|**args** | **Map&lt;String, Object&gt;** | Arguments for the exporter. Their structure depends on &#x60;type&#x60; and is validated by the service. |  |
|**destination** | [**List&lt;ExportJobDestination&gt;**](ExportJobDestination.md) | Destinations for the export job. |  |
|**cronSchedule** | **String** | Schedule in standard 5-field cron format. |  |
|**timezone** | **String** | A string containing an IANA timezone descriptor. |  [optional] |
|**enabled** | **Boolean** | Whether the export job is enabled. |  [optional] |
|**allowConcurrentRuns** | **Boolean** | Whether to allow concurrent runs of the job. |  [optional] |
|**overrideFilename** | **String** | Filename that replaces the generated export filename, without extension. |  [optional] |



