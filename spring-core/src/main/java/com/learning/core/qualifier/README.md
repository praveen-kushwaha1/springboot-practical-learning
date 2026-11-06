# Constructor injection and @Qualifier

Two beans implement `MessageSender`. The service requests `emailSender` with `@Qualifier`, so Spring can resolve the dependency unambiguously.

Run:
```bash
mvn -pl spring-core spring-boot:run
```
Expected output includes:
```text
EMAIL: Spring Core is running
```

Exercise: change the qualifier to `smsSender`, run again, and compare the output.
