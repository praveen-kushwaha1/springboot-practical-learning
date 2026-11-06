# Environment Setup

## Required tools

| Tool | Recommended baseline | Verify |
|---|---|---|
| JDK | 21 | `java -version` |
| Maven | 3.9+ | `mvn -version` |
| Git | Current stable | `git --version` |
| IntelliJ IDEA | Current version | Open the root `pom.xml` |
| Docker Desktop | Optional initially | `docker --version` |

## Windows PowerShell checks

```powershell
java -version
mvn -version
git --version
docker --version
```

## IntelliJ setup

1. Open the extracted project folder.
2. Choose the root `pom.xml` when importing as a Maven project.
3. Set Project SDK to JDK 21.
4. Allow Maven to reload and download dependencies.
5. Open the Maven tool window and run `clean`, then `verify`.

!!! warning "JDK and Maven compiler"
    Make sure IntelliJ's Project SDK, Maven runner JRE and Maven compiler release are aligned. A mismatch can cause errors such as `release version ... not supported`.
