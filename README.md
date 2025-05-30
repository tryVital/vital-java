# Vital Java Library

[![Maven Central](https://img.shields.io/maven-central/v/io.tryvital/vital-java)](https://central.sonatype.com/artifact/io.vital/vital-java/) 
[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-SDK%20generated%20by%20Fern-brightgreen)](https://github.com/fern-api/fern)

The Vital Java library provides access to the Vital API from applications written in Java.

## Documentation

API reference documentation is available [here](https://docs.tryvital.io/home/welcome).

## Installation

Add this dependency to your project's build file:

### Gradle

Add the dependency in your `build.gradle`:

```groovy
dependencies {
    implementation 'io.tryvital:vital-java:0.x.x'
}
```

### Maven

Add the dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>io.tryvital</groupId>
    <artifactId>vital-java</artifactId>
    <version>0.x.x</version>
</dependency>
```

## Usage

```java
import com.vital.api.Vital;

Vital vital = Vital.builder()
  .apiKey("YOUR_API_KEY")
  .build()

var labTest = vital.labTests().get('order-id')

print(labTest)
```

> **Please note**: To ensure future compatibility, we ask that you avoid exhaustive matching on enum values such as an order’s status. We may introduce new statuses (and other enum values) over time, and code that assumes all current values are exhaustive could break or fail to compile with SDK upgrades.
>
> To stay compatible and benefit from future enhancements, treat unknown values gracefully—for example, by using default cases or limiting checks to only the values your integration depends on.

## Handling Errors

All exceptions thrown by the SDK will sublcass [ApiError](./src/main/java/com/vital/api/core/ApiError.java).

```java
import com.vital.api.core.ApiError;

try {
    vital.labTests().get('order-id')
} catch (ApiError e) {
    e.getStatusCode();
    e.getBody();
}
```

## Environments

When you sign up to Vital you get access to two environments, Sandbox and Production.

| Environment URLs |                            |
| ---------------- | -------------------------- |
| `production`     | api.tryvital.io            |
| `production-eu`  | api.eu.tryvital.io         |
| `sandbox`        | api.sandbox.tryvital.io    |
| `sandbox-eu`     | api.sandbox.eu.tryvital.io |

By default, the SDK uses the `production` environment. See the snippet below
for an example on how ot change the environment.

```python
import com.vital.api.Vital;
import com.vital.api.core.Environment;

Vital vital = Vital.builder()
  .apiKey("YOUR_API_KEY")
  .environment(Environment.SANDBOX)
  .build()
```

## Beta status

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning the package version to a specific version in your build.gradle file. This way, you can install the same version each time without breaking changes unless you are intentionally looking for the latest version.

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. Additions made directly to this library would have to be moved over to our generation code, otherwise they would be overwritten upon the next generated release. Feel free to open a PR as a proof of concept, but know that we will not be able to merge it as-is. We suggest opening an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
