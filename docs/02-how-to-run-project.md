# How to Run the Project

## First run

From the project root:

```powershell
mvn clean verify
```

Run the Spring Core example:

```powershell
mvn -pl spring-core spring-boot:run
```

Run the Spring Boot Basics example:

```powershell
mvn -pl spring-boot-basics spring-boot:run
```

Run the REST example:

```powershell
mvn -pl spring-mvc-rest spring-boot:run
```

Then open:

```text
http://localhost:8083/api/hello
```

## Run a single module's tests

```powershell
mvn -pl spring-core test
```

## Useful Maven commands

```powershell
mvn clean
mvn test
mvn package
mvn clean verify
mvn -pl spring-core -am test
```

`-pl` selects a module. `-am` also builds required modules.

!!! note
    Some advanced modules are learning scaffolds with exercises rather than finished production services. Follow each module README and implement the tasks in sequence.
