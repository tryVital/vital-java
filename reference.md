# Reference
## Link
<details><summary><code>client.link.listBulkOps() -> BulkOpsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().listBulkOps(
    ListBulkOpsLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**nextCursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**teamId:** `Optional<ListBulkOpsLinkRequestTeamId>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.bulkImport(request) -> BulkImportConnectionsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().bulkImport(
    BulkImportConnectionsBody
        .builder()
        .provider(OAuthProviders.OURA)
        .connections(
            new ArrayList<ConnectionRecipe>(
                Arrays.asList(
                    ConnectionRecipe
                        .builder()
                        .userId("user_id")
                        .accessToken("access_token")
                        .refreshToken("refresh_token")
                        .providerId("provider_id")
                        .expiresAt(1)
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `Optional<BulkImportLinkRequestTeamId>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `OAuthProviders` 
    
</dd>
</dl>

<dl>
<dd>

**connections:** `List<ConnectionRecipe>` 
    
</dd>
</dl>

<dl>
<dd>

**waitForCompletion:** `Optional<Boolean>` 


Whether or not the endpoint should wait for the Bulk Op to complete before responding.

When `wait_for_completion` is enabled, the endpoint may respond 200 OK if the Bulk Op takes less than 20 seconds to complete.

Otherwise, the endpoint always responds with 202 Created once the submitted data have been enqueued successfully. You can use
the [List Bulk Ops](https://docs.tryvital.io/api-reference/link/list-bulk-ops) endpoint to inspect the progress of the Bulk Op.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.bulkTriggerHistoricalPull(request) -> Object</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().bulkTriggerHistoricalPull(
    BulkTriggerHistoricalPullBody
        .builder()
        .userIds(
            new ArrayList<String>(
                Arrays.asList("user_ids")
            )
        )
        .provider(OAuthProviders.OURA)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `Optional<BulkTriggerHistoricalPullLinkRequestTeamId>` 
    
</dd>
</dl>

<dl>
<dd>

**userIds:** `List<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `OAuthProviders` 
    
</dd>
</dl>

<dl>
<dd>

**waitForCompletion:** `Optional<Boolean>` 


Whether or not the endpoint should wait for the Bulk Op to complete before responding.

When `wait_for_completion` is enabled, the endpoint may respond 200 OK if the Bulk Op takes less than 20 seconds to complete.

Otherwise, the endpoint always responds with 202 Created once the submitted data have been enqueued successfully. You can use
the [List Bulk Ops](https://docs.tryvital.io/api-reference/link/list-bulk-ops) endpoint to inspect the progress of the Bulk Op.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.bulkExport(request) -> BulkExportConnectionsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().bulkExport(
    BulkExportConnectionsBody
        .builder()
        .provider(OAuthProviders.OURA)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `Optional<BulkExportLinkRequestTeamId>` 
    
</dd>
</dl>

<dl>
<dd>

**userIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `OAuthProviders` 
    
</dd>
</dl>

<dl>
<dd>

**nextToken:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.bulkPause(request) -> Object</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().bulkPause(
    BulkPauseConnectionsBody
        .builder()
        .userIds(
            new ArrayList<String>(
                Arrays.asList("user_ids")
            )
        )
        .provider(OAuthProviders.OURA)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `Optional<BulkPauseLinkRequestTeamId>` 
    
</dd>
</dl>

<dl>
<dd>

**userIds:** `List<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `OAuthProviders` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.token(request) -> LinkTokenExchangeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Endpoint to generate a user link token, to be used throughout the vital
link process. The vital link token is a one time use token, that
expires after 10 minutes. If you would like vital-link widget to launch
with a specific provider, pass in a provider in the body. If you would
like to redirect to a custom url after successful or error connection,
pass in your own custom redirect_url parameter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().token(
    LinkTokenExchange
        .builder()
        .userId("user_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — User id returned by vital create user request. This id should be stored in your database against the user and used for all interactions with the vital api.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<Providers>` 
    
</dd>
</dl>

<dl>
<dd>

**redirectUrl:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**filterOnProviders:** `Optional<List<Providers>>` 

An allowlist of providers dictating what Vital Link Widget should show to the end user.
If unspecified, all linkable providers are shown.

This has no effect on programmatic Vital Link API usage.
    
</dd>
</dl>

<dl>
<dd>

**onError:** `Optional<String>` 

By default, Vital Link Widget input forms for password and email providers have in-built error handling.

Specifying `on_error=redirect` disables this Vital Link Widget UI behaviour — it would
instead redirect to your `redirect_url`, with Link Error parameters injected.

This has no effect on OAuth providers — they always redirect to your `redirect_url`. This also has
no effect on programmatic Vital Link API usage.
    
</dd>
</dl>

<dl>
<dd>

**onClose:** `Optional<String>` 

By default, Vital Link Widget closes the window or tab when the user taps the Close button.

Specifying `on_close=redirect` would change the Close button behaviour to redirect to your `redirect_url`
with the `user_cancelled` error specified.

This has no effect on programmatic Vital Link API usage.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.isTokenValid(request) -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().isTokenValid(
    LinkTokenValidationRequest
        .builder()
        .token("token")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**token:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.codeCreate() -> VitalTokenCreatedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Generate a token to invite a user of Vital mobile app to your team
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().codeCreate(
    CodeCreateLinkRequest
        .builder()
        .userId("user_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` — When the link code should expire. Defaults to server time plus 1 hour.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.startConnect(request) -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

REQUEST_SOURCE: VITAL-LINK
Start link token process
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().startConnect(
    BeginLinkTokenRequest
        .builder()
        .linkToken("link_token")
        .provider(Providers.OURA)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**linkToken:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Providers` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.tokenState() -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

REQUEST_SOURCE: VITAL-LINK
Check link token state - can be hit continuously used as heartbeat
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().tokenState(
    TokenStateLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.emailAuth(request) -> Object</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated. Use `POST /v2/link/provider/email/{provider}` instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().emailAuth(
    EmailAuthLink
        .builder()
        .email("email")
        .provider(Providers.OURA)
        .authType(AuthType.PASSWORD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Providers` 
    
</dd>
</dl>

<dl>
<dd>

**authType:** `AuthType` 
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<Region>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.passwordAuth(request) -> Object</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated. Use `POST /v2/link/provider/password/{provider}` instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().passwordAuth(
    PasswordAuthLink
        .builder()
        .username("username")
        .password("password")
        .provider(Providers.OURA)
        .authType(AuthType.PASSWORD)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**username:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**password:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Providers` 
    
</dd>
</dl>

<dl>
<dd>

**authType:** `AuthType` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.generateOauthLink(oauthProvider) -> Source</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint generates an OAuth link for oauth provider
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().generateOauthLink(
    OAuthProviders.OURA,
    GenerateOauthLinkLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**oauthProvider:** `OAuthProviders` 
    
</dd>
</dl>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.connectPasswordProvider(provider, request) -> ProviderLinkResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This connects auth providers that are password based.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().connectPasswordProvider(
    PasswordProviders.WHOOP,
    IndividualProviderData
        .builder()
        .username("username")
        .password("password")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**provider:** `PasswordProviders` 
    
</dd>
</dl>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**username:** `String` — Username for provider
    
</dd>
</dl>

<dl>
<dd>

**password:** `String` — Password for provider
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<Region>` — Provider region to authenticate against. Only applicable to specific providers.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.completePasswordProviderMfa(provider, request) -> ProviderLinkResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This connects auth providers that are password based.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().completePasswordProviderMfa(
    PasswordProviders.WHOOP,
    CompletePasswordProviderMfaBody
        .builder()
        .mfaCode("mfa_code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**provider:** `PasswordProviders` 
    
</dd>
</dl>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**mfaCode:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.connectEmailAuthProvider(provider, request) -> Object</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This connects auth providers that are email based.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().connectEmailAuthProvider(
    "freestyle_libre",
    EmailProviderAuthLink
        .builder()
        .email("email")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**provider:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**emailProviderAuthLinkProvider:** `Optional<Providers>` 
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<Region>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.getAllProviders() -> List&lt;SourceLink&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET List of all available providers given the generated link token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().getAllProviders(
    GetAllProvidersLinkRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.connectManualProvider(provider, request) -> Map&lt;String, Boolean&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().connectManualProvider(
    ManualProviders.BEURER_BLE,
    ManualConnectionData
        .builder()
        .userId("user_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**provider:** `ManualProviders` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**providerId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.link.connectDemoProvider(request) -> DemoConnectionStatus</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

POST Connect the given Vital user to a demo provider.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.link().connectDemoProvider(
    DemoConnectionCreationPayload
        .builder()
        .userId("user_id")
        .provider(DemoProviders.APPLE_HEALTH_KIT)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — Vital user ID
    
</dd>
</dl>

<dl>
<dd>

**provider:** `DemoProviders` — Demo provider. For more information, please check out our docs (https://docs.tryvital.io/wearables/providers/test_data)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Electrocardiogram
<details><summary><code>client.electrocardiogram.get(userId) -> ClientFacingElectrocardiogramResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get electrocardiogram summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.electrocardiogram().get(
    "user_id",
    GetElectrocardiogramRequest
        .builder()
        .startDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## SleepCycle
<details><summary><code>client.sleepCycle.get(userId) -> ClientSleepCycleResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get sleep cycle for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sleepCycle().get(
    "user_id",
    GetSleepCycleRequest
        .builder()
        .startDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Profile
<details><summary><code>client.profile.get(userId) -> ClientFacingProfile</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get profile for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profile().get(
    "user_id",
    GetProfileRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profile.getRaw(userId) -> RawProfile</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw profile for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profile().getRaw(
    "user_id",
    GetRawProfileRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Devices
<details><summary><code>client.devices.getRaw(userId) -> RawDevices</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Devices for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.devices().getRaw(
    "user_id",
    GetRawDevicesRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Activity
<details><summary><code>client.activity.get(userId) -> ClientActivityResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get activity summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.activity().get(
    "user_id",
    GetActivityRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.activity.getRaw(userId) -> RawActivity</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw activity summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.activity().getRaw(
    "user_id",
    GetRawActivityRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Workouts
<details><summary><code>client.workouts.get(userId) -> ClientWorkoutResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get workout summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.workouts().get(
    "user_id",
    GetWorkoutsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.workouts.getRaw(userId) -> RawWorkout</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw workout summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.workouts().getRaw(
    "user_id",
    GetRawWorkoutsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.workouts.getByWorkoutId(workoutId) -> ClientFacingStream</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.workouts().getByWorkoutId(
    "workout_id",
    GetByWorkoutIdWorkoutsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workoutId:** `String` — The Vital ID for the workout
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Sleep
<details><summary><code>client.sleep.get(userId) -> ClientSleepResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get sleep summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sleep().get(
    "user_id",
    GetSleepRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sleep.getRaw(userId) -> RawSleep</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw sleep summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sleep().getRaw(
    "user_id",
    GetRawSleepRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sleep.getStreamBySleepId(sleepId) -> ClientFacingSleepStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Sleep stream for a user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sleep().getStreamBySleepId(
    "sleep_id",
    GetStreamBySleepIdSleepRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sleepId:** `String` — The Vital Sleep ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Body
<details><summary><code>client.body.get(userId) -> ClientBodyResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Body summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.body().get(
    "user_id",
    GetBodyRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.body.getRaw(userId) -> RawBody</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw Body summary for user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.body().getRaw(
    "user_id",
    GetRawBodyRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Meal
<details><summary><code>client.meal.get(userId) -> ClientFacingMealResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get user's meals
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.meal().get(
    "user_id",
    GetMealRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## MenstrualCycle
<details><summary><code>client.menstrualCycle.get(userId) -> MenstrualCycleResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.menstrualCycle().get(
    "user_id",
    GetMenstrualCycleRequest
        .builder()
        .startDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Vitals
<details><summary><code>client.vitals.workoutSwimmingStrokeGrouped(userId) -> GroupedWorkoutSwimmingStrokeResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().workoutSwimmingStrokeGrouped(
    "user_id",
    WorkoutSwimmingStrokeGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.workoutDistanceGrouped(userId) -> GroupedWorkoutDistanceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().workoutDistanceGrouped(
    "user_id",
    WorkoutDistanceGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.heartRateRecoveryOneMinuteGrouped(userId) -> GroupedHeartRateRecoveryOneMinuteResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().heartRateRecoveryOneMinuteGrouped(
    "user_id",
    HeartRateRecoveryOneMinuteGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.waistCircumferenceGrouped(userId) -> GroupedWaistCircumferenceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().waistCircumferenceGrouped(
    "user_id",
    WaistCircumferenceGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.leanBodyMassGrouped(userId) -> GroupedLeanBodyMassResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().leanBodyMassGrouped(
    "user_id",
    LeanBodyMassGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyMassIndexGrouped(userId) -> GroupedBodyMassIndexResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyMassIndexGrouped(
    "user_id",
    BodyMassIndexGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.basalBodyTemperatureGrouped(userId) -> GroupedBasalBodyTemperatureResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().basalBodyTemperatureGrouped(
    "user_id",
    BasalBodyTemperatureGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.handwashingGrouped(userId) -> GroupedHandwashingResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().handwashingGrouped(
    "user_id",
    HandwashingGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.daylightExposureGrouped(userId) -> GroupedDaylightExposureResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().daylightExposureGrouped(
    "user_id",
    DaylightExposureGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.uvExposureGrouped(userId) -> GroupedUvExposureResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().uvExposureGrouped(
    "user_id",
    UvExposureGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.fallGrouped(userId) -> GroupedFallResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().fallGrouped(
    "user_id",
    FallGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.inhalerUsageGrouped(userId) -> GroupedInhalerUsageResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().inhalerUsageGrouped(
    "user_id",
    InhalerUsageGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.peakExpiratoryFlowRateGrouped(userId) -> GroupedPeakExpiratoryFlowRateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().peakExpiratoryFlowRateGrouped(
    "user_id",
    PeakExpiratoryFlowRateGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.forcedVitalCapacityGrouped(userId) -> GroupedForcedVitalCapacityResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().forcedVitalCapacityGrouped(
    "user_id",
    ForcedVitalCapacityGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.forcedExpiratoryVolume1Grouped(userId) -> GroupedForcedExpiratoryVolume1Response</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().forcedExpiratoryVolume1Grouped(
    "user_id",
    ForcedExpiratoryVolume1GroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.wheelchairPushGrouped(userId) -> GroupedWheelchairPushResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().wheelchairPushGrouped(
    "user_id",
    WheelchairPushGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.sleepBreathingDisturbanceGrouped(userId) -> GroupedSleepBreathingDisturbanceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().sleepBreathingDisturbanceGrouped(
    "user_id",
    SleepBreathingDisturbanceGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.sleepApneaAlertGrouped(userId) -> GroupedSleepApneaAlertResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().sleepApneaAlertGrouped(
    "user_id",
    SleepApneaAlertGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.standDurationGrouped(userId) -> GroupedStandDurationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().standDurationGrouped(
    "user_id",
    StandDurationGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.standHourGrouped(userId) -> GroupedStandHourResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().standHourGrouped(
    "user_id",
    StandHourGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.heartRateAlertGrouped(userId) -> GroupedHeartRateAlertResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().heartRateAlertGrouped(
    "user_id",
    HeartRateAlertGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.afibBurdenGrouped(userId) -> GroupedAFibBurdenResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().afibBurdenGrouped(
    "user_id",
    AfibBurdenGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.workoutDurationGrouped(userId) -> GroupedWorkoutDurationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().workoutDurationGrouped(
    "user_id",
    WorkoutDurationGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.vo2MaxGrouped(userId) -> GroupedVo2MaxResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().vo2MaxGrouped(
    "user_id",
    Vo2MaxGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.stressLevelGrouped(userId) -> GroupedStressLevelResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().stressLevelGrouped(
    "user_id",
    StressLevelGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.mindfulnessMinutesGrouped(userId) -> GroupedMindfulnessMinutesResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().mindfulnessMinutesGrouped(
    "user_id",
    MindfulnessMinutesGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caffeineGrouped(userId) -> GroupedCaffeineResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caffeineGrouped(
    "user_id",
    CaffeineGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.waterGrouped(userId) -> GroupedWaterResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().waterGrouped(
    "user_id",
    WaterGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.stepsGrouped(userId) -> GroupedStepsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().stepsGrouped(
    "user_id",
    StepsGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.floorsClimbedGrouped(userId) -> GroupedFloorsClimbedResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().floorsClimbedGrouped(
    "user_id",
    FloorsClimbedGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.distanceGrouped(userId) -> GroupedDistanceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().distanceGrouped(
    "user_id",
    DistanceGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caloriesBasalGrouped(userId) -> GroupedCaloriesBasalResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caloriesBasalGrouped(
    "user_id",
    CaloriesBasalGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caloriesActiveGrouped(userId) -> GroupedCaloriesActiveResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caloriesActiveGrouped(
    "user_id",
    CaloriesActiveGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.respiratoryRateGrouped(userId) -> GroupedRespiratoryRateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().respiratoryRateGrouped(
    "user_id",
    RespiratoryRateGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.noteGrouped(userId) -> GroupedNoteResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().noteGrouped(
    "user_id",
    NoteGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.insulinInjectionGrouped(userId) -> GroupedInsulinInjectionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().insulinInjectionGrouped(
    "user_id",
    InsulinInjectionGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.igeGrouped(userId) -> GroupedIgeResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().igeGrouped(
    "user_id",
    IgeGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.iggGrouped(userId) -> GroupedIggResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().iggGrouped(
    "user_id",
    IggGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.hypnogramGrouped(userId) -> GroupedHypnogramResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().hypnogramGrouped(
    "user_id",
    HypnogramGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.hrvGrouped(userId) -> GroupedHrvResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().hrvGrouped(
    "user_id",
    HrvGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.heartrateGrouped(userId) -> GroupedHeartRateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().heartrateGrouped(
    "user_id",
    HeartrateGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.glucoseGrouped(userId) -> GroupedGlucoseResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().glucoseGrouped(
    "user_id",
    GlucoseGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterolGrouped(userId) -> GroupedCholesterolResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterolGrouped(
    "user_id",
    CholesterolGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.carbohydratesGrouped(userId) -> GroupedCarbohydratesResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().carbohydratesGrouped(
    "user_id",
    CarbohydratesGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyTemperatureDeltaGrouped(userId) -> GroupedBodyTemperatureDeltaResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyTemperatureDeltaGrouped(
    "user_id",
    BodyTemperatureDeltaGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyTemperatureGrouped(userId) -> GroupedBodyTemperatureResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyTemperatureGrouped(
    "user_id",
    BodyTemperatureGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyWeightGrouped(userId) -> GroupedBodyWeightResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyWeightGrouped(
    "user_id",
    BodyWeightGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyFatGrouped(userId) -> GroupedBodyFatResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyFatGrouped(
    "user_id",
    BodyFatGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bloodOxygenGrouped(userId) -> GroupedBloodOxygenResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bloodOxygenGrouped(
    "user_id",
    BloodOxygenGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.electrocardiogramVoltageGrouped(userId) -> GroupedElectrocardiogramVoltageResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().electrocardiogramVoltageGrouped(
    "user_id",
    ElectrocardiogramVoltageGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bloodPressureGrouped(userId) -> GroupedBloodPressureResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bloodPressureGrouped(
    "user_id",
    BloodPressureGroupedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.vo2Max(userId) -> List&lt;ClientFacingVo2MaxTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().vo2Max(
    "user_id",
    Vo2MaxVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.stressLevel(userId) -> List&lt;ClientFacingStressLevelTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().stressLevel(
    "user_id",
    StressLevelVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.mindfulnessMinutes(userId) -> List&lt;ClientFacingMindfulnessMinutesTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().mindfulnessMinutes(
    "user_id",
    MindfulnessMinutesVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caffeine(userId) -> List&lt;ClientFacingCaffeineTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caffeine(
    "user_id",
    CaffeineVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.water(userId) -> List&lt;ClientFacingWaterTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().water(
    "user_id",
    WaterVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.steps(userId) -> List&lt;ClientFacingStepsTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().steps(
    "user_id",
    StepsVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.floorsClimbed(userId) -> List&lt;ClientFacingFloorsClimbedTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().floorsClimbed(
    "user_id",
    FloorsClimbedVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.distance(userId) -> List&lt;ClientFacingDistanceTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().distance(
    "user_id",
    DistanceVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caloriesBasal(userId) -> List&lt;ClientFacingCaloriesBasalTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caloriesBasal(
    "user_id",
    CaloriesBasalVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.caloriesActive(userId) -> List&lt;ClientFacingCaloriesActiveTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().caloriesActive(
    "user_id",
    CaloriesActiveVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.respiratoryRate(userId) -> List&lt;ClientFacingRespiratoryRateTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().respiratoryRate(
    "user_id",
    RespiratoryRateVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.ige(userId) -> List&lt;ClientFacingIgeTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().ige(
    "user_id",
    IgeVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.igg(userId) -> List&lt;ClientFacingIggTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().igg(
    "user_id",
    IggVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.hypnogram(userId) -> List&lt;ClientFacingHypnogramTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().hypnogram(
    "user_id",
    HypnogramVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.hrv(userId) -> List&lt;ClientFacingHrvTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().hrv(
    "user_id",
    HrvVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.heartrate(userId) -> List&lt;ClientFacingHeartRateTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().heartrate(
    "user_id",
    HeartrateVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.glucose(userId) -> List&lt;ClientFacingGlucoseTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().glucose(
    "user_id",
    GlucoseVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterolTriglycerides(userId) -> List&lt;ClientFacingCholesterolTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterolTriglycerides(
    "user_id",
    CholesterolTriglyceridesVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterolTotal(userId) -> List&lt;ClientFacingCholesterolTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterolTotal(
    "user_id",
    CholesterolTotalVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterolLdl(userId) -> List&lt;ClientFacingCholesterolTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterolLdl(
    "user_id",
    CholesterolLdlVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterolHdl(userId) -> List&lt;ClientFacingCholesterolTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterolHdl(
    "user_id",
    CholesterolHdlVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.cholesterol(userId) -> List&lt;ClientFacingCholesterolTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().cholesterol(
    "user_id",
    CholesterolVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyWeight(userId) -> List&lt;ClientFacingBodyWeightTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyWeight(
    "user_id",
    BodyWeightVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bodyFat(userId) -> List&lt;ClientFacingBodyFatTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bodyFat(
    "user_id",
    BodyFatVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bloodOxygen(userId) -> List&lt;ClientFacingBloodOxygenTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bloodOxygen(
    "user_id",
    BloodOxygenVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.electrocardiogramVoltage(userId) -> List&lt;ClientFacingElectrocardiogramVoltageTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().electrocardiogramVoltage(
    "user_id",
    ElectrocardiogramVoltageVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vitals.bloodPressure(userId) -> List&lt;ClientFacingBloodPressureTimeseries&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vitals().bloodPressure(
    "user_id",
    BloodPressureVitalsRequest
        .builder()
        .startDate("start_date")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Provider oura/strava etc
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## User
<details><summary><code>client.user.getAll() -> PaginatedUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET All users for team.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getAll(
    GetAllUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.create(request) -> ClientFacingUserKey</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

POST Create a Vital user given a client_user_id and returns the user_id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().create(
    UserCreateBody
        .builder()
        .clientUserId("client_user_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**clientUserId:** `String` — A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
    
</dd>
</dl>

<dl>
<dd>

**fallbackTimeZone:** `Optional<String>` 


    Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., `Europe/London` or `America/Los_Angeles`).
    Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
    
    
</dd>
</dl>

<dl>
<dd>

**fallbackBirthDate:** `Optional<String>` — Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.
    
</dd>
</dl>

<dl>
<dd>

**ingestionStart:** `Optional<String>` — Starting bound for user [data ingestion bounds](https://docs.tryvital.io/wearables/providers/data-ingestion-bounds).
    
</dd>
</dl>

<dl>
<dd>

**ingestionEnd:** `Optional<String>` — Ending bound for user [data ingestion bounds](https://docs.tryvital.io/wearables/providers/data-ingestion-bounds).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getTeamMetrics() -> MetricsResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET metrics for team.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getTeamMetrics();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getConnectedProviders(userId) -> Map&lt;String, List&lt;ClientFacingProviderWithStatus&gt;&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET Users connected providers
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getConnectedProviders(
    "user_id",
    GetConnectedProvidersUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getLatestUserInfo(userId) -> UserInfo</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getLatestUserInfo(
    "user_id",
    GetLatestUserInfoUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.createInsurance(userId, request) -> ClientFacingInsurance</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().createInsurance(
    "user_id",
    CreateInsuranceRequest
        .builder()
        .payorCode("payor_code")
        .memberId("member_id")
        .relationship(ResponsibleRelationship.SELF)
        .insured(
            VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails
                .builder()
                .firstName("first_name")
                .lastName("last_name")
                .gender(Gender.FEMALE)
                .address(
                    Address
                        .builder()
                        .firstLine("first_line")
                        .country("country")
                        .zip("zip")
                        .city("city")
                        .state("state")
                        .build()
                )
                .dob("2023-01-15")
                .email("email")
                .phoneNumber("phone_number")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**payorCode:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**memberId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**groupId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**relationship:** `ResponsibleRelationship` 
    
</dd>
</dl>

<dl>
<dd>

**insured:** `VitalCoreSchemasDbSchemasLabTestInsurancePersonDetails` 
    
</dd>
</dl>

<dl>
<dd>

**guarantor:** `Optional<GuarantorDetails>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getLatestInsurance(userId) -> ClientFacingInsurance</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getLatestInsurance(
    "user_id",
    GetLatestInsuranceUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.upsertUserInfo(userId, request) -> UserInfo</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().upsertUserInfo(
    "user_id",
    UserInfoCreateRequest
        .builder()
        .firstName("first_name")
        .lastName("last_name")
        .email("email")
        .phoneNumber("phone_number")
        .gender("gender")
        .dob("2023-01-15")
        .address(
            Address
                .builder()
                .firstLine("first_line")
                .country("country")
                .zip("zip")
                .city("city")
                .state("state")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**firstName:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**lastName:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**phoneNumber:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**gender:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**dob:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**address:** `Address` 
    
</dd>
</dl>

<dl>
<dd>

**medicalProxy:** `Optional<GuarantorDetails>` 
    
</dd>
</dl>

<dl>
<dd>

**race:** `Optional<Race>` 
    
</dd>
</dl>

<dl>
<dd>

**ethnicity:** `Optional<Ethnicity>` 
    
</dd>
</dl>

<dl>
<dd>

**sexualOrientation:** `Optional<SexualOrientation>` 
    
</dd>
</dl>

<dl>
<dd>

**genderIdentity:** `Optional<GenderIdentity>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getByClientUserId(clientUserId) -> ClientFacingUser</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET user_id from client_user_id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getByClientUserId(
    "client_user_id",
    GetByClientUserIdUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**clientUserId:** `String` — A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.deregisterProvider(userId, provider) -> UserSuccessResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().deregisterProvider(
    "user_id",
    Providers.OURA,
    DeregisterProviderUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Providers` — Provider slug. e.g., `oura`, `fitbit`, `garmin`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.get(userId) -> ClientFacingUser</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().get(
    "user_id",
    GetUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.delete(userId) -> UserSuccessResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().delete(
    "user_id",
    DeleteUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.patch(userId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().patch(
    "user_id",
    UserPatchBody
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**fallbackTimeZone:** `Optional<String>` 


    Fallback time zone of the user, in the form of a valid IANA tzdatabase identifier (e.g., `Europe/London` or `America/Los_Angeles`).
    Used when pulling data from sources that are completely time zone agnostic (e.g., all time is relative to UTC clock, without any time zone attributions on data points).
    
    
</dd>
</dl>

<dl>
<dd>

**fallbackBirthDate:** `Optional<String>` — Fallback date of birth of the user, in YYYY-mm-dd format. Used for calculating max heartrate for providers that don not provide users' age.
    
</dd>
</dl>

<dl>
<dd>

**ingestionStart:** `Optional<String>` — Starting bound for user [data ingestion bounds](https://docs.tryvital.io/wearables/providers/data-ingestion-bounds).
    
</dd>
</dl>

<dl>
<dd>

**ingestionEnd:** `Optional<String>` — Ending bound for user [data ingestion bounds](https://docs.tryvital.io/wearables/providers/data-ingestion-bounds).
    
</dd>
</dl>

<dl>
<dd>

**clientUserId:** `Optional<String>` — A unique ID representing the end user. Typically this will be a user ID from your application. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.undoDelete() -> UserSuccessResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().undoDelete(
    UndoDeleteUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `Optional<String>` — User ID to undo deletion. Mutually exclusive with `client_user_id`.
    
</dd>
</dl>

<dl>
<dd>

**clientUserId:** `Optional<String>` — Client User ID to undo deletion. Mutually exclusive with `user_id`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.refresh(userId) -> UserRefreshSuccessResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Trigger a manual refresh for a specific user
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().refresh(
    "user_id",
    RefreshUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**timeout:** `Optional<Float>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getDevices(userId) -> List&lt;ClientFacingDevice&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getDevices(
    "user_id",
    GetDevicesUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getDevice(userId, deviceId) -> ClientFacingDevice</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getDevice(
    "user_id",
    "device_id",
    GetDeviceUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**deviceId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.getUserSignInToken(userId) -> UserSignInTokenResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().getUserSignInToken(
    "user_id",
    GetUserSignInTokenUserRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.user.createPortalUrl(userId, request) -> CreateUserPortalUrlResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.user().createPortalUrl(
    "user_id",
    CreateUserPortalUrlBody
        .builder()
        .context(CreateUserPortalUrlBodyContext.LAUNCH)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**context:** `CreateUserPortalUrlBodyContext` 

`launch`: Generates a short-lived (minutes) portal URL that is intended for launching a user from your
authenticated web context directly into the Junction User Portal. This URL is not suitable for asynchronous
communications due to its verbosity as well as short-lived nature.

`communications`: Generates a long-lived (weeks) but shortened portal URL that is suitable for Emails, SMS
messages and other communication channels. Users may be asked to verify their identity with Email and SMS
authentication, e.g., when they open a short link on a new device. ℹ️ This enum is non-exhaustive.
    
</dd>
</dl>

<dl>
<dd>

**orderId:** `Optional<String>` — If specified, the generated URL will deeplink to the specified Order.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Team
<details><summary><code>client.team.getLinkConfig() -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Post teams.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().getLinkConfig(
    GetLinkConfigTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**vitalLinkToken:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.get(teamId) -> ClientFacingTeam</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get team.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().get(
    "team_id",
    GetTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.getUserById() -> List&lt;ClientFacingUser&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Search team users by user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().getUserById(
    GetUserByIdTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**queryId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.getSvixUrl() -> Map&lt;String, Object&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().getSvixUrl();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.getSourcePriorities() -> List&lt;Map&lt;String, Object&gt;&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET source priorities.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().getSourcePriorities(
    GetSourcePrioritiesTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**dataType:** `Optional<PriorityResource>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.updateSourcePriorities() -> List&lt;Map&lt;String, Object&gt;&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Patch source priorities.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().updateSourcePriorities();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.team.getPhysicians(teamId) -> List&lt;ClientFacingPhysician&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.team().getPhysicians(
    "team_id",
    GetPhysiciansTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**teamId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Providers
<details><summary><code>client.providers.getAll() -> List&lt;ClientFacingProviderDetailed&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Provider list
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.providers().getAll(
    GetAllProvidersRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sourceType:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Introspect
<details><summary><code>client.introspect.getUserResources() -> UserResourcesResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.introspect().getUserResources(
    GetUserResourcesIntrospectRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `Optional<String>` — Filter by user ID.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<Providers>` 
    
</dd>
</dl>

<dl>
<dd>

**userLimit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.introspect.getUserHistoricalPulls() -> UserHistoricalPullsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.introspect().getUserHistoricalPulls(
    GetUserHistoricalPullsIntrospectRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `Optional<String>` — Filter by user ID.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<GetUserHistoricalPullsIntrospectRequestProvider>` 
    
</dd>
</dl>

<dl>
<dd>

**userLimit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` — The cursor for fetching the next page, or `null` to fetch the first page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## LabTests
<details><summary><code>client.labTests.get() -> List&lt;ClientFacingLabTest&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET all the lab tests the team has access to.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().get(
    GetLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**generationMethod:** `Optional<LabTestGenerationMethodFilter>` — Filter on whether auto-generated lab tests created by Vital, manually created lab tests, or all lab tests should be returned.
    
</dd>
</dl>

<dl>
<dd>

**labSlug:** `Optional<String>` — Filter by the slug of the lab for these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**collectionMethod:** `Optional<LabTestCollectionMethod>` — Filter by the collection method for these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<LabTestStatus>` — Filter by the status of these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**markerIds:** `Optional<List<Integer>>` — Filter to only include lab tests containing these marker IDs.
    
</dd>
</dl>

<dl>
<dd>

**providerIds:** `Optional<List<String>>` — Filter to only include lab tests containing these provider IDs.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Filter by the name of the lab test (a case-insensitive substring search).
    
</dd>
</dl>

<dl>
<dd>

**orderKey:** `Optional<GetLabTestsRequestOrderKey>` 
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<GetLabTestsRequestOrderDirection>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.create(request) -> ClientFacingLabTest</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().create(
    CreateLabTestRequest
        .builder()
        .name("name")
        .method(LabTestCollectionMethod.TESTKIT)
        .description("description")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**markerIds:** `Optional<List<Integer>>` 
    
</dd>
</dl>

<dl>
<dd>

**providerIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**method:** `LabTestCollectionMethod` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**fasting:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getById(labTestId) -> ClientFacingLabTest</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET all the lab tests the team has access to.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getById(
    "lab_test_id",
    GetByIdLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labTestId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — The lab account ID. This lab account is used to determine the availability of markers and lab tests.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.updateLabTest(labTestId, request) -> ClientFacingLabTest</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().updateLabTest(
    "lab_test_id",
    UpdateLabTestRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labTestId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getMarkers() -> GetMarkersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET all the markers for the given lab.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getMarkers(
    GetMarkersLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labId:** `Optional<List<Integer>>` — The identifier Vital assigned to a lab partner.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — The name or test code of an individual biomarker or a panel.
    
</dd>
</dl>

<dl>
<dd>

**aLaCarteEnabled:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — The lab account ID. This lab account is used to determine the availability of markers and lab tests.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getMarkersForOrderSet(request) -> GetMarkersResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getMarkersForOrderSet(
    GetMarkersForOrderSetLabTestsRequest
        .builder()
        .body(
            OrderSetRequest
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `OrderSetRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getMarkersForLabTest(labTestId) -> GetMarkersResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getMarkersForLabTest(
    "lab_test_id",
    GetMarkersForLabTestLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labTestId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — The lab account ID. This lab account is used to determine the availability of markers and lab tests.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getMarkersByLabAndProviderId(labId, providerId) -> ClientFacingMarker</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET a specific marker for the given lab and provider_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getMarkersByLabAndProviderId(
    1,
    "provider_id",
    GetMarkersByLabAndProviderIdLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labId:** `Integer` 
    
</dd>
</dl>

<dl>
<dd>

**providerId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — The lab account ID. This lab account is used to determine the availability of markers and lab tests.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getLabs() -> List&lt;ClientFacingLab&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET all the labs.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getLabs();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPaginated() -> LabTestResourcesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET lab tests the team has access to as a paginated list.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPaginated(
    GetPaginatedLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labTestLimit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**generationMethod:** `Optional<LabTestGenerationMethodFilter>` — Filter on whether auto-generated lab tests created by Vital, manually created lab tests, or all lab tests should be returned.
    
</dd>
</dl>

<dl>
<dd>

**labSlug:** `Optional<String>` — Filter by the slug of the lab for these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**collectionMethod:** `Optional<LabTestCollectionMethod>` — Filter by the collection method for these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<LabTestStatus>` — Filter by the status of these lab tests.
    
</dd>
</dl>

<dl>
<dd>

**markerIds:** `Optional<List<Integer>>` — Filter to only include lab tests containing these marker IDs.
    
</dd>
</dl>

<dl>
<dd>

**providerIds:** `Optional<List<String>>` — Filter to only include lab tests containing these provider IDs.
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Filter by the name of the lab test (a case-insensitive substring search).
    
</dd>
</dl>

<dl>
<dd>

**orderKey:** `Optional<GetPaginatedLabTestsRequestOrderKey>` 
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<GetPaginatedLabTestsRequestOrderDirection>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getLabTestCollectionInstructionPdf(labTestId) -> InputStream</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getLabTestCollectionInstructionPdf(
    "lab_test_id",
    GetLabTestCollectionInstructionPdfLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**labTestId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrders() -> GetOrdersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET many orders with filters.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrders(
    GetOrdersLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**searchInput:** `Optional<String>` — Search by order id, user id, patient name, shipping dob, or shipping recipient name.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 23:59:59
    
</dd>
</dl>

<dl>
<dd>

**updatedStartDate:** `Optional<OffsetDateTime>` — Date from in YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**updatedEndDate:** `Optional<OffsetDateTime>` — Date to YYYY-MM-DD or ISO formatted date time. If a date is provided without a time, the time will be set to 00:00:00
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<List<OrderLowLevelStatus>>` — Filter by low level status.
    
</dd>
</dl>

<dl>
<dd>

**orderKey:** `Optional<GetOrdersLabTestsRequestOrderKey>` — Order key to sort by.
    
</dd>
</dl>

<dl>
<dd>

**orderDirection:** `Optional<GetOrdersLabTestsRequestOrderDirection>` — Order direction to sort by.
    
</dd>
</dl>

<dl>
<dd>

**orderType:** `Optional<List<LabTestCollectionMethod>>` — Filter by method used to perform the lab test.
    
</dd>
</dl>

<dl>
<dd>

**isCritical:** `Optional<Boolean>` — Filter by critical order status.
    
</dd>
</dl>

<dl>
<dd>

**interpretation:** `Optional<Interpretation>` — Filter by result interpretation of the lab test.
    
</dd>
</dl>

<dl>
<dd>

**orderActivationTypes:** `Optional<List<OrderActivationType>>` — Filter by activation type.
    
</dd>
</dl>

<dl>
<dd>

**userId:** `Optional<String>` — Filter by user ID.
    
</dd>
</dl>

<dl>
<dd>

**patientName:** `Optional<String>` — Filter by patient name.
    
</dd>
</dl>

<dl>
<dd>

**shippingRecipientName:** `Optional<String>` — Filter by shipping recipient name.
    
</dd>
</dl>

<dl>
<dd>

**orderIds:** `Optional<List<String>>` — Filter by order ids.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPhlebotomyAppointmentAvailability(request) -> AppointmentAvailabilitySlots</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Return the available time slots to book an appointment with a phlebotomist
for the given address and order.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPhlebotomyAppointmentAvailability(
    GetPhlebotomyAppointmentAvailabilityLabTestsRequest
        .builder()
        .body(
            UsAddress
                .builder()
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zipCode("zip_code")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startDate:** `Optional<String>` — Start date for appointment availability
    
</dd>
</dl>

<dl>
<dd>

**request:** `UsAddress` — At-home phlebotomy appointment address.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.bookPhlebotomyAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Book an at-home phlebotomy appointment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().bookPhlebotomyAppointment(
    "order_id",
    BookPhlebotomyAppointmentLabTestsRequest
        .builder()
        .body(
            AppointmentBookingRequest
                .builder()
                .bookingKey("booking_key")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**request:** `AppointmentBookingRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.requestPhlebotomyAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Request an at-home phlebotomy appointment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().requestPhlebotomyAppointment(
    "order_id",
    RequestAppointmentRequest
        .builder()
        .address(
            UsAddress
                .builder()
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zipCode("zip_code")
                .build()
        )
        .provider(AppointmentProvider.GETLABS)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**address:** `UsAddress` — At-home phlebotomy appointment address.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `AppointmentProvider` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.reschedulePhlebotomyAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Reschedule a previously booked at-home phlebotomy appointment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().reschedulePhlebotomyAppointment(
    "order_id",
    ReschedulePhlebotomyAppointmentLabTestsRequest
        .builder()
        .body(
            AppointmentRescheduleRequest
                .builder()
                .bookingKey("booking_key")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**request:** `AppointmentRescheduleRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.cancelPhlebotomyAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Cancel a previously booked at-home phlebotomy appointment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().cancelPhlebotomyAppointment(
    "order_id",
    ApiApiV1EndpointsVitalApiLabTestingOrdersHelpersAppointmentCancelRequest
        .builder()
        .cancellationReasonId("cancellation_reason_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**cancellationReasonId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**notes:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPhlebotomyAppointmentCancellationReason() -> List&lt;ClientFacingAppointmentCancellationReason&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the list of reasons for cancelling an at-home phlebotomy appointment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPhlebotomyAppointmentCancellationReason();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPhlebotomyAppointment(orderId) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the appointment associated with an order.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPhlebotomyAppointment(
    "order_id",
    GetPhlebotomyAppointmentLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getAreaInfo() -> AreaInfo</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET information about an area with respect to lab-testing.

Information returned:
* Whether a given zip code is served by our Phlebotomy network.
* List of Lab locations in the area.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getAreaInfo(
    GetAreaInfoLabTestsRequest
        .builder()
        .zipCode("zip_code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**zipCode:** `String` — Zip code of the area to check
    
</dd>
</dl>

<dl>
<dd>

**radius:** `Optional<AllowedRadius>` — Radius in which to search in miles
    
</dd>
</dl>

<dl>
<dd>

**lab:** `Optional<ClientFacingLabs>` — Lab to check for PSCs
    
</dd>
</dl>

<dl>
<dd>

**labs:** `Optional<List<ClientFacingLabs>>` — List of labs to check for PSCs
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — Lab Account ID to use for availability checks
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPscInfo() -> PscInfo</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPscInfo(
    GetPscInfoLabTestsRequest
        .builder()
        .zipCode("zip_code")
        .labId(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**zipCode:** `String` — Zip code of the area to check
    
</dd>
</dl>

<dl>
<dd>

**labId:** `Integer` — Lab ID to check for PSCs
    
</dd>
</dl>

<dl>
<dd>

**radius:** `Optional<AllowedRadius>` — Radius in which to search in miles. Note that we limit to 30 PSCs.
    
</dd>
</dl>

<dl>
<dd>

**capabilities:** `Optional<List<LabLocationCapability>>` — Filter for only locations with certain capabilities
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` — Lab Account ID to use for availability checks
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrderPscInfo(orderId) -> PscInfo</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrderPscInfo(
    "order_id",
    GetOrderPscInfoLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**radius:** `Optional<AllowedRadius>` — Radius in which to search in miles
    
</dd>
</dl>

<dl>
<dd>

**capabilities:** `Optional<List<LabLocationCapability>>` — Filter for only locations with certain capabilities
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getResultPdf(orderId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint returns the lab results for the order.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getResultPdf(
    "order_id",
    GetResultPdfLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getResultMetadata(orderId) -> LabResultsMetadata</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Return metadata related to order results, such as lab metadata,
provider and sample dates.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getResultMetadata(
    "order_id",
    GetResultMetadataLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getResultRaw(orderId) -> LabResultsRaw</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Return both metadata and raw json test data
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getResultRaw(
    "order_id",
    GetResultRawLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getLabelsPdf(orderId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint returns the printed labels for the order.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getLabelsPdf(
    "order_id",
    GetLabelsPdfLabTestsRequest
        .builder()
        .collectionDate(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**numberOfLabels:** `Optional<Integer>` — Number of labels to generate
    
</dd>
</dl>

<dl>
<dd>

**collectionDate:** `OffsetDateTime` — Collection date
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPscAppointmentAvailability() -> AppointmentAvailabilitySlots</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPscAppointmentAvailability(
    GetPscAppointmentAvailabilityLabTestsRequest
        .builder()
        .lab("quest")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**lab:** `String` — Lab to check for availability
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<String>` — Start date for appointment availability
    
</dd>
</dl>

<dl>
<dd>

**siteCodes:** `Optional<List<String>>` — List of site codes to fetch availability for
    
</dd>
</dl>

<dl>
<dd>

**zipCode:** `Optional<String>` — Zip code of the area to check
    
</dd>
</dl>

<dl>
<dd>

**radius:** `Optional<AllowedRadius>` — Radius in which to search. (meters)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.bookPscAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().bookPscAppointment(
    "order_id",
    BookPscAppointmentLabTestsRequest
        .builder()
        .body(
            AppointmentBookingRequest
                .builder()
                .bookingKey("booking_key")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**request:** `AppointmentBookingRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.reschedulePscAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().reschedulePscAppointment(
    "order_id",
    ReschedulePscAppointmentLabTestsRequest
        .builder()
        .body(
            AppointmentRescheduleRequest
                .builder()
                .bookingKey("booking_key")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**request:** `AppointmentRescheduleRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.cancelPscAppointment(orderId, request) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().cancelPscAppointment(
    "order_id",
    VitalCoreClientsLabTestGetlabsSchemaAppointmentCancelRequest
        .builder()
        .cancellationReasonId("cancellationReasonId")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>

<dl>
<dd>

**cancellationReasonId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**note:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPscAppointmentCancellationReason() -> List&lt;ClientFacingAppointmentCancellationReason&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPscAppointmentCancellationReason();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getPscAppointment(orderId) -> ClientFacingAppointment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the appointment associated with an order.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getPscAppointment(
    "order_id",
    GetPscAppointmentLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrderCollectionInstructionPdf(orderId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET collection instructions for an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrderCollectionInstructionPdf(
    "order_id",
    GetOrderCollectionInstructionPdfLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrderRequistionPdf(orderId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET requisition pdf for an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrderRequistionPdf(
    "order_id",
    GetOrderRequistionPdfLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrderAbnPdf(orderId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET ABN pdf for an order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrderAbnPdf(
    "order_id",
    GetOrderAbnPdfLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.getOrder(orderId) -> ClientFacingOrder</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

GET individual order by ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().getOrder(
    "order_id",
    GetOrderLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.createOrder(request) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().createOrder(
    CreateOrderRequestCompatible
        .builder()
        .userId("user_id")
        .patientDetails(
            PatientDetailsWithValidation
                .builder()
                .firstName("first_name")
                .lastName("last_name")
                .dob("2023-01-15")
                .gender(Gender.FEMALE)
                .phoneNumber("phone_number")
                .email("email")
                .build()
        )
        .patientAddress(
            PatientAddressWithValidation
                .builder()
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zip("zip")
                .country("country")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**idempotencyKey:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**idempotencyError:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labTestId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**orderSet:** `Optional<OrderSetRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**collectionMethod:** `Optional<LabTestCollectionMethod>` 
    
</dd>
</dl>

<dl>
<dd>

**physician:** `Optional<PhysicianCreateRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**healthInsurance:** `Optional<HealthInsuranceCreateRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**priority:** `Optional<Boolean>` — Defines whether order is priority or not. For some labs, this refers to a STAT order.
    
</dd>
</dl>

<dl>
<dd>

**billingType:** `Optional<Billing>` 
    
</dd>
</dl>

<dl>
<dd>

**icdCodes:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**consents:** `Optional<List<Consent>>` 
    
</dd>
</dl>

<dl>
<dd>

**activateBy:** `Optional<String>` — Schedule an Order to be processed in a future date.
    
</dd>
</dl>

<dl>
<dd>

**aoeAnswers:** `Optional<List<AoEAnswer>>` 
    
</dd>
</dl>

<dl>
<dd>

**passthrough:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**creatorMemberId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**patientDetails:** `PatientDetailsWithValidation` 
    
</dd>
</dl>

<dl>
<dd>

**patientAddress:** `PatientAddressWithValidation` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.importOrder(request) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().importOrder(
    ImportOrderBody
        .builder()
        .userId("user_id")
        .billingType(Billing.CLIENT_BILL)
        .orderSet(
            OrderSetRequest
                .builder()
                .build()
        )
        .collectionMethod(LabTestCollectionMethod.TESTKIT)
        .patientDetails(
            PatientDetailsWithValidation
                .builder()
                .firstName("first_name")
                .lastName("last_name")
                .dob("2023-01-15")
                .gender(Gender.FEMALE)
                .phoneNumber("phone_number")
                .email("email")
                .build()
        )
        .patientAddress(
            PatientAddress
                .builder()
                .receiverName("receiver_name")
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zip("zip")
                .country("country")
                .build()
        )
        .sampleId("sample_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**billingType:** `Billing` 
    
</dd>
</dl>

<dl>
<dd>

**orderSet:** `OrderSetRequest` 
    
</dd>
</dl>

<dl>
<dd>

**collectionMethod:** `LabTestCollectionMethod` 
    
</dd>
</dl>

<dl>
<dd>

**physician:** `Optional<PhysicianCreateRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**patientDetails:** `PatientDetailsWithValidation` 
    
</dd>
</dl>

<dl>
<dd>

**patientAddress:** `PatientAddress` 
    
</dd>
</dl>

<dl>
<dd>

**sampleId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.cancelOrder(orderId) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

POST cancel order
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().cancelOrder(
    "order_id",
    CancelOrderLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.simulateOrderProcess(orderId, request) -> Object</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get available test kits.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().simulateOrderProcess(
    "order_id",
    SimulateOrderProcessLabTestsRequest
        .builder()
        .body(
            SimulationFlags
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**finalStatus:** `Optional<OrderStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**delay:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `Optional<SimulationFlags>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.updateOnSiteCollectionOrderDrawCompleted(orderId) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

PATCH update on site collection order when draw is completed
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().updateOnSiteCollectionOrderDrawCompleted(
    "order_id",
    UpdateOnSiteCollectionOrderDrawCompletedLabTestsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderId:** `String` — Your Order ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.labTests.validateIcdCodes(request) -> ValidateIcdCodesResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.labTests().validateIcdCodes(
    ValidateIcdCodesBody
        .builder()
        .codes(
            new ArrayList<String>(
                Arrays.asList("codes")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**codes:** `List<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Testkit
<details><summary><code>client.testkit.register(request) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.testkit().register(
    RegisterTestkitRequest
        .builder()
        .sampleId("sample_id")
        .patientDetails(
            PatientDetailsWithValidation
                .builder()
                .firstName("first_name")
                .lastName("last_name")
                .dob("2023-01-15")
                .gender(Gender.FEMALE)
                .phoneNumber("phone_number")
                .email("email")
                .build()
        )
        .patientAddress(
            PatientAddressWithValidation
                .builder()
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zip("zip")
                .country("country")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `Optional<String>` — The user ID of the patient.
    
</dd>
</dl>

<dl>
<dd>

**sampleId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**patientDetails:** `PatientDetailsWithValidation` 
    
</dd>
</dl>

<dl>
<dd>

**patientAddress:** `PatientAddressWithValidation` 
    
</dd>
</dl>

<dl>
<dd>

**physician:** `Optional<PhysicianCreateRequestBase>` 
    
</dd>
</dl>

<dl>
<dd>

**healthInsurance:** `Optional<HealthInsuranceCreateRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**consents:** `Optional<List<Consent>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.testkit.createOrder(request) -> PostOrderResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an order for an unregistered testkit
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.testkit().createOrder(
    CreateRegistrableTestkitOrderRequest
        .builder()
        .userId("user_id")
        .labTestId("lab_test_id")
        .shippingDetails(
            ShippingAddressWithValidation
                .builder()
                .receiverName("receiver_name")
                .firstLine("first_line")
                .city("city")
                .state("state")
                .zip("zip")
                .country("country")
                .phoneNumber("phone_number")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**labTestId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**shippingDetails:** `ShippingAddressWithValidation` 
    
</dd>
</dl>

<dl>
<dd>

**passthrough:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**labAccountId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Order
<details><summary><code>client.order.resendEvents(request) -> ResendWebhookResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Replay a webhook for a given set of orders
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.order().resendEvents(
    ResendWebhookBody
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**orderIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**startAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Insurance
<details><summary><code>client.insurance.searchGetPayorInfo() -> List&lt;ClientFacingPayorSearchResponse&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.insurance().searchGetPayorInfo(
    SearchGetPayorInfoInsuranceRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**insuranceName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<PayorCodeExternalProvider>` 
    
</dd>
</dl>

<dl>
<dd>

**providerPayorId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.insurance.searchPayorInfo(request) -> List&lt;ClientFacingPayorSearchResponseDeprecated&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.insurance().searchPayorInfo(
    PayorSearchRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**insuranceName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<PayorCodeExternalProvider>` 
    
</dd>
</dl>

<dl>
<dd>

**providerId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.insurance.searchDiagnosis() -> List&lt;ClientFacingDiagnosisInformation&gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.insurance().searchDiagnosis(
    SearchDiagnosisInsuranceRequest
        .builder()
        .diagnosisQuery("diagnosis_query")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**diagnosisQuery:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Payor
<details><summary><code>client.payor.createPayor(request) -> ClientFacingPayor</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.payor().createPayor(
    CreatePayorBody
        .builder()
        .name("name")
        .address(
            Address
                .builder()
                .firstLine("first_line")
                .country("country")
                .zip("zip")
                .city("city")
                .state("state")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**address:** `Address` 
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<PayorCodeExternalProvider>` 
    
</dd>
</dl>

<dl>
<dd>

**providerPayorId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Aggregate
<details><summary><code>client.aggregate.queryOne(userId, request) -> AggregationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.aggregate().queryOne(
    "user_id",
    QueryBatch
        .builder()
        .accept("*/*")
        .timeframe(
            QueryBatchTimeframe.ofRelativeTimeframe(
                RelativeTimeframe
                    .builder()
                    .type("relative")
                    .anchor("2023-01-15")
                    .past(
                        Period
                            .builder()
                            .unit(PeriodUnit.MINUTE)
                            .build()
                    )
                    .build()
            )
        )
        .queries(
            new ArrayList<Query>(
                Arrays.asList(
                    Query
                        .builder()
                        .select(
                            new ArrayList<QuerySelectItem>(
                                Arrays.asList(
                                    QuerySelectItem.ofAggregateExpr(
                                        AggregateExpr
                                            .builder()
                                            .arg(
                                                AggregateExprArg.ofSleepColumnExpr(
                                                    SleepColumnExpr
                                                        .builder()
                                                        .sleep(SleepColumnExprSleep.ID)
                                                        .build()
                                                )
                                            )
                                            .func(AggregateExprFunc.MEAN)
                                            .build()
                                    )
                                )
                            )
                        )
                        .build()
                )
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**accept:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**timeframe:** `QueryBatchTimeframe` 
    
</dd>
</dl>

<dl>
<dd>

**queries:** `List<Query>` 
    
</dd>
</dl>

<dl>
<dd>

**config:** `Optional<QueryConfig>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.aggregate.getResultTableForContinuousQuery(userId, queryIdOrSlug) -> AggregationResult</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.aggregate().getResultTableForContinuousQuery(
    "user_id",
    "query_id_or_slug",
    GetResultTableForContinuousQueryAggregateRequest
        .builder()
        .accept("*/*")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**queryIdOrSlug:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**accept:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.aggregate.getTaskHistoryForContinuousQuery(userId, queryIdOrSlug) -> ContinuousQueryTaskHistoryResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.aggregate().getTaskHistoryForContinuousQuery(
    "user_id",
    "query_id_or_slug",
    GetTaskHistoryForContinuousQueryAggregateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**queryIdOrSlug:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**nextCursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
