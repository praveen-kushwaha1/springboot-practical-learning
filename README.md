
## 🌐 Learning Website

This repository includes a colorful MkDocs Material documentation website with search, dark mode, navigation, code highlighting and GitHub Pages deployment.

- Start locally: `python -m mkdocs serve`
- Website setup: see [README-WEBSITE-SETUP.md](README-WEBSITE-SETUP.md)
- Learning portal source: [`docs/`](docs/)

# Spring Boot Practical Learning

A Maven multi-module learning repository covering Spring Core through advanced Spring Boot, distributed systems, observability and practical projects.

## Requirements
- JDK 21
- Maven 3.9+
- IntelliJ IDEA or VS Code
- Docker Desktop (only for modules that need infrastructure)

## Build
From the repository root:
```bash
mvn clean verify
```

## Run a module 
```bash
mvn -pl spring-core spring-boot:run
```
For a project module:
```bash
mvn -pl projects/01-employee-management spring-boot:run
```

## Learning method
For each topic: read its `README.md`, run the example, inspect the output, run tests, then complete the exercise. Not every advanced topic is implemented yet; topic folders contain guided implementation notes and are intended to be completed in sequence. The first Spring Core, Boot Basics and MVC modules contain runnable examples to get started.

## Modules
See [learning roadmap](docs/00-learning-roadmap.md).
