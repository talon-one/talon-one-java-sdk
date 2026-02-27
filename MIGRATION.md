# Migration guide

This document provides guidance on how to migrate from the [legacy version](https://github.com/talon-one/TalonOneJavaSdk)
of the SDK to the latest version. Follow the steps below to ensure a smooth transition.

## Summary

In the new Java SDK there are improvements under the hood (updated generation, packaging,
and supported runtime). The visible migration changes are:

- **Dependency installation path updated** (use the published Maven artifact for the new
  SDK)
- Potential **compile fixes** (imports / client initialization / method signatures),
  depending on how you used the legacy SDK

## Steps

Follow these steps to migrate your code from the legacy Java SDK to the new version:

1. Update your dependency to the new Java SDK artifact (`one.talon:talon-one-client`).
2. Rebuild your project and **fix compile errors** (imports, API client usage, method
   signatures).
3. Run a regression test of your Talon.One integration calls.

## Dependencies (Maven / Gradle)

### Maven users

Add this dependency in your `pom.xml`:

```xml
<dependency>
  <groupId>one.talon</groupId>
  <artifactId>talon-one-client</artifactId>
  <version>26.04</version>
  <scope>compile</scope>
</dependency>
```

And this repository:

```xml
<repository>
  <id>talon-one</id>
  <url>https://github.com/talon-one/talon-one-maven-artifacts/raw/master</url>
</repository>
```

### Gradle users

```groovy
compile "one.talon:talon-one-client:26.04"
```

## Authentication

Authentication is API-key based using the `Authorization` header.

Common authentication schemes:

- `api_key_v1`
- `manager_auth`
- `management_key`

## API clients

The new SDK exposes:

- `IntegrationApi`
- `ManagementApi`

## Thread-safety recommendation

It's recommended to create **one `ApiClient` instance per thread** in a multithreaded
environment.

## Compile fix workflow

After switching the dependency:

1. Run a clean build (`mvn clean test` / `gradle test`)
2. Fix compilation issues in this order:
    - Imports / package names
    - API client class usage
    - Method signature changes (parameters/order/types)
    - Model type changes (enums, date/time, nested objects)

## Payload changes

No specific breaking request/response payload changes are documented at SDK level.

However, you should **test all API interactions** after migration to confirm request
serialization and response handling still match your expectations (especially if you parse
`effects` or rely on exact model fields).

## Summary of changes

| Category            | Legacy Java SDK     | New Java SDK                                   | Action Required                  |
| ------------------- | ------------------- | ---------------------------------------------- | -------------------------------- |
| SDK source          | Legacy repo         | Published artifact                             | Switch dependency                |
| Dependency          | Legacy installation | `one.talon:talon-one-client:<version>`         | Update Maven/Gradle dependency   |
| Client setup        | Similar concepts    | `ApiClient`, `IntegrationApi`, `ManagementApi` | Re-validate base URL + auth      |
| Code changes        | Project-dependent   | Project-dependent                              | Rebuild and fix compile errors   |
| Payloads            | Generally stable    | Generally stable                               | Regression test API interactions |

## Code example

```java
package com.example;

import one.talon.ApiClient;
import one.talon.api.IntegrationApi;
import one.talon.api.ManagementApi;
import one.talon.auth.ApiKeyAuth;
import one.talon.model.IntegrationRequest;
import one.talon.model.NewCustomerSessionV2;
import one.talon.model.IntegrationStateV2;
import one.talon.ApiException;

public class App {
  public static void main(String[] args) {
    ApiClient apiClient = new ApiClient();

    // Base URL: no trailing slash
    apiClient.setBasePath("https://base.url");

    // Integration API key
    ApiKeyAuth apiKeyV1 = (ApiKeyAuth) apiClient.getAuthentication("api_key_v1");
    apiKeyV1.setApiKeyPrefix("ApiKey-v1");
    apiKeyV1.setApiKey("MY_API_KEY");

    // Management API key (optional)
    ApiKeyAuth mgmtKey = (ApiKeyAuth) apiClient.getAuthentication("management_key");
    mgmtKey.setApiKeyPrefix("ManagementKey-v1");
    mgmtKey.setApiKey("MY_MGMT_KEY");

    // Instantiate clients (compile-time validation)
    IntegrationApi iApi = new IntegrationApi(apiClient);
    ManagementApi mApi = new ManagementApi(apiClient);

    System.out.println("OK: " + iApi + " / " + mApi);

    NewCustomerSessionV2 cs = new NewCustomerSessionV2();
    cs.setProfileId("test-profile");

    IntegrationRequest req = new IntegrationRequest().customerSession(cs);
    try {
        IntegrationStateV2 state = iApi.updateCustomerSessionV2("session-1", req, false, null);
        System.out.println(state);
    } catch (ApiException e) {
        // compile-time smoke test: just print
        System.out.println("API error: " + e.getMessage());
    }
  }
}
```
