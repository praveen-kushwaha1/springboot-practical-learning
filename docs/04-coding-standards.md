# Coding Standards

- Prefer constructor injection; avoid field injection.
- Keep controllers thin. Put business rules in services.
- Use request/response DTOs instead of exposing persistence entities.
- Validate input at API boundaries.
- Use meaningful names and small methods.
- Keep secrets out of source control.
- Handle errors consistently and return useful API responses.
- Use transactions at service boundaries where a use case requires atomicity.
- Write tests for success, validation failure and exceptional paths.
- Add comments to explain non-obvious decisions, not to repeat the code.

## Suggested package structure

```text
com.example.application
├── config
├── controller
├── dto
│   ├── request
│   └── response
├── entity
├── exception
├── mapper
├── repository
├── security
└── service
```

## Commit message examples

```text
feat(rest): add customer CRUD endpoints
test(service): cover transfer failure scenarios
fix(jpa): avoid N+1 query in order listing
docs(learning): add transaction propagation notes
```
