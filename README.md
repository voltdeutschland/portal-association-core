# Portal - Association Core

This repository contains the _Association Core_ of the Volt Germany Portal.
It is provided as a standalone, reusable module.   
It manages association master data, including offices, contact addresses, and hierarchical relations between associations.

## Features

- Master data management for associations
- Management of business office / headquarters data
- Contact address handling (postal, email, phone)
- Hierarchical relations between associations
- Reusable backend module (Java / Spring Boot)
- Integration-friendly design for other Volt Portal services

## Usage

Add the module as a dependency in your project (Maven example):

```xml
<dependency>
  <groupId>org.volt-portal</groupId>
  <artifactId>association-core-kit</artifactId>
  <version>*</version>
</dependency>
```

## Development

- Built with **Java 21** and **Spring Boot** 
- Versioning and release automation via **semantic-release** 
- Packaged and published via **GitHub Packages**

## License

This project is licensed under the MIT License.

## Contact

[portal@voltdeutschland.org](mailto:portal@voltdeutschland.org)