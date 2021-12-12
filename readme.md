# spring-framework

Code, concepts, and references taken from [Baeldung](https://courses.baeldung.com/courses).

## commands

```
mvn clean compile spring-boot:run
mvn test --debug
mvn dependency:tree
mvn clean install
```

## endpoints

### module-01

```
curl --location --request POST 'localhost:8080/project' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 1100,
    "name": "Testdrive",
    "dateCreated": "2021-12-10"
}'
```

```
curl --location --request GET 'localhost:8080/project?id=1100'
```

## references

- [Consuming and Producing JSON](https://www.baeldung.com/spring-boot-json)
- [Hooking](https://en.wikipedia.org/wiki/Hooking)
- [Integration Tests by Fowler](https://martinfowler.com/bliki/IntegrationTest.html)
- [IoC by Fowler](https://martinfowler.com/articles/injection.html)
- [Maven Transitive Dependencies](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Transitive_Dependencies)
- [SLF4J Simple Logging Facade for Java](http://www.slf4j.org/)
- [Spring Beans](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)
- [Spring Configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config)
- [Spring Framework](https://spring.io/projects/spring-framework)
- [TDD by Fowler](https://martinfowler.com/bliki/TestDrivenDevelopment.html)