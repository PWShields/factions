# factions
Demonstrator for Spring Boot, Spring Data, JPA with Jackson JSON REST API

## Technologies

- Java
- JPA with hibernate provider
- Spring Data, Boot
- Gradle
- JSON, Jackson
- H2


## Usage

To see all information for one Region:

../region/{id}

## Running Locally

From an IDE run the FactionsApplication class and then navigate to
localhost:8081/region/1

Note that we are using Spring Profiles for configuration, this means
you will need to make sure "application.properties" is pointing at
"application-local.properties" when running locally.

## View In memory database console

http://localhost:8081/console

jdbc:h2:mem:testdb
puffin
puffin


