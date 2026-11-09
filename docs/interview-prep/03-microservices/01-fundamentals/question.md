
# Microservices Interview Questions — Deduplicated

[← Concepts](concept.md) | [View Answers](answer.md)

This question bank consolidates the supplied lists, removes repeated questions, and groups the remaining questions by topic.

**How to use:** Questions are numbered separately within each category, starting at 1 and continuing to that category’s final question. Numbering restarts at 1 in the next category. Every question links to the closest relevant answer section listed in the supplied `answer.md` table of contents. For a few broader or scenario-style questions, the link opens the most relevant supporting answer rather than a separately titled answer.

## Contents

1. [Microservices Fundamentals](#microservices-fundamentals) — 13 questions
2. [Monolith vs Microservices](#monolith-vs-microservices) — 10 questions
3. [Service Design and Boundaries](#service-design-and-boundaries) — 16 questions
4. [Microservices Trade-offs](#microservices-trade-offs) — 10 questions
5. [Database Management](#database-management) — 20 questions
6. [Inter-Service Communication](#inter-service-communication) — 26 questions
7. [API Gateway](#api-gateway) — 13 questions
8. [Service Discovery and Load Balancing](#service-discovery-and-load-balancing) — 13 questions
9. [Resilience and Fault Tolerance](#resilience-and-fault-tolerance) — 15 questions
10. [Event-Driven Architecture and Kafka](#event-driven-architecture-and-kafka) — 18 questions
11. [Security in Microservices](#security-in-microservices) — 14 questions
12. [Configuration Management](#configuration-management) — 9 questions
13. [Observability, Logging, and Monitoring](#observability-logging-and-monitoring) — 14 questions
14. [Deployment, Docker, and Kubernetes](#deployment-docker-and-kubernetes) — 16 questions
15. [Microservices Testing](#microservices-testing) — 10 questions
16. [Advanced Microservices Design Patterns](#advanced-microservices-design-patterns) — 11 questions
17. [Scenario-Based Microservices Interview Questions](#scenario-based-microservices-interview-questions) — 14 questions
18. [Spring Boot Microservices Interview Questions](#spring-boot-microservices-interview-questions) — 13 questions
19. [Additional Advanced Microservices Questions](#additional-advanced-microservices-questions) — 29 questions

## Microservices Fundamentals

1. [What are Microservices?](answer.md#1-what-are-microservices)
2. [Why do we use Microservices?](answer.md#2-why-do-we-use-microservices)
3. [What are the advantages and disadvantages of Microservices?](answer.md#3-what-are-the-advantages-and-disadvantages-of-microservices)
4. [When should we use Microservices?](answer.md#4-when-should-we-use-microservices)
5. [How does Microservice Architecture work?](answer.md#5-how-does-microservice-architecture-work)
6. [What are the characteristics of Microservices?](answer.md#6-what-are-the-characteristics-of-microservices)
7. [What is a Microservice Architecture?](answer.md#7-what-is-a-microservice-architecture)
8. [What is the difference between SOA and Microservices?](answer.md#8-what-is-the-difference-between-soa-and-microservices)
9. [What is the difference between Monolithic, SOA, and Microservices Architecture?](answer.md#9-what-is-the-difference-between-monolithic-soa-and-microservices-architecture)
10. [What are the challenges of Microservices Architecture?](answer.md#10-what-are-the-challenges-of-microservices-architecture)
11. [What are the main features of Microservices?](answer.md#6-what-are-the-characteristics-of-microservices)
12. [Why would you choose Microservices over Monolithic Architecture, or vice versa?](answer.md#1-monolith-vs-microservices)
13. [What is an idempotent API, and how do you design one?](answer.md#13-what-is-idempotency-in-microservices)

## Monolith vs Microservices

1. [Monolith vs Microservices?](answer.md#1-monolith-vs-microservices)
2. [What is Monolithic Architecture?](answer.md#2-what-is-monolithic-architecture)
3. [What are the advantages and disadvantages of Monolithic Architecture?](answer.md#3-what-are-the-advantages-and-disadvantages-of-monolithic-architecture)
4. [Why do we migrate from Monolith to Microservices?](answer.md#4-why-do-we-migrate-from-monolith-to-microservices)
5. [When should we choose Monolithic Architecture over Microservices?](answer.md#5-when-should-we-choose-monolithic-architecture-over-microservices)
6. [What is a Modular Monolith?](answer.md#6-what-is-a-modular-monolith)
7. [Modular Monolith vs Microservices?](answer.md#7-modular-monolith-vs-microservices)
8. [How do you migrate a Monolithic application to Microservices?](answer.md#8-how-do-you-migrate-a-monolithic-application-to-microservices)
9. [What is the Strangler Fig Pattern?](answer.md#9-what-is-the-strangler-fig-pattern)
10. [What are the challenges of migrating from Monolith to Microservices?](answer.md#10-what-are-the-challenges-of-migrating-from-monolith-to-microservices)

## Service Design and Boundaries

1. [How do you identify service boundaries?](answer.md#1-how-do-you-identify-service-boundaries)
2. [What is a Bounded Context?](answer.md#2-what-is-a-bounded-context)
3. [What is Domain-Driven Design (DDD)?](answer.md#3-what-is-domain-driven-design-ddd)
4. [What is a Domain Model?](answer.md#4-what-is-a-domain-model)
5. [What is a Business Capability?](answer.md#5-what-is-a-business-capability)
6. [How do you decide the size of a Microservice?](answer.md#6-how-do-you-decide-the-size-of-a-microservice)
7. [What is the Single Responsibility Principle in Microservices?](answer.md#7-what-is-the-single-responsibility-principle-in-microservices)
8. [What is High Cohesion and Low Coupling?](answer.md#8-what-is-high-cohesion-and-low-coupling)
9. [What is the difference between a Service and a Component?](answer.md#9-what-is-the-difference-between-a-service-and-a-component)
10. [How do you avoid creating too many Microservices?](answer.md#10-how-do-you-avoid-creating-too-many-microservices)
11. [What is a Distributed Monolith?](answer.md#11-what-is-a-distributed-monolith)
12. [How do you prevent a Distributed Monolith?](answer.md#12-how-do-you-prevent-a-distributed-monolith)
13. [How do you design and implement a Microservice?](answer.md#1-how-do-you-create-a-microservice-using-spring-boot)
14. [How do you ensure a Microservices application can handle more users?](answer.md#6-how-do-you-scale-a-microservice-during-high-traffic)
15. [What are common Microservices anti-patterns, and how do you avoid them?](answer.md#11-what-is-a-distributed-monolith)
16. [What are the challenges of implementing Microservices, and how do you address them?](answer.md#10-what-are-the-challenges-of-microservices-architecture)

## Microservices Trade-offs

1. [What are the trade-offs of Microservices?](answer.md#1-what-are-the-trade-offs-of-microservices)
2. [What is the CAP Theorem?](answer.md#2-what-is-the-cap-theorem)
3. [What is Eventual Consistency?](answer.md#3-what-is-eventual-consistency)
4. [What is Strong Consistency?](answer.md#4-what-is-strong-consistency)
5. [What is the difference between Strong Consistency and Eventual Consistency?](answer.md#5-what-is-the-difference-between-strong-consistency-and-eventual-consistency)
6. [What is Distributed Computing?](answer.md#6-what-is-distributed-computing)
7. [What are the challenges of Distributed Systems?](answer.md#7-what-are-the-challenges-of-distributed-systems)
8. [What is Network Partitioning?](answer.md#8-what-is-network-partitioning)
9. [How do you handle partial failures in Microservices?](answer.md#9-how-do-you-handle-partial-failures-in-microservices)
10. [How do you design a fault-tolerant Microservices system?](answer.md#10-how-do-you-design-a-fault-tolerant-microservices-system)

## Database Management

1. [How do you handle Database-per-Service?](answer.md#1-how-do-you-handle-database-per-service)
2. [What is Database-per-Service Pattern?](answer.md#2-what-is-database-per-service-pattern)
3. [Why should each Microservice own its database?](answer.md#3-why-should-each-microservice-own-its-database)
4. [Can multiple Microservices share the same database?](answer.md#4-can-multiple-microservices-share-the-same-database)
5. [How do Microservices communicate with each other's data?](answer.md#5-how-do-microservices-communicate-with-each-others-data)
6. [How do you maintain data consistency across Microservices?](answer.md#6-how-do-you-maintain-data-consistency-across-microservices)
7. [What is Distributed Transaction?](answer.md#7-what-is-distributed-transaction)
8. [What is the Two-Phase Commit (2PC) Protocol?](answer.md#8-what-is-the-two-phase-commit-2pc-protocol)
9. [What is the Saga Pattern?](answer.md#9-what-is-the-saga-pattern)
10. [What is the difference between Saga and 2PC?](answer.md#10-what-is-the-difference-between-saga-and-2pc)
11. [What is CQRS?](answer.md#11-what-is-cqrs)
12. [What is Event Sourcing?](answer.md#12-what-is-event-sourcing)
13. [What is the Outbox Pattern?](answer.md#13-what-is-the-outbox-pattern)
14. [What is the CDC Pattern?](answer.md#14-what-is-the-cdc-pattern)
15. [How do you handle database schema changes in Microservices?](answer.md#15-how-do-you-handle-database-schema-changes-in-microservices)
16. [What is the difference between Saga and Two-Phase Commit (2PC)? Which one would you prefer and why?](answer.md#10-what-is-the-difference-between-saga-and-2pc)
17. [How do you handle failures and maintain data consistency in synchronous Microservices?](answer.md#6-how-do-you-maintain-data-consistency-across-microservices)
18. [What is a distributed transaction, and how do you implement it without 2PC?](answer.md#9-what-is-the-saga-pattern)
19. [What is data ownership in Microservices?](answer.md#3-why-should-each-microservice-own-its-database)
20. [How do you manage database schema changes with zero downtime?](answer.md#15-how-do-you-handle-database-schema-changes-in-microservices)

## Inter-Service Communication

1. [How do Microservices communicate with each other?](answer.md#1-how-do-microservices-communicate-with-each-other)
2. [What is Synchronous Communication?](answer.md#2-what-is-synchronous-communication)
3. [What is Asynchronous Communication?](answer.md#3-what-is-asynchronous-communication)
4. [REST API vs Messaging in Microservices?](answer.md#4-rest-api-vs-messaging-in-microservices)
5. [What is RESTful Communication?](answer.md#5-what-is-restful-communication)
6. [What is gRPC?](answer.md#6-what-is-grpc)
7. [REST vs gRPC?](answer.md#7-rest-vs-grpc)
8. [What is OpenFeign?](answer.md#8-what-is-openfeign)
9. [What is WebClient in Spring Boot?](answer.md#9-what-is-webclient-in-spring-boot)
10. [RestTemplate vs WebClient vs OpenFeign?](answer.md#10-resttemplate-vs-webclient-vs-openfeign)
11. [How do you handle timeouts between Microservices?](answer.md#11-how-do-you-handle-timeouts-between-microservices)
12. [How do you handle retries in Microservices?](answer.md#12-how-do-you-handle-retries-in-microservices)
13. [What is Idempotency in Microservices?](answer.md#13-what-is-idempotency-in-microservices)
14. [How do you prevent duplicate requests?](answer.md#14-how-do-you-prevent-duplicate-requests)
15. [What is API Versioning?](answer.md#15-what-is-api-versioning)
16. [What are the different ways to communicate between Microservices?](answer.md#1-how-do-microservices-communicate-with-each-other)
17. [What happens if the message broker goes down?](answer.md#16-how-do-you-handle-failed-message-processing)
18. [What are the types of asynchronous communication? What is Point-to-Point (PTP) communication?](answer.md#3-what-is-asynchronous-communication)
19. [What is Publish-Subscribe (Pub/Sub) asynchronous communication?](answer.md#3-what-is-asynchronous-communication)
20. [What is Event-Based asynchronous communication?](answer.md#1-what-is-event-driven-architecture)
21. [How does synchronous and asynchronous communication work in Microservices?](answer.md#2-what-is-synchronous-communication)
22. [What communication methods have you used in your project, and why? Explain the pros and cons of each communication method.](answer.md#4-rest-api-vs-messaging-in-microservices)
23. [When should you use synchronous communication versus asynchronous communication?](answer.md#4-rest-api-vs-messaging-in-microservices)
24. [What is the conclusion or key difference between synchronous and asynchronous communication?](answer.md#4-rest-api-vs-messaging-in-microservices)
25. [How do you maintain a session between two Microservices?](answer.md#11-how-do-you-secure-service-to-service-communication)
26. [How do you handle versioning in Microservices?](answer.md#15-what-is-api-versioning)

## API Gateway

1. [What is an API Gateway?](answer.md#1-what-is-an-api-gateway)
2. [Why do we need an API Gateway in Microservices?](answer.md#2-why-do-we-need-an-api-gateway-in-microservices)
3. [What are the responsibilities of an API Gateway?](answer.md#3-what-are-the-responsibilities-of-an-api-gateway)
4. [What is Spring Cloud Gateway?](answer.md#4-what-is-spring-cloud-gateway)
5. [How does Spring Cloud Gateway work?](answer.md#5-how-does-spring-cloud-gateway-work)
6. [What is the difference between API Gateway and Load Balancer?](answer.md#6-what-is-the-difference-between-api-gateway-and-load-balancer)
7. [What is Gateway Routing?](answer.md#7-what-is-gateway-routing)
8. [What are Gateway Filters?](answer.md#8-what-are-gateway-filters)
9. [What is Rate Limiting in API Gateway?](answer.md#9-what-is-rate-limiting-in-api-gateway)
10. [How do you secure an API Gateway?](answer.md#10-how-do-you-secure-an-api-gateway)
11. [What is the Backend for Frontend (BFF) Pattern?](answer.md#11-what-is-the-backend-for-frontend-bff-pattern)
12. [What are the disadvantages of an API Gateway?](answer.md#12-what-are-the-disadvantages-of-an-api-gateway)
13. [What is an API Gateway? Explain its role, features, working, and benefits in Microservices Architecture.](answer.md#3-what-are-the-responsibilities-of-an-api-gateway)

## Service Discovery and Load Balancing

1. [What is Service Discovery?](answer.md#1-what-is-service-discovery)
2. [Why do we need Service Discovery?](answer.md#2-why-do-we-need-service-discovery)
3. [What is Netflix Eureka?](answer.md#3-what-is-netflix-eureka)
4. [How does Eureka Server work?](answer.md#4-how-does-eureka-server-work)
5. [What is Eureka Client?](answer.md#5-what-is-eureka-client)
6. [What is Service Registry?](answer.md#6-what-is-service-registry)
7. [What is Client-Side Load Balancing?](answer.md#7-what-is-client-side-load-balancing)
8. [What is Server-Side Load Balancing?](answer.md#8-what-is-server-side-load-balancing)
9. [Client-Side vs Server-Side Load Balancing?](answer.md#9-client-side-vs-server-side-load-balancing)
10. [What is Spring Cloud LoadBalancer?](answer.md#10-what-is-spring-cloud-loadbalancer)
11. [What happens if Eureka Server goes down?](answer.md#11-what-happens-if-eureka-server-goes-down)
12. [How does Eureka handle service failures?](answer.md#12-how-does-eureka-handle-service-failures)
13. [What is Eureka Self-Preservation Mode?](answer.md#13-what-is-eureka-self-preservation-mode)

## Resilience and Fault Tolerance

1. [What is Fault Tolerance in Microservices?](answer.md#1-what-is-fault-tolerance-in-microservices)
2. [What is Resilience in Microservices?](answer.md#2-what-is-resilience-in-microservices)
3. [What is the Circuit Breaker Pattern?](answer.md#3-what-is-the-circuit-breaker-pattern)
4. [How does a Circuit Breaker work?](answer.md#4-how-does-a-circuit-breaker-work)
5. [What are the states of a Circuit Breaker?](answer.md#5-what-are-the-states-of-a-circuit-breaker)
6. [What is Resilience4j?](answer.md#6-what-is-resilience4j)
7. [What is Retry Pattern?](answer.md#7-what-is-retry-pattern)
8. [What is Rate Limiting?](answer.md#8-what-is-rate-limiting)
9. [What is Bulkhead Pattern?](answer.md#9-what-is-bulkhead-pattern)
10. [What is Timeout Pattern?](answer.md#10-what-is-timeout-pattern)
11. [What is Fallback Mechanism?](answer.md#11-what-is-fallback-mechanism)
12. [Retry vs Circuit Breaker?](answer.md#12-retry-vs-circuit-breaker)
13. [Circuit Breaker vs Bulkhead?](answer.md#13-circuit-breaker-vs-bulkhead)
14. [How do you prevent cascading failures?](answer.md#14-how-do-you-prevent-cascading-failures)
15. [How do you implement Resilience4j in Spring Boot?](answer.md#15-how-do-you-implement-resilience4j-in-spring-boot)

## Event-Driven Architecture and Kafka

1. [What is Event-Driven Architecture?](answer.md#1-what-is-event-driven-architecture)
2. [Why do we use Event-Driven Architecture in Microservices?](answer.md#2-why-do-we-use-event-driven-architecture-in-microservices)
3. [What is Apache Kafka?](answer.md#3-what-is-apache-kafka)
4. [How does Kafka work in Microservices?](answer.md#4-how-does-kafka-work-in-microservices)
5. [What is a Kafka Producer?](answer.md#5-what-is-a-kafka-producer)
6. [What is a Kafka Consumer?](answer.md#6-what-is-a-kafka-consumer)
7. [What is a Kafka Topic?](answer.md#7-what-is-a-kafka-topic)
8. [What is a Kafka Partition?](answer.md#8-what-is-a-kafka-partition)
9. [What is a Kafka Consumer Group?](answer.md#9-what-is-a-kafka-consumer-group)
10. [What is the difference between Kafka and RabbitMQ?](answer.md#10-what-is-the-difference-between-kafka-and-rabbitmq)
11. [What is Message Ordering in Kafka?](answer.md#11-what-is-message-ordering-in-kafka)
12. [What is At-Least-Once Delivery?](answer.md#12-what-is-at-least-once-delivery)
13. [What is At-Most-Once Delivery?](answer.md#13-what-is-at-most-once-delivery)
14. [What is Exactly-Once Processing?](answer.md#14-what-is-exactly-once-processing)
15. [How do you handle duplicate Kafka messages?](answer.md#15-how-do-you-handle-duplicate-kafka-messages)
16. [How do you handle failed message processing?](answer.md#16-how-do-you-handle-failed-message-processing)
17. [What is a Dead Letter Queue (DLQ)?](answer.md#17-what-is-a-dead-letter-queue-dlq)
18. [What is the Transactional Outbox Pattern with Kafka?](answer.md#18-what-is-the-transactional-outbox-pattern-with-kafka)

## Security in Microservices

1. [How do you secure Microservices?](answer.md#1-how-do-you-secure-microservices)
2. [What is Authentication?](answer.md#2-what-is-authentication)
3. [What is Authorization?](answer.md#3-what-is-authorization)
4. [Authentication vs Authorization?](answer.md#4-authentication-vs-authorization)
5. [What is JWT?](answer.md#5-what-is-jwt)
6. [How does JWT Authentication work in Microservices?](answer.md#6-how-does-jwt-authentication-work-in-microservices)
7. [What is OAuth 2.0?](answer.md#7-what-is-oauth-20)
8. [What is OpenID Connect (OIDC)?](answer.md#8-what-is-openid-connect-oidc)
9. [JWT vs OAuth 2.0?](answer.md#9-jwt-vs-oauth-20)
10. [How do you implement Spring Security in Microservices?](answer.md#10-how-do-you-implement-spring-security-in-microservices)
11. [How do you secure service-to-service communication?](answer.md#11-how-do-you-secure-service-to-service-communication)
12. [What is Mutual TLS (mTLS)?](answer.md#12-what-is-mutual-tls-mtls)
13. [How do you manage secrets in Microservices?](answer.md#13-how-do-you-manage-secrets-in-microservices)
14. [What is Role-Based Access Control (RBAC)?](answer.md#14-what-is-role-based-access-control-rbac)

## Configuration Management

1. [What is Centralized Configuration in Microservices?](answer.md#1-what-is-centralized-configuration-in-microservices)
2. [Why do we need a Config Server?](answer.md#2-why-do-we-need-a-config-server)
3. [What is Spring Cloud Config Server?](answer.md#3-what-is-spring-cloud-config-server)
4. [How does Spring Cloud Config work?](answer.md#4-how-does-spring-cloud-config-work)
5. [What is Config Client?](answer.md#5-what-is-config-client)
6. [How do you refresh configuration without restarting a service?](answer.md#6-how-do-you-refresh-configuration-without-restarting-a-service)
7. [What is @RefreshScope?](answer.md#7-what-is-refreshscope)
8. [How do you manage environment-specific configurations?](answer.md#8-how-do-you-manage-environment-specific-configurations)
9. [How do you secure Config Server?](answer.md#9-how-do-you-secure-config-server)

## Observability, Logging, and Monitoring

1. [What is Observability in Microservices?](answer.md#1-what-is-observability-in-microservices)
2. [What are the three pillars of Observability?](answer.md#2-what-are-the-three-pillars-of-observability)
3. [What is Centralized Logging?](answer.md#3-what-is-centralized-logging)
4. [What is the ELK Stack?](answer.md#4-what-is-the-elk-stack)
5. [What is Distributed Tracing?](answer.md#5-what-is-distributed-tracing)
6. [What is Zipkin?](answer.md#6-what-is-zipkin)
7. [What is OpenTelemetry?](answer.md#7-what-is-opentelemetry)
8. [What is Prometheus?](answer.md#8-what-is-prometheus)
9. [What is Grafana?](answer.md#9-what-is-grafana)
10. [Prometheus vs Grafana?](answer.md#10-prometheus-vs-grafana)
11. [How do you monitor Microservices?](answer.md#11-how-do-you-monitor-microservices)
12. [How do you trace a request across multiple Microservices?](answer.md#12-how-do-you-trace-a-request-across-multiple-microservices)
13. [What is Correlation ID?](answer.md#13-what-is-correlation-id)
14. [What is the difference between Logs, Metrics, and Traces?](answer.md#14-what-is-the-difference-between-logs-metrics-and-traces)

## Deployment, Docker, and Kubernetes

1. [How do you deploy Microservices?](answer.md#1-how-do-you-deploy-microservices)
2. [What is Docker?](answer.md#2-what-is-docker)
3. [Why do we use Docker in Microservices?](answer.md#3-why-do-we-use-docker-in-microservices)
4. [What is a Docker Container?](answer.md#4-what-is-a-docker-container)
5. [What is Docker Compose?](answer.md#5-what-is-docker-compose)
6. [What is Kubernetes?](answer.md#6-what-is-kubernetes)
7. [Docker vs Kubernetes?](answer.md#7-docker-vs-kubernetes)
8. [How does Kubernetes manage Microservices?](answer.md#8-how-does-kubernetes-manage-microservices)
9. [What is a Kubernetes Pod?](answer.md#9-what-is-a-kubernetes-pod)
10. [What is a Kubernetes Deployment?](answer.md#10-what-is-a-kubernetes-deployment)
11. [What is a Kubernetes Service?](answer.md#11-what-is-a-kubernetes-service)
12. [What is Horizontal Pod Autoscaling (HPA)?](answer.md#12-what-is-horizontal-pod-autoscaling-hpa)
13. [What is CI/CD in Microservices?](answer.md#13-what-is-cicd-in-microservices)
14. [How do you implement Zero-Downtime Deployment?](answer.md#14-how-do-you-implement-zero-downtime-deployment)
15. [What is Blue-Green Deployment?](answer.md#15-what-is-blue-green-deployment)
16. [What is Canary Deployment?](answer.md#16-what-is-canary-deployment)

## Microservices Testing

1. [How do you test Microservices?](answer.md#1-how-do-you-test-microservices)
2. [What is Unit Testing in Microservices?](answer.md#2-what-is-unit-testing-in-microservices)
3. [What is Integration Testing?](answer.md#3-what-is-integration-testing)
4. [What is Contract Testing?](answer.md#4-what-is-contract-testing)
5. [What is Consumer-Driven Contract Testing?](answer.md#5-what-is-consumer-driven-contract-testing)
6. [What is End-to-End Testing?](answer.md#6-what-is-end-to-end-testing)
7. [What is the difference between Integration Testing and Contract Testing?](answer.md#7-what-is-the-difference-between-integration-testing-and-contract-testing)
8. [How do you test service-to-service communication?](answer.md#8-how-do-you-test-service-to-service-communication)
9. [What is Testcontainers?](answer.md#9-what-is-testcontainers)
10. [How do you mock external Microservices?](answer.md#10-how-do-you-mock-external-microservices)

## Advanced Microservices Design Patterns

1. [What are Microservices Design Patterns?](answer.md#1-what-are-microservices-design-patterns)
2. [What is the CQRS Pattern?](answer.md#3-what-is-the-cqrs-pattern)
3. [What is the Event Sourcing Pattern?](answer.md#4-what-is-the-event-sourcing-pattern)
4. [What is the Sidecar Pattern?](answer.md#6-what-is-the-sidecar-pattern)
5. [What is the Ambassador Pattern?](answer.md#7-what-is-the-ambassador-pattern)
6. [What is the Anti-Corruption Layer Pattern?](answer.md#8-what-is-the-anti-corruption-layer-pattern)
7. [What is the API Composition Pattern?](answer.md#9-what-is-the-api-composition-pattern)
8. [What is the Service Mesh Pattern?](answer.md#10-what-is-the-service-mesh-pattern)
9. [What is the Retry Pattern?](answer.md#11-what-is-the-retry-pattern)
10. [What is the Bulkhead Pattern?](answer.md#13-what-is-the-bulkhead-pattern)
11. [What is the Cache-Aside Pattern?](answer.md#14-what-is-the-cache-aside-pattern)

## Scenario-Based Microservices Interview Questions

1. [How would you design an E-Commerce application using Microservices?](answer.md#1-how-would-you-design-an-e-commerce-application-using-microservices)
2. [How do you handle a Payment Service failure during order placement?](answer.md#2-how-do-you-handle-a-payment-service-failure-during-order-placement)
3. [What happens if one Microservice is down?](answer.md#3-what-happens-if-one-microservice-is-down)
4. [How do you handle millions of requests in Microservices?](answer.md#5-how-do-you-handle-millions-of-requests-in-microservices)
5. [How do you scale a Microservice during high traffic?](answer.md#6-how-do-you-scale-a-microservice-during-high-traffic)
6. [How do you maintain data consistency between Order and Payment Services?](answer.md#7-how-do-you-maintain-data-consistency-between-order-and-payment-services)
7. [How do you handle duplicate order requests?](answer.md#8-how-do-you-handle-duplicate-order-requests)
8. [How do you design a highly available Microservices system?](answer.md#9-how-do-you-design-a-highly-available-microservices-system)
9. [How do you debug a slow API involving multiple Microservices?](answer.md#10-how-do-you-debug-a-slow-api-involving-multiple-microservices)
10. [How do you handle service version compatibility?](answer.md#11-how-do-you-handle-service-version-compatibility)
11. [How do you handle a database failure in a Microservice?](answer.md#12-how-do-you-handle-a-database-failure-in-a-microservice)
12. [How do you design a notification system using Microservices?](answer.md#13-how-do-you-design-a-notification-system-using-microservices)
13. [How do you design a URL Shortener using Microservices?](answer.md#14-how-do-you-design-a-url-shortener-using-microservices)
14. [How do you design a Digital Wallet using Microservices?](answer.md#15-how-do-you-design-a-digital-wallet-using-microservices)

## Spring Boot Microservices Interview Questions

1. [How do you create a Microservice using Spring Boot?](answer.md#1-how-do-you-create-a-microservice-using-spring-boot)
2. [What is Spring Cloud?](answer.md#2-what-is-spring-cloud)
3. [What is Spring Cloud Netflix?](answer.md#3-what-is-spring-cloud-netflix)
4. [What is Spring Cloud Config?](answer.md#5-what-is-spring-cloud-config)
5. [What is OpenFeign in Spring Cloud?](answer.md#7-what-is-openfeign-in-spring-cloud)
6. [What is Resilience4j in Spring Boot?](answer.md#8-what-is-resilience4j-in-spring-boot)
7. [How do you implement Circuit Breaker in Spring Boot?](answer.md#9-how-do-you-implement-circuit-breaker-in-spring-boot)
8. [How do you implement Service Discovery in Spring Boot?](answer.md#10-how-do-you-implement-service-discovery-in-spring-boot)
9. [How do you implement Load Balancing in Spring Boot?](answer.md#11-how-do-you-implement-load-balancing-in-spring-boot)
10. [How do you implement centralized logging in Spring Boot Microservices?](answer.md#12-how-do-you-implement-centralized-logging-in-spring-boot-microservices)
11. [How do you implement distributed tracing in Spring Boot?](answer.md#13-how-do-you-implement-distributed-tracing-in-spring-boot)
12. [How do you secure Spring Boot Microservices using JWT?](answer.md#14-how-do-you-secure-spring-boot-microservices-using-jwt)
13. [How do you monitor Spring Boot Microservices using Actuator and Prometheus?](answer.md#15-how-do-you-monitor-spring-boot-microservices-using-actuator-and-prometheus)

## Additional Advanced Microservices Questions

1. [What is Orchestration vs Choreography in Saga Pattern?](answer.md#1-what-is-orchestration-vs-choreography-in-saga-pattern)
2. [What is Backpressure in Reactive Microservices?](answer.md#2-what-is-backpressure-in-reactive-microservices)
3. [What is Chaos Engineering?](answer.md#3-what-is-chaos-engineering)
4. [What is a Service Mesh?](answer.md#4-what-is-a-service-mesh)
5. [Istio vs API Gateway?](answer.md#5-istio-vs-api-gateway)
6. [What is Consul and how does it compare with Eureka?](answer.md#6-what-is-consul-and-how-does-it-compare-with-eureka)
7. [What is Schema Evolution in Microservices?](answer.md#7-what-is-schema-evolution-in-microservices)
8. [How do you maintain backward compatibility between services?](answer.md#8-how-do-you-maintain-backward-compatibility-between-services)
9. [What is the 12-Factor App methodology?](answer.md#9-what-is-the-12-factor-app-methodology)
10. [What is Zero Trust Architecture?](answer.md#10-what-is-zero-trust-architecture)
11. [What is Distributed Locking?](answer.md#11-what-is-distributed-locking)
12. [How do you implement Distributed Locking using Redis?](answer.md#12-how-do-you-implement-distributed-locking-using-redis)
13. [What is Consistent Hashing?](answer.md#13-what-is-consistent-hashing)
14. [What is the difference between Vertical and Horizontal Scaling?](answer.md#14-what-is-the-difference-between-vertical-and-horizontal-scaling)
15. [What is the difference between Orchestration and Choreography?](answer.md#15-what-is-the-difference-between-orchestration-and-choreography)
16. [How do you handle Backward Compatibility in REST APIs?](answer.md#16-how-do-you-handle-backward-compatibility-in-rest-apis)
17. [What is API Composition?](answer.md#17-what-is-api-composition)
18. [What is the N+1 problem in API Composition?](answer.md#18-what-is-the-n1-problem-in-api-composition)
19. [How do you optimize Microservices performance?](answer.md#19-how-do-you-optimize-microservices-performance)
20. [How do you perform Capacity Planning for Microservices?](answer.md#20-how-do-you-perform-capacity-planning-for-microservices)
21. [What is the difference between At-Least-Once Delivery and Exactly-Once Processing?](answer.md#21-what-is-the-difference-between-at-least-once-delivery-and-exactly-once-processing)
22. [How do you handle distributed cache invalidation?](answer.md#22-how-do-you-handle-distributed-cache-invalidation)
23. [How do you handle graceful shutdown in Microservices?](answer.md#24-how-do-you-handle-graceful-shutdown-in-microservices)
24. [How do you implement health checks and readiness probes?](answer.md#25-how-do-you-implement-health-checks-and-readiness-probes)
25. [What is the difference between Liveness and Readiness Probes?](answer.md#26-what-is-the-difference-between-liveness-and-readiness-probes)
26. [How do you handle secrets and credentials in production?](answer.md#27-how-do-you-handle-secrets-and-credentials-in-production)
27. [How do you handle a distributed latency spike?](answer.md#28-how-do-you-handle-a-distributed-latency-spike)
28. [How do you design an idempotent Payment Service?](answer.md#29-how-do-you-design-an-idempotent-payment-service)
29. [How do you handle a cascading failure caused by a slow downstream service?](answer.md#30-how-do-you-handle-a-cascading-failure-caused-by-a-slow-downstream-service)

## Self-assessment

- [ ] I attempted every question independently.
- [ ] I can explain the reasoning, not just memorize definitions.
- [ ] I can support answers with code or a real-world example.
- [ ] I marked weak questions for revision.

