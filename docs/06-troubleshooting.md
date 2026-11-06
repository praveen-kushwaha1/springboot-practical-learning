# Troubleshooting

## `release version ... not supported`

- Check `java -version`.
- Check `mvn -version`; Maven may use a different JDK from IntelliJ.
- Set IntelliJ Project SDK and Maven runner JRE to JDK 21.
- Reload Maven after changing the JDK.

## Port already in use

Windows:

```powershell
netstat -ano | findstr :8083
taskkill /PID <PID> /F
```

## Maven dependency or parent resolution issue

```powershell
mvn -U clean verify
```

Check network access and Maven `settings.xml` if dependency downloads fail.

## Application starts but endpoint fails

- Confirm the application is running.
- Check the configured server port.
- Check the request path and HTTP method.
- Read the first meaningful exception in the application logs.
- Verify database/container dependencies are healthy.

## Docker service does not start

```powershell
docker ps -a
docker logs <container-name>
```

Do not change several configuration values at once. Change one thing, restart, and verify.
