# swagger-java-client

Warenkorb REST Service
- API version: 1
  - Build date: 2020-01-21T11:17:18.917+01:00

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ch.swisslife.warenkorb.server.rest.*;
import ch.swisslife.warenkorb.server.rest.auth.*;
import ch.swisslife.warenkorb.server.rest.model.*;
import ch.swisslife.warenkorb.server.rest.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        BestellungDto bestellung = new BestellungDto(); // BestellungDto | Bestellung
        try {
            apiInstance.addToBestelltListe(bestellung);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addToBestelltListe");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/warenkorb-api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addToBestelltListe**](docs/DefaultApi.md#addToBestelltListe) | **POST** /addToBestellList | Fuegt eine Bestellung zur Bestellliste hinzu. 
*DefaultApi* | [**addToWarenkorb**](docs/DefaultApi.md#addToWarenkorb) | **POST** /addToWarenkorb | Fuegt ein Produkt zum Warenkorb hinzu. 
*DefaultApi* | [**getProduktListe**](docs/DefaultApi.md#getProduktListe) | **GET** /getAllProducts | Gibt alle verfuegbaren Produkte zur�ck. 
*DefaultApi* | [**getWarenkorb**](docs/DefaultApi.md#getWarenkorb) | **GET** /getWarenkorb | Gibt den Warenkorb zurueck. 


## Documentation for Models

 - [BestellungDto](docs/BestellungDto.md)
 - [KundeDto](docs/KundeDto.md)
 - [ProduktDto](docs/ProduktDto.md)
 - [ProduktListeDto](docs/ProduktListeDto.md)
 - [WarenkorbDto](docs/WarenkorbDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


