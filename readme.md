# spring-framework

## commands

```
mvn clean compile spring-boot:run
mvn test --debug
mvn dependency:tree
mvn clean install
```

## references

- [Consuming and Producing JSON](https://www.baeldung.com/spring-boot-json)

## endpoints

### module-01

POST /project
```
curl --location --request POST 'localhost:8080/project' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 1100,
    "name": "Testdrive",
    "dateCreated": "2021-12-10"
}'
```

GET /project?id
```
curl --location --request GET 'localhost:8080/project?id=1100'
```