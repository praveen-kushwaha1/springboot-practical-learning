# Hibernate & JPA Comprehensive Interview Guide

This guide contains all key Hibernate, JPA, and Spring Data JPA interview questions categorized by topic. Each question links directly to its location or detail section for rapid navigation.

---

## Navigation & Categories

1. [Category 1: Hibernate Fundamentals and ORM](#category-1-hibernate-fundamentals-and-orm)
2. [Category 2: Hibernate Architecture and Configuration](#category-2-hibernate-architecture-and-configuration)
3. [Category 3: Entity Mapping and Annotations](#category-3-entity-mapping-and-annotations)
4. [Category 4: Primary Keys and ID Generation Strategies](#category-4-primary-keys-and-id-generation-strategies)
5. [Category 5: Entity Relationships and Associations](#category-5-entity-relationships-and-associations)
6. [Category 6: Cascade Types and Orphan Removal](#category-6-cascade-types-and-orphan-removal)
7. [Category 7: Entity Lifecycle and Persistence Context](#category-7-entity-lifecycle-and-persistence-context)
8. [Category 8: CRUD Operations in Hibernate](#category-8-crud-operations-in-hibernate)
9. [Category 9: HQL, JPQL, SQL and Querying](#category-9-hql-jpql-sql-and-querying)
10. [Category 10: Fetching Strategies and Loading](#category-10-fetching-strategies-and-loading)
11. [Category 11: Transaction Management](#category-11-transaction-management)
12. [Category 12: Caching in Hibernate](#category-12-caching-in-hibernate)
13. [Category 13: Performance Optimization and JDBC Batching](#category-13-performance-optimization-and-jdbc-batching)
14. [Category 14: Locking and Concurrency Control](#category-14-locking-and-concurrency-control)
15. [Category 15: Inheritance Mapping](#category-15-inheritance-mapping)
16. [Category 16: Hibernate Schema and Data Type Management](#category-16-hibernate-schema-and-data-type-management)
17. [Category 17: Hibernate with Spring Boot and Spring Data JPA](#category-17-hibernate-with-spring-boot-and-spring-data-jpa)
18. [Category 18: Hibernate Internals and Advanced Concepts](#category-18-hibernate-internals-and-advanced-concepts)
19. [Category 19: Hibernate Validation, Auditing and Security](#category-19-hibernate-validation-auditing-and-security)
20. [Category 20: Testing and Debugging Hibernate Applications](#category-20-testing-and-debugging-hibernate-applications)
21. [Category 21: Production Issues and Real-World Scenarios](#category-21-production-issues-and-real-world-scenarios)
22. [Category 22: Senior Developer / Technical Lead / Architecture Questions](#category-22-senior-developer--technical-lead--architecture-questions)
23. [Recommended Preparation Order](#recommended-preparation-order)
24. [Important Practical Coding Tasks](#important-practical-coding-tasks)

---

## Category 1: Hibernate Fundamentals and ORM

* [1.1 What is Hibernate?](#11-what-is-hibernate)
* [1.2 What is ORM (Object Relational Mapping)?](#12-what-is-orm-object-relational-mapping)
* [1.3 Why do we use Hibernate in Java applications?](#13-why-do-we-use-hibernate-in-java-applications)
* [1.4 What problems does Hibernate solve compared to JDBC?](#14-what-problems-does-hibernate-solve-compared-to-jdbc)
* [1.5 What are the advantages and disadvantages of Hibernate?](#15-what-are-the-advantages-and-disadvantages-of-hibernate)
* [1.6 What is the difference between Hibernate and JDBC?](#16-what-is-the-difference-between-hibernate-and-jdbc)
* [1.7 What is the difference between Hibernate and JPA?](#17-what-is-the-difference-between-hibernate-and-jpa)
* [1.8 What is JPA, and why was it introduced?](#18-what-is-jpa-and-why-was-it-introduced)
* [1.9 Is Hibernate an implementation of JPA?](#19-is-hibernate-an-implementation-of-jpa)
* [1.10 What is the difference between JPA and Spring Data JPA?](#110-what-is-the-difference-between-jpa-and-spring-data-jpa)
* [1.11 What is the difference between Hibernate and MyBatis?](#111-what-is-the-difference-between-hibernate-and-mybatis)
* [1.12 What are the major features of Hibernate?](#112-what-are-the-major-features-of-hibernate)
* [1.13 What is the role of ORM in a microservices architecture?](#113-what-is-the-role-of-orm-in-a-microservices-architecture)
* [1.14 What is the difference between an ORM framework and a SQL mapper?](#114-what-is-the-difference-between-an-orm-framework-and-a-sql-mapper)
* [1.15 When should you avoid using Hibernate?](#115-when-should-you-avoid-using-hibernate)

### Questions & Answers

#### <a id="11-what-is-hibernate"></a>1.1 What is Hibernate?
Hibernate is an open-source Object-Relational Mapping (ORM) framework for Java. It simplifies relational database interactions by mapping Java domain classes to database tables and Java data types to SQL data types.

#### <a id="12-what-is-orm-object-relational-mapping"></a>1.2 What is ORM (Object Relational Mapping)?
ORM is a technique used to convert data between incompatible type systems in object-oriented programming languages and relational databases. It abstracts SQL operations into object manipulations.

#### <a id="13-why-do-we-use-hibernate-in-java-applications"></a>1.3 Why do we use Hibernate in Java applications?
It reduces boilerplate JDBC code, manages connection handling and transactions automatically, supports caching, handles data mapping transparently, and provides database independence via dialects.

#### <a id="14-what-problems-does-hibernate-solve-compared-to-jdbc"></a>1.4 What problems does Hibernate solve compared to JDBC?
Hibernate addresses the impedance mismatch between OOP paradigms and relational databases, eliminates manual result set parsing, automates primary key generation, and avoids writing vendor-specific SQL queries manually.

#### <a id="15-what-are-the-advantages-and-disadvantages-of-hibernate"></a>1.5 What are the advantages and disadvantages of Hibernate?
* **Advantages:** High productivity, caching mechanisms, database independence, automatic schema creation, lazy loading support.
* **Disadvantages:** Steeper learning curve, potential performance overheads (e.g., $N+1$ select issues), complex overhead for simple batch operations.

#### <a id="16-what-is-the-difference-between-hibernate-and-jdbc"></a>1.6 What is the difference between Hibernate and JDBC?
JDBC is a low-level API requiring explicit SQL statements and ResultSet handling. Hibernate is a high-level framework built on top of JDBC that automates object mapping, query generation, and caching.

#### <a id="17-what-is-the-difference-between-hibernate-and-jpa"></a>1.7 What is the difference between Hibernate and JPA?
JPA (Jakarta Persistence API) is a specification defining a set of standard interfaces and annotations. Hibernate is an actual library implementation that implements the JPA specification.

#### <a id="18-what-is-jpa-and-why-was-it-introduced"></a>1.8 What is JPA, and why was it introduced?
JPA was introduced to standardize ORM frameworks across the Java ecosystem, ensuring portability across vendors (e.g., Hibernate, EclipseLink, OpenJPA).

#### <a id="19-is-hibernate-an-implementation-of-jpa"></a>1.9 Is Hibernate an implementation of JPA?
Yes, Hibernate ORM is the default and most popular vendor implementation of the JPA specification.

#### <a id="110-what-is-the-difference-between-jpa-and-spring-data-jpa"></a>1.10 What is the difference between JPA and Spring Data JPA?
JPA is the standard persistence specification. Spring Data JPA is an abstraction layer on top of JPA/Hibernate that dramatically reduces boilerplate code by providing automated repository implementations (`JpaRepository`).

#### <a id="111-what-is-the-difference-between-hibernate-and-mybatis"></a>1.11 What is the difference between Hibernate and MyBatis?
Hibernate is a full ORM generating SQL queries dynamically for object structures. MyBatis is a SQL-mapper framework where developers write explicit SQL queries mapped to Java objects.

#### <a id="112-what-are-the-major-features-of-hibernate"></a>1.12 What are the major features of Hibernate?
Automatic SQL generation, Multi-level Caching, Lazy Loading, Inheritance Mapping, Criteria Query API, HQL/JPQL support, and Schema generation.

#### <a id="113-what-is-the-role-of-orm-in-a-microservices-architecture"></a>1.13 What is the role of ORM in a microservices architecture?
ORM isolates data access per microservice database context, simplifies domain entity modeling, and accelerates development of domain-driven services.

#### <a id="114-what-is-the-difference-between-an-orm-framework-and-a-sql-mapper"></a>1.14 What is the difference between an ORM framework and a SQL mapper?
An ORM hides SQL and focuses on domain object representations, whereas a SQL mapper requires writing raw SQL statements and maps query parameters/results to Java objects.

#### <a id="115-when-should-you-avoid-using-hibernate"></a>1.15 When should you avoid using Hibernate?
Avoid Hibernate in applications requiring heavy, raw SQL optimizations, complex reporting/analytics queries, multi-million record batch imports, or applications with ultra-constrained memory footprints.

---

## Category 2: Hibernate Architecture and Configuration

* [2.1 Explain Hibernate architecture.](#21-explain-hibernate-architecture)
* [2.2 What are the main components of Hibernate?](#22-what-are-the-main-components-of-hibernate)
* [2.3 What is the role of SessionFactory?](#23-what-is-the-role-of-sessionfactory)
* [2.4 What is the role of Session?](#24-what-is-the-role-of-session)
* [2.5 What is the role of Transaction?](#25-what-is-the-role-of-transaction)
* [2.6 What is the role of Configuration?](#26-what-is-the-role-of-configuration)
* [2.7 What is ServiceRegistry?](#27-what-is-serviceregistry)
* [2.8 What is Metadata in Hibernate?](#28-what-is-metadata-in-hibernate)
* [2.9 What is SessionFactory versus EntityManagerFactory?](#29-what-is-sessionfactory-versus-entitymanagerfactory)
* [2.10 What is Session versus EntityManager?](#210-what-is-session-versus-entitymanager)
* [2.11 What is the difference between hibernate.cfg.xml and application.properties?](#211-what-is-the-difference-between-hibernatecfgxml-and-applicationproperties)
* [2.12 How do you configure Hibernate using XML?](#212-how-do-you-configure-hibernate-using-xml)
* [2.13 How do you configure Hibernate using Java-based configuration?](#213-how-do-you-configure-hibernate-using-java-based-configuration)
* [2.14 What is the purpose of hibernate.dialect?](#214-what-is-the-purpose-of-hibernatedialect)
* [2.15 What happens internally when Hibernate starts?](#215-what-happens-internally-when-hibernate-starts)
* [2.16 How does Hibernate establish a database connection?](#216-how-does-hibernate-establish-a-database-connection)
* [2.17 What is connection pooling?](#217-what-is-connection-pooling)
* [2.18 What is the role of HikariCP in Spring Boot applications?](#218-what-is-the-role-of-hikaricp-in-spring-boot-applications)
* [2.19 What happens if multiple SessionFactory instances are created?](#219-what-happens-if-multiple-sessionfactory-instances-are-created)
* [2.20 Why is SessionFactory thread-safe but Session not thread-safe?](#220-why-is-sessionfactory-thread-safe-but-session-not-thread-safe)

---

## Category 3: Entity Mapping and Annotations

* [3.1 What is an Entity in Hibernate?](#31-what-is-an-entity-in-hibernate)
* [3.2 What is the purpose of @Entity?](#32-what-is-the-purpose-of-entity)
* [3.3 What is the purpose of @Table?](#33-what-is-the-purpose-of-table)
* [3.4 What is the purpose of @Id?](#34-what-is-the-purpose-of-id)
* [3.5 What is the purpose of @Column?](#35-what-is-the-purpose-of-column)
* [3.6 What is the purpose of @GeneratedValue?](#36-what-is-the-purpose-of-generatedvalue)
* [3.7 What is the difference between @Column and @Basic?](#37-what-is-the-difference-between-column-and-basic)
* [3.8 What is the purpose of @Transient?](#38-what-is-the-purpose-of-transient)
* [3.9 What is the purpose of @Temporal, and is it needed in modern Hibernate?](#39-what-is-the-purpose-of-temporal-and-is-it-needed-in-modern-hibernate)
* [3.10 What is the purpose of @Enumerated?](#310-what-is-the-purpose-of-enumerated)
* [3.11 What is the difference between EnumType.STRING and EnumType.ORDINAL?](#311-what-is-the-difference-between-enumtypestring-and-enumtypeordinal)
* [3.12 What is the purpose of @Lob?](#312-what-is-the-purpose-of-lob)
* [3.13 What is the purpose of @Embedded and @Embeddable?](#313-what-is-the-purpose-of-embedded-and-embeddable)
* [3.14 What is the purpose of @AttributeOverride?](#314-what-is-the-purpose-of-attributeoverride)
* [3.15 What is the purpose of @Access?](#315-what-is-the-purpose-of-access)
* [3.16 What is the difference between field access and property access?](#316-what-is-the-difference-between-field-access-and-property-access)
* [3.17 Why does JPA require a no-argument constructor?](#317-why-does-jpa-require-a-no-argument-constructor)
* [3.18 Can an Entity class be final?](#318-can-an-entity-class-be-final)
* [3.19 Can an Entity class be immutable?](#319-can-an-entity-class-be-immutable)
* [3.20 What is the difference between an Entity and a DTO?](#320-what-is-the-difference-between-an-entity-and-a-dto)
* [3.21 What is the purpose of @DynamicInsert?](#321-what-is-the-purpose-of-dynamicinsert)
* [3.22 What is the purpose of @DynamicUpdate?](#322-what-is-the-purpose-of-dynamicupdate)
* [3.23 What is the purpose of @Immutable?](#323-what-is-the-purpose-of-immutable)
* [3.24 What is the difference between @Entity and @MappedSuperclass?](#324-what-is-the-difference-between-entity-and-mappedsuperclass)

---

## Category 4: Primary Keys and ID Generation Strategies

* [4.1 What is a primary key in Hibernate?](#41-what-is-a-primary-key-in-hibernate)
* [4.2 What is the purpose of @GeneratedValue?](#42-what-is-the-purpose-of-generatedvalue)
* [4.3 What are the different ID generation strategies?](#43-what-are-the-different-id-generation-strategies)
* [4.4 Explain GenerationType.AUTO.](#44-explain-generationtypeauto)
* [4.5 Explain GenerationType.IDENTITY.](#45-explain-generationtypeidentity)
* [4.6 Explain GenerationType.SEQUENCE.](#46-explain-generationtypesequence)
* [4.7 Explain GenerationType.TABLE.](#47-explain-generationtypetable)
* [4.8 What is the difference between IDENTITY and SEQUENCE?](#48-what-is-the-difference-between-identity-and-sequence)
* [4.9 How does Hibernate generate IDs using database sequences?](#49-how-does-hibernate-generate-ids-using-database-sequences)
* [4.10 What is @SequenceGenerator?](#410-what-is-sequencegenerator)
* [4.11 What is @TableGenerator?](#411-what-is-tablegenerator)
* [4.12 What is the difference between UUID and numeric primary keys?](#412-what-is-the-difference-between-uuid-and-numeric-primary-keys)
* [4.13 When should you use UUID as a primary key?](#413-when-should-you-use-uuid-as-a-primary-key)
* [4.14 What is a composite primary key?](#414-what-is-a-composite-primary-key)
* [4.15 What is the purpose of @EmbeddedId?](#415-what-is-the-purpose-of-embeddedid)
* [4.16 What is the purpose of @IdClass?](#416-what-is-the-purpose-of-idclass)
* [4.17 What is the difference between @EmbeddedId and @IdClass?](#417-what-is-the-difference-between-embeddedid-and-idclass)
* [4.18 How does ID generation affect JDBC batching?](#418-how-does-id-generation-affect-jdbc-batching)
* [4.19 Why can IDENTITY generation prevent insert batching in Hibernate?](#419-why-can-identity-generation-prevent-insert-batching-in-hibernate)
* [4.20 How would you design ID generation for a high-volume banking application?](#420-how-would-you-design-id-generation-for-a-high-volume-banking-application)

---

## Category 5: Entity Relationships and Associations

* [5.1 What is entity relationship mapping in Hibernate?](#51-what-is-entity-relationship-mapping-in-hibernate)
* [5.2 What are the different types of relationships?](#52-what-are-the-different-types-of-relationships)
* [5.3 Explain @OneToOne.](#53-explain-onetoone)
* [5.4 Explain @OneToMany.](#54-explain-onetomany)
* [5.5 Explain @ManyToOne.](#55-explain-manytoone)
* [5.6 Explain @ManyToMany.](#56-explain-manytomany)
* [5.7 What is the difference between unidirectional and bidirectional relationships?](#57-what-is-the-difference-between-unidirectional-and-bidirectional-relationships)
* [5.8 What is the owning side of a relationship?](#58-what-is-the-owning-side-of-a-relationship)
* [5.9 What is the inverse side of a relationship?](#59-what-is-the-inverse-side-of-a-relationship)
* [5.10 What is the purpose of mappedBy?](#510-what-is-the-purpose-of-mappedby)
* [5.11 What is the purpose of @JoinColumn?](#511-what-is-the-purpose-of-joincolumn)
* [5.12 What is the purpose of @JoinTable?](#512-what-is-the-purpose-of-jointable)
* [5.13 What is the difference between @JoinColumn and @JoinTable?](#513-what-is-the-difference-between-joincolumn-and-jointable)
* [5.14 How do you implement a one-to-one relationship?](#514-how-do-you-implement-a-one-to-one-relationship)
* [5.15 How do you implement a one-to-many relationship?](#515-how-do-you-implement-a-one-to-many-relationship)
* [5.16 How do you implement a many-to-many relationship?](#516-how-do-you-implement-a-many-to-many-relationship)
* [5.17 Why should you avoid direct many-to-many mapping in complex business applications?](#517-why-should-you-avoid-direct-many-to-many-mapping-in-complex-business-applications)
* [5.18 How do you maintain consistency in bidirectional relationships?](#518-how-do-you-maintain-consistency-in-bidirectional-relationships)
* [5.19 What happens if you update only one side of a bidirectional relationship?](#519-what-happens-if-you-update-only-one-side-of-a-bidirectional-relationship)
* [5.20 What is the difference between cascade operations and database foreign keys?](#520-what-is-the-difference-between-cascade-operations-and-database-foreign-keys)
* [5.21 What happens when you delete a parent entity with child entities?](#521-what-happens-when-you-delete-a-parent-entity-with-child-entities)
* [5.22 How do you prevent circular references during JSON serialization?](#522-how-do-you-prevent-circular-references-during-json-serialization)
* [5.23 What is the difference between @JsonManagedReference and @JsonBackReference?](#523-what-is-the-difference-between-jsonmanagedreference-and-jsonbackreference)
* [5.24 How do you model a customer with multiple bank accounts?](#524-how-do-you-model-a-customer-with-multiple-bank-accounts)
* [5.25 How would you design a many-to-many relationship with additional attributes?](#525-how-would-you-design-a-many-to-many-relationship-with-additional-attributes)

---

## Category 6: Cascade Types and Orphan Removal

* [6.1 What is cascading in Hibernate?](#61-what-is-cascading-in-hibernate)
* [6.2 What are the different cascade types?](#62-what-are-the-different-cascade-types)
* [6.3 Explain CascadeType.PERSIST.](#63-explain-cascadetypepersist)
* [6.4 Explain CascadeType.MERGE.](#64-explain-cascadetypemerge)
* [6.5 Explain CascadeType.REMOVE.](#65-explain-cascadetyperemove)
* [6.6 Explain CascadeType.REFRESH.](#66-explain-cascadetyperefresh)
* [6.7 Explain CascadeType.DETACH.](#67-explain-cascadetypedetach)
* [6.8 Explain CascadeType.ALL.](#68-explain-cascadetypeall)
* [6.9 What is orphan removal?](#69-what-is-orphan-removal)
* [6.10 What is the difference between CascadeType.REMOVE and orphanRemoval = true?](#610-what-is-the-difference-between-cascadetyperemove-and-orphanremoval--true)
* [6.11 What happens when you remove a child from a parent's collection?](#611-what-happens-when-you-remove-a-child-from-a-parents-collection)
* [6.12 What happens when you delete a parent with cascade remove?](#612-what-happens-when-you-delete-a-parent-with-cascade-remove)
* [6.13 What are the risks of using CascadeType.ALL?](#613-what-are-the-risks-of-using-cascadetypeall)
* [6.14 Should you use cascade operations on @ManyToMany?](#614-should-you-use-cascade-operations-on-manytomany)
* [6.15 How do you safely delete dependent records?](#615-how-do-you-safely-delete-dependent-records)
* [6.16 How would you handle cascade operations in a banking application?](#616-how-would-you-handle-cascade-operations-in-a-banking-application)

---

## Category 7: Entity Lifecycle and Persistence Context

* [7.1 What is the Hibernate entity lifecycle?](#71-what-is-the-hibernate-entity-lifecycle)
* [7.2 What are the different entity states?](#72-what-are-the-different-entity-states)
* [7.3 What is a transient entity?](#73-what-is-a-transient-entity)
* [7.4 What is a persistent entity?](#74-what-is-a-persistent-entity)
* [7.5 What is a detached entity?](#75-what-is-a-detached-entity)
* [7.6 What is a removed entity?](#76-what-is-a-removed-entity)
* [7.7 What is the persistence context?](#77-what-is-the-persistence-context)
* [7.8 What is the first-level cache?](#78-what-is-the-first-level-cache)
* [7.9 How does the persistence context work?](#79-how-does-the-persistence-context-work)
* [7.10 What is the difference between persist() and save()?](#710-what-is-the-difference-between-persist-and-save)
* [7.11 What is the difference between merge() and update()?](#711-what-is-the-difference-between-merge-and-update)
* [7.12 What is the difference between remove() and delete()?](#712-what-is-the-difference-between-remove-and-delete)
* [7.13 What is the difference between get() and load() in older Hibernate APIs?](#713-what-is-the-difference-between-get-and-load-in-older-hibernate-apis)
* [7.14 What is the modern alternative to load()?](#714-what-is-the-modern-alternative-to-load)
* [7.15 What happens when you call persist()?](#715-what-happens-when-you-call-persist)
* [7.16 What happens when you call merge()?](#716-what-happens-when-you-call-merge)
* [7.17 Does merge() return the same object?](#717-does-merge-return-the-same-object)
* [7.18 What happens when you modify a detached entity?](#718-what-happens-when-you-modify-a-detached-entity)
* [7.19 What is detach()?](#719-what-is-detach)
* [7.20 What is clear()?](#720-what-is-clear)
* [7.21 What is refresh()?](#721-what-is-refresh)
* [7.22 What is the difference between refresh() and merge()?](#722-what-is-the-difference-between-refresh-and-merge)
* [7.23 What is flush()?](#723-what-is-flush)
* [7.24 What is the difference between flush() and commit()?](#724-what-is-the-difference-between-flush-and-commit)
* [7.25 What is the purpose of flushMode?](#725-what-is-the-purpose-of-flushmode)
* [7.26 What happens if you call flush() multiple times?](#726-what-happens-if-you-call-flush-multiple-times)
* [7.27 When does Hibernate automatically flush changes?](#727-when-does-hibernate-automatically-flush-changes)
* [7.28 What is dirty checking?](#728-what-is-dirty-checking)
* [7.29 How does Hibernate detect entity modifications?](#729-how-does-hibernate-detect-entity-modifications)
* [7.30 What is the difference between Session.clear() and Session.evict()?](#730-what-is-the-difference-between-sessionclear-and-sessionevict)

---

## Category 8: CRUD Operations in Hibernate

* [8.1 How do you perform insert operations using Hibernate?](#81-how-do-you-perform-insert-operations-using-hibernate)
* [8.2 How do you perform select operations?](#82-how-do-you-perform-select-operations)
* [8.3 How do you perform update operations?](#83-how-do-you-perform-update-operations)
* [8.4 How do you perform delete operations?](#84-how-do-you-perform-delete-operations)
* [8.5 What is the difference between persist() and merge()?](#85-what-is-the-difference-between-persist-and-merge)
* [8.6 How do you save multiple entities?](#86-how-do-you-save-multiple-entities)
* [8.7 How do you update multiple records?](#87-how-do-you-update-multiple-records)
* [8.8 How do you delete multiple records?](#88-how-do-you-delete-multiple-records)
* [8.9 What is the difference between entity-based updates and bulk updates?](#89-what-is-the-difference-between-entity-based-updates-and-bulk-updates)
* [8.10 How do you implement pagination?](#810-how-do-you-implement-pagination)
* [8.11 How do you implement sorting?](#811-how-do-you-implement-sorting)
* [8.12 How do you retrieve a single record by ID?](#812-how-do-you-retrieve-a-single-record-by-id)
* [8.13 How do you retrieve multiple records using IDs?](#813-how-do-you-retrieve-multiple-records-using-ids)
* [8.14 How do you handle entity-not-found scenarios?](#814-how-do-you-handle-entity-not-found-scenarios)
* [8.15 How do you handle duplicate primary key exceptions?](#815-how-do-you-handle-duplicate-primary-key-exceptions)
* [8.16 How do you handle constraint violations?](#816-how-do-you-handle-constraint-violations)
* [8.17 How do you perform batch inserts?](#817-how-do-you-perform-batch-inserts)
* [8.18 How do you perform batch updates?](#818-how-do-you-perform-batch-updates)

---

## Category 9: HQL, JPQL, SQL and Querying

* [9.1 What is HQL?](#91-what-is-hql)
* [9.2 What is JPQL?](#92-what-is-jpql)
* [9.3 What is the difference between HQL and JPQL?](#93-what-is-the-difference-between-hql-and-jpql)
* [9.4 What is the difference between HQL and native SQL?](#94-what-is-the-difference-between-hql-and-native-sql)
* [9.5 What is the difference between JPQL and SQL?](#95-what-is-the-difference-between-jpql-and-sql)
* [9.6 What is the purpose of createQuery()?](#96-what-is-the-purpose-of-createquery)
* [9.7 What is the purpose of createNativeQuery()?](#97-what-is-the-purpose-of-createnativequery)
* [9.8 What is the purpose of getResultList()?](#98-what-is-the-purpose-of-getresultlist)
* [9.9 What is the purpose of getSingleResult()?](#99-what-is-the-purpose-of-getsingleresult)
* [9.10 What is the purpose of getSingleResultOrNull()?](#910-what-is-the-purpose-of-getsingleresultornull)
* [9.11 What are named queries?](#911-what-are-named-queries)
* [9.12 What is the purpose of @NamedQuery?](#912-what-is-the-purpose-of-namedquery)
* [9.13 What is the purpose of @NamedNativeQuery?](#913-what-is-the-purpose-of-namednativequery)
* [9.14 What is the difference between named and dynamic queries?](#914-what-is-the-difference-between-named-and-dynamic-queries)
* [9.15 What is a positional parameter?](#915-what-is-a-positional-parameter)
* [9.16 What is a named parameter?](#916-what-is-a-named-parameter)
* [9.17 Why should you use parameterized queries?](#917-why-should-you-use-parameterized-queries)
* [9.18 What is SQL injection?](#918-what-is-sql-injection)
* [9.19 How does Hibernate prevent SQL injection when using parameter binding?](#919-how-does-hibernate-prevent-sql-injection-when-using-parameter-binding)
* [9.20 How do you write JOIN queries using HQL?](#920-how-do-you-write-join-queries-using-hql)
* [9.21 What is the difference between INNER JOIN and LEFT JOIN?](#921-what-is-the-difference-between-inner-join-and-left-join)
* [9.22 What is JOIN FETCH?](#922-what-is-join-fetch)
* [9.23 What is the difference between JOIN and JOIN FETCH?](#923-what-is-the-difference-between-join-and-join-fetch)
* [9.24 What are aggregate functions in HQL?](#924-what-are-aggregate-functions-in-hql)
* [9.25 How do you use GROUP BY and HAVING?](#925-how-do-you-use-group-by-and-having)
* [9.26 How do you write subqueries in HQL?](#926-how-do-you-write-subqueries-in-hql)
* [9.27 What is the Criteria API?](#927-what-is-the-criteria-api)
* [9.28 What is the difference between Criteria API and JPQL?](#928-what-is-the-difference-between-criteria-api-and-jpql)
* [9.29 What is the JPA Criteria Builder?](#929-what-is-the-jpa-criteria-builder)
* [9.30 How do you build dynamic queries?](#930-how-do-you-build-dynamic-queries)
* [9.31 What are projections in Hibernate?](#931-what-are-projections-in-hibernate)
* [9.32 What is DTO projection?](#932-what-is-dto-projection)
* [9.33 What is the difference between entity projection and DTO projection?](#933-what-is-the-difference-between-entity-projection-and-dto-projection)
* [9.34 How do you implement pagination with JPQL?](#934-how-do-you-implement-pagination-with-jpql)
* [9.35 How do you implement pagination with native SQL?](#935-how-do-you-implement-pagination-with-native-sql)
* [9.36 What are bulk update and bulk delete queries?](#936-what-are-bulk-update-and-bulk-delete-queries)
* [9.37 What are the limitations of bulk operations?](#937-what-are-the-limitations-of-bulk-operations)
* [9.38 How do you handle stored procedures using Hibernate?](#938-how-do-you-handle-stored-procedures-using-hibernate)
* [9.39 What is @NamedStoredProcedureQuery?](#939-what-is-namedstoredprocedurequery)
* [9.40 When should you use native SQL instead of JPQL?](#940-when-should-you-use-native-sql-instead-of-jpql)

---

## Category 10: Fetching Strategies and Loading

* [10.1 What is fetching in Hibernate?](#101-what-is-fetching-in-hibernate)
* [10.2 What is lazy loading?](#102-what-is-lazy-loading)
* [10.3 What is eager loading?](#103-what-is-eager-loading)
* [10.4 What is the difference between lazy and eager loading?](#104-what-is-the-difference-between-lazy-and-eager-loading)
* [10.5 What is the default fetch type for @OneToMany?](#105-what-is-the-default-fetch-type-for-onetomany)
* [10.6 What is the default fetch type for @ManyToOne?](#106-what-is-the-default-fetch-type-for-manytoone)
* [10.7 What is the default fetch type for @OneToOne?](#107-what-is-the-default-fetch-type-for-onetoone)
* [10.8 What is the default fetch type for @ManyToMany?](#108-what-is-the-default-fetch-type-for-manytomany)
* [10.9 Why is lazy loading preferred in most associations?](#109-why-is-lazy-loading-preferred-in-most-associations)
* [10.10 What is LazyInitializationException?](#1010-what-is-lazyinitializationexception)
* [10.11 Why does LazyInitializationException occur?](#1011-why-does-lazyinitializationexception-occur)
* [10.12 How do you resolve LazyInitializationException?](#1012-how-do-you-resolve-lazyinitializationexception)
* [10.13 What is the N+1 select problem?](#1013-what-is-the-n1-select-problem)
* [10.14 How do you identify an N+1 query problem?](#1014-how-do-you-identify-an-n1-query-problem)
* [10.15 How do you solve the N+1 problem?](#1015-how-do-you-solve-the-n1-problem)
* [10.16 What is the purpose of JOIN FETCH?](#1016-what-is-the-purpose-of-join-fetch)
* [10.17 What is the purpose of @EntityGraph?](#1017-what-is-the-purpose-of-entitygraph)
* [10.18 What is the difference between JOIN FETCH and @EntityGraph?](#1018-what-is-the-difference-between-join-fetch-and-entitygraph)
* [10.19 What are fetch profiles?](#1019-what-are-fetch-profiles)
* [10.20 What is batch fetching?](#1020-what-is-batch-fetching)
* [10.21 What is @BatchSize?](#1021-what-is-batchsize)
* [10.22 What is hibernate.default_batch_fetch_size?](#1022-what-is-hibernatedefault_batch_fetch_size)
* [10.23 What is subselect fetching?](#1023-what-is-subselect-fetching)
* [10.24 What is the difference between batch fetching and subselect fetching?](#1024-what-is-the-difference-between-batch-fetching-and-subselect-fetching)
* [10.25 What is the difference between fetch join and batch fetching?](#1025-what-is-the-difference-between-fetch-join-and-batch-fetching)
* [10.26 Can you use pagination with collection fetch joins?](#1026-can-you-use-pagination-with-collection-fetch-joins)
* [10.27 What happens when you combine pagination with a collection fetch join?](#1027-what-happens-when-you-combine-pagination-with-a-collection-fetch-join)
* [10.28 How would you solve pagination with multiple entity relationships?](#1028-how-would-you-solve-pagination-with-multiple-entity-relationships)
* [10.29 How do you avoid loading unnecessary relationships in REST APIs?](#1029-how-do-you-avoid-loading-unnecessary-relationships-in-rest-apis)
* [10.30 How would you optimize fetching for an account transaction history API?](#1030-how-would-you-optimize-fetching-for-an-account-transaction-history-api)

---

## Category 11: Transaction Management

* [11.1 What is a transaction in Hibernate?](#111-what-is-a-transaction-in-hibernate)
* [11.2 What is the purpose of the Transaction interface?](#112-what-is-the-purpose-of-the-transaction-interface)
* [11.3 What is the difference between JDBC transactions and Hibernate transactions?](#113-what-is-the-difference-between-jdbc-transactions-and-hibernate-transactions)
* [11.4 What is transaction management in JPA?](#114-what-is-transaction-management-in-jpa)
* [11.5 What are ACID properties?](#115-what-are-acid-properties)
* [11.6 Explain atomicity, consistency, isolation, and durability.](#116-explain-atomicity-consistency-isolation-and-durability)
* [11.7 What are transaction isolation levels?](#117-what-are-transaction-isolation-levels)
* [11.8 Explain READ UNCOMMITTED.](#118-explain-read-uncommitted)
* [11.9 Explain READ COMMITTED.](#119-explain-read-committed)
* [11.10 Explain REPEATABLE READ.](#1110-explain-repeatable-read)
* [11.11 Explain SERIALIZABLE.](#1111-explain-serializable)
* [11.12 What is the difference between transaction isolation and locking?](#1112-what-is-the-difference-between-transaction-isolation-and-locking)
* [11.13 What is transaction propagation?](#1113-what-is-transaction-propagation)
* [11.14 What is the purpose of @Transactional?](#1114-what-is-the-purpose-of-transactional)
* [11.15 What happens internally when @Transactional is used?](#1115-what-happens-internally-when-transactional-is-used)
* [11.16 What is the difference between declarative and programmatic transaction management?](#1116-what-is-the-difference-between-declarative-and-programmatic-transaction-management)
* [11.17 What is the difference between REQUIRED and REQUIRES_NEW?](#1117-what-is-the-difference-between-required-and-requires_new)
* [11.18 Explain SUPPORTS, MANDATORY, NOT_SUPPORTED, NEVER, and NESTED.](#1118-explain-supports-mandatory-not_supported-never-and-nested)
* [11.19 What is transaction rollback?](#1119-what-is-transaction-rollback)
* [11.20 Which exceptions trigger rollback by default in Spring?](#1120-which-exceptions-trigger-rollback-by-default-in-spring)
* [11.21 What is rollbackFor?](#1121-what-is-rollbackfor)
* [11.22 What is noRollbackFor?](#1122-what-is-norollbackfor)
* [11.23 What happens if an exception is caught inside a transactional method?](#1123-what-happens-if-an-exception-is-caught-inside-a-transactional-method)
* [11.24 Why does @Transactional sometimes not work with self-invocation?](#1124-why-does-transactional-sometimes-not-work-with-self-invocation)
* [11.25 What happens if a transactional method is private?](#1125-what-happens-if-a-transactional-method-is-private)
* [11.26 What happens if a transaction spans multiple service methods?](#1126-what-happens-if-a-transaction-spans-multiple-service-methods)
* [11.27 What is the Open Session in View pattern?](#1127-what-is-the-open-session-in-view-pattern)
* [11.28 What are the advantages and disadvantages of Open Session in View?](#1128-what-are-the-advantages-and-disadvantages-of-open-session-in-view)
* [11.29 How do you manage transactions in a microservices architecture?](#1129-how-do-you-manage-transactions-in-a-microservices-architecture)
* [11.30 Why should external API calls generally not be kept inside long-running database transactions?](#1130-why-should-external-api-calls-generally-not-be-kept-inside-long-running-database-transactions)

---

## Category 12: Caching in Hibernate

* [12.1 What is caching in Hibernate?](#121-what-is-caching-in-hibernate)
* [12.2 Why is caching required?](#122-why-is-caching-required)
* [12.3 What are the different levels of Hibernate caching?](#123-what-are-the-different-levels-of-hibernate-caching)
* [12.4 What is the first-level cache?](#124-what-is-the-first-level-cache)
* [12.5 Is first-level caching enabled by default?](#125-is-first-level-caching-enabled-by-default)
* [12.6 What is the second-level cache?](#126-what-is-the-second-level-cache)
* [12.7 Is second-level caching enabled by default?](#127-is-second-level-caching-enabled-by-default)
* [12.8 What is the query cache?](#128-what-is-the-query-cache)
* [12.9 What is the difference between first-level and second-level cache?](#129-what-is-the-difference-between-first-level-and-second-level-cache)
* [12.10 What is the difference between second-level cache and query cache?](#1210-what-is-the-difference-between-second-level-cache-and-query-cache)
* [12.11 What is the purpose of @Cacheable?](#1211-what-is-the-purpose-of-cacheable)
* [12.12 What is the purpose of Hibernate's @Cache?](#1212-what-is-the-purpose-of-hibernates-cache)
* [12.13 What are cache concurrency strategies?](#1213-what-are-cache-concurrency-strategies)
* [12.14 Explain READ_ONLY caching.](#1214-explain-read_only-caching)
* [12.15 Explain NONSTRICT_READ_WRITE caching.](#1215-explain-nonstrict_read_write-caching)
* [12.16 Explain READ_WRITE caching.](#1216-explain-read_write-caching)
* [12.17 Explain TRANSACTIONAL caching.](#1217-explain-transactional-caching)
* [12.18 What is the role of Ehcache?](#1218-what-is-the-role-of-ehcache)
* [12.19 What is the role of Infinispan?](#1219-what-is-the-role-of-infinispan)
* [12.20 Can Redis be used as a Hibernate second-level cache provider?](#1220-can-redis-be-used-as-a-hibernate-second-level-cache-provider)
* [12.21 How does Hibernate invalidate cached data?](#1221-how-does-hibernate-invalidate-cached-data)
* [12.22 What is cache eviction?](#1222-what-is-cache-eviction)
* [12.23 What is the difference between cache eviction and cache expiration?](#1223-what-is-the-difference-between-cache-eviction-and-cache-expiration)
* [12.24 How do you prevent stale data in a distributed environment?](#1224-how-do-you-prevent-stale-data-in-a-distributed-environment)
* [12.25 When should you avoid second-level caching?](#1225-when-should-you-avoid-second-level-caching)
* [12.26 How would you cache frequently accessed customer and account data?](#1226-how-would-you-cache-frequently-accessed-customer-and-account-data)
* [12.27 How do you troubleshoot stale data caused by caching?](#1227-how-do-you-troubleshoot-stale-data-caused-by-caching)

---

## Category 13: Performance Optimization and JDBC Batching

* [13.1 How do you improve Hibernate performance?](#131-how-do-you-improve-hibernate-performance)
* [13.2 What are the common Hibernate performance problems?](#132-what-are-the-common-hibernate-performance-problems)
* [13.3 What is JDBC batching?](#133-what-is-jdbc-batching)
* [13.4 How does Hibernate batch insert operations?](#134-how-does-hibernate-batch-insert-operations)
* [13.5 What is the purpose of hibernate.jdbc.batch_size?](#135-what-is-the-purpose-of-hibernatejdbcbatch_size)
* [13.6 What is the purpose of hibernate.order_inserts?](#136-what-is-the-purpose-of-hibernateorder_inserts)
* [13.7 What is the purpose of hibernate.order_updates?](#137-what-is-the-purpose-of-hibernateorder_updates)
* [13.8 What is the purpose of hibernate.jdbc.batch_versioned_data?](#138-what-is-the-purpose-of-hibernatejdbcbatch_versioned_data)
* [13.9 Why might IDENTITY generation prevent insert batching?](#139-why-might-identity-generation-prevent-insert-batching)
* [13.10 What is the difference between batch processing and bulk operations?](#1310-what-is-the-difference-between-batch-processing-and-bulk-operations)
* [13.11 What is the purpose of StatelessSession?](#1311-what-is-the-purpose-of-statelesssession)
* [13.12 What is the difference between Session and StatelessSession?](#1312-what-is-the-difference-between-session-and-statelesssession)
* [13.13 What is the purpose of flush() and clear() in batch processing?](#1313-what-is-the-purpose-of-flush-and-clear-in-batch-processing)
* [13.14 Why should you avoid keeping thousands of entities in the persistence context?](#1314-why-should-you-avoid-keeping-thousands-of-entities-in-the-persistence-context)
* [13.15 How do you optimize large data imports?](#1315-how-do-you-optimize-large-data-imports)
* [13.16 How do you optimize large data exports?](#1316-how-do-you-optimize-large-data-exports)
* [13.17 How do you optimize pagination for large datasets?](#1317-how-do-you-optimize-pagination-for-large-datasets)
* [13.18 What is keyset pagination?](#1318-what-is-keyset-pagination)
* [13.19 What is the difference between offset pagination and keyset pagination?](#1319-what-is-the-difference-between-offset-pagination-and-keyset-pagination)
* [13.20 How do you reduce unnecessary SELECT queries?](#1320-how-do-you-reduce-unnecessary-select-queries)
* [13.21 How do you identify slow Hibernate queries?](#1321-how-do-you-identify-slow-hibernate-queries)
* [13.22 How do you analyze generated SQL?](#1322-how-do-you-analyze-generated-sql)
* [13.23 What is the role of database indexes in Hibernate performance?](#1323-what-is-the-role-of-database-indexes-in-hibernate-performance)
* [13.24 How do you optimize queries involving multiple joins?](#1324-how-do-you-optimize-queries-involving-multiple-joins)
* [13.25 How do you avoid unnecessary entity hydration?](#1325-how-do-you-avoid-unnecessary-entity-hydration)
* [13.26 How do DTO projections improve performance?](#1326-how-do-dto-projections-improve-performance)
* [13.27 What is the impact of eager loading on application performance?](#1327-what-is-the-impact-of-eager-loading-on-application-performance)
* [13.28 How do connection pool settings affect Hibernate performance?](#1328-how-do-connection-pool-settings-affect-hibernate-performance)
* [13.29 How do you diagnose connection pool exhaustion?](#1329-how-do-you-diagnose-connection-pool-exhaustion)
* [13.30 How would you optimize an API processing millions of transactions?](#1330-how-would-you-optimize-an-api-processing-millions-of-transactions)

---

## Category 14: Locking and Concurrency Control

* [14.1 What is concurrency control in Hibernate?](#141-what-is-concurrency-control-in-hibernate)
* [14.2 What is optimistic locking?](#142-what-is-optimistic-locking)
* [14.3 What is pessimistic locking?](#143-what-is-pessimistic-locking)
* [14.4 What is the difference between optimistic and pessimistic locking?](#144-what-is-the-difference-between-optimistic-and-pessimistic-locking)
* [14.5 What is the purpose of @Version?](#145-what-is-the-purpose-of-version)
* [14.6 How does Hibernate implement optimistic locking?](#146-how-does-hibernate-implement-optimistic-locking)
* [14.7 What is OptimisticLockException?](#147-what-is-optimisticlockexception)
* [14.8 How do you handle optimistic locking failures?](#148-how-do-you-handle-optimistic-locking-failures)
* [14.9 What is LockModeType.OPTIMISTIC?](#149-what-is-lockmodetypeoptimistic)
* [14.10 What is LockModeType.OPTIMISTIC_FORCE_INCREMENT?](#1410-what-is-lockmodetypeoptimistic_force_increment)
* [14.11 What is LockModeType.PESSIMISTIC_READ?](#1411-what-is-lockmodetypepessimistic_read)
* [14.12 What is LockModeType.PESSIMISTIC_WRITE?](#1412-what-is-lockmodetypepessimistic_write)
* [14.13 What is LockModeType.PESSIMISTIC_FORCE_INCREMENT?](#1413-what-is-lockmodetypepessimistic_force_increment)
* [14.14 What is a database row-level lock?](#1414-what-is-a-database-row-level-lock)
* [14.15 What is a deadlock?](#1415-what-is-a-deadlock)
* [14.16 What causes deadlocks in Hibernate applications?](#1416-what-causes-deadlocks-in-hibernate-applications)
* [14.17 How do you detect and resolve database deadlocks?](#1417-how-do-you-detect-and-resolve-database-deadlocks)
* [14.18 What is lost update?](#1418-what-is-lost-update)
* [14.19 What is dirty read?](#1419-what-is-dirty-read)
* [14.20 What is non-repeatable read?](#1420-what-is-non-repeatable-read)
* [14.21 What is phantom read?](#1421-what-is-phantom-read)
* [14.22 How does transaction isolation prevent concurrency problems?](#1422-how-does-transaction-isolation-prevent-concurrency-problems)
* [14.23 How would you prevent two users from updating the same bank account simultaneously?](#1423-how-would-you-prevent-two-users-from-updating-the-same-bank-account-simultaneously)
* [14.24 How would you maintain consistency during concurrent fund transfers?](#1424-how-would-you-maintain-consistency-during-concurrent-fund-transfers)

---

## Category 15: Inheritance Mapping

* [15.1 What is inheritance mapping in Hibernate?](#151-what-is-inheritance-mapping-in-hibernate)
* [15.2 What are the different inheritance strategies?](#152-what-are-the-different-inheritance-strategies)
* [15.3 What is SINGLE_TABLE inheritance?](#153-what-is-single_table-inheritance)
* [15.4 What is JOINED inheritance?](#154-what-is-joined-inheritance)
* [15.5 What is TABLE_PER_CLASS inheritance?](#155-what-is-table_per_class-inheritance)
* [15.6 What is the purpose of @Inheritance?](#156-what-is-the-purpose-of-inheritance)
* [15.7 What is the purpose of @DiscriminatorColumn?](#157-what-is-the-purpose-of-discriminatorcolumn)
* [15.8 What is the purpose of @DiscriminatorValue?](#158-what-is-the-purpose-of-discriminatorvalue)
* [15.9 What is the difference between SINGLE_TABLE and JOINED?](#159-what-is-the-difference-between-single_table-and-joined)
* [15.10 What is the difference between JOINED and TABLE_PER_CLASS?](#1510-what-is-the-difference-between-joined-and-table_per_class)
* [15.11 Which inheritance strategy provides better query performance?](#1511-which-inheritance-strategy-provides-better-query-performance)
* [15.12 What are the limitations of SINGLE_TABLE inheritance?](#1512-what-are-the-limitations-of-single_table-inheritance)
* [15.13 What are the limitations of JOINED inheritance?](#1513-what-are-the-limitations-of-joined-inheritance)
* [15.14 How does Hibernate handle polymorphic queries?](#1514-how-does-hibernate-handle-polymorphic-queries)
* [15.15 When should you avoid inheritance mapping?](#1515-when-should-you-avoid-inheritance-mapping)
* [15.16 How would you model different payment types using Hibernate inheritance?](#1516-how-would-you-model-different-payment-types-using-hibernate-inheritance)

---

## Category 16: Hibernate Schema and Data Type Management

* [16.1 What is schema generation in Hibernate?](#161-what-is-schema-generation-in-hibernate)
* [16.2 What is hibernate.hbm2ddl.auto?](#162-what-is-hibernatehbm2ddlauto)
* [16.3 Explain create, create-drop, update, validate, and none.](#163-explain-create-create-drop-update-validate-and-none)
* [16.4 Why should you avoid update in production?](#164-why-should-you-avoid-update-in-production)
* [16.5 What is the difference between schema validation and schema migration?](#165-what-is-the-difference-between-schema-validation-and-schema-migration)
* [16.6 What is the role of Flyway with Hibernate?](#166-what-is-the-role-of-flyway-with-hibernate)
* [16.7 What is the role of Liquibase?](#167-what-is-the-role-of-liquibase)
* [16.8 How do you manage database schema changes in production?](#168-how-do-you-manage-database-schema-changes-in-production)
* [16.9 How does Hibernate map Java data types to SQL data types?](#169-how-does-hibernate-map-java-data-types-to-sql-data-types)
* [16.10 How do you map LocalDate and LocalDateTime?](#1610-how-do-you-map-localdate-and-localdatetime)
* [16.11 How do you map BigDecimal?](#1611-how-do-you-map-bigdecimal)
* [16.12 Why should BigDecimal be preferred for financial calculations?](#1612-why-should-bigdecimal-be-preferred-for-financial-calculations)
* [16.13 How do you map JSON columns?](#1613-how-do-you-map-json-columns)
* [16.14 What is AttributeConverter?](#1614-what-is-attributeconverter)
* [16.15 What is the purpose of @Converter?](#1615-what-is-the-purpose-of-converter)
* [16.16 What is the difference between AttributeConverter and a custom Hibernate type?](#1616-what-is-the-difference-between-attributeconverter-and-a-custom-hibernate-type)
* [16.17 How do you map database-specific types?](#1617-how-do-you-map-database-specific-types)
* [16.18 How do you handle timezone-aware timestamps?](#1618-how-do-you-handle-timezone-aware-timestamps)
* [16.19 What is the role of database dialects in type mapping?](#1619-what-is-the-role-of-database-dialects-in-type-mapping)
* [16.20 How do you safely deploy a database schema change without breaking running services?](#1620-how-do-you-safely-deploy-a-database-schema-change-without-breaking-running-services)

---

## Category 17: Hibernate with Spring Boot and Spring Data JPA

* [17.1 How does Hibernate integrate with Spring Boot?](#171-how-does-hibernate-integrate-with-spring-boot)
* [17.2 What is the role of Spring Data JPA?](#172-what-is-the-role-of-spring-data-jpa)
* [17.3 What is the difference between Hibernate and Spring Data JPA?](#173-what-is-the-difference-between-hibernate-and-spring-data-jpa)
* [17.4 What is the role of JpaRepository?](#174-what-is-the-role-of-jparepository)
* [17.5 What is the difference between CrudRepository, PagingAndSortingRepository, and JpaRepository?](#175-what-is-the-difference-between-crudrepository-pagingandsortingrepository-and-jparepository)
* [17.6 What happens internally when you call repository.save()?](#176-what-happens-internally-when-you-call-repositorysave)
* [17.7 Does save() always execute an INSERT?](#177-does-save-always-execute-an-insert)
* [17.8 How does Spring Data JPA decide between persist and merge?](#178-how-does-spring-data-jpa-decide-between-persist-and-merge)
* [17.9 What is the role of EntityManager?](#179-what-is-the-role-of-entitymanager)
* [17.10 How does Spring manage the Hibernate Session?](#1710-how-does-spring-manage-the-hibernate-session)
* [17.11 What is the role of JpaTransactionManager?](#1711-what-is-the-role-of-jpatransactionmanager)
* [17.12 How does Spring manage Hibernate transactions?](#1712-how-does-spring-manage-hibernate-transactions)
* [17.13 How do you configure Hibernate properties in Spring Boot?](#1713-how-do-you-configure-hibernate-properties-in-spring-boot)
* [17.14 How do you enable SQL logging?](#1714-how-do-you-enable-sql-logging)
* [17.15 What is the difference between show-sql and SQL logging through a logger?](#1715-what-is-the-difference-between-show-sql-and-sql-logging-through-a-logger)
* [17.16 What is the purpose of @Query?](#1716-what-is-the-purpose-of-query)
* [17.17 How do you write JPQL queries in Spring Data JPA?](#1717-how-do-you-write-jpql-queries-in-spring-data-jpa)
* [17.18 How do you write native queries in Spring Data JPA?](#1718-how-do-you-write-native-queries-in-spring-data-jpa)
* [17.19 What is the purpose of @Modifying?](#1719-what-is-the-purpose-of-modifying)
* [17.20 Why is @Transactional important for modifying queries?](#1720-why-is-transactional-important-for-modifying-queries)
* [17.21 What is the purpose of @EntityGraph in Spring Data JPA?](#1721-what-is-the-purpose-of-entitygraph-in-spring-data-jpa)
* [17.22 What are Specifications in Spring Data JPA?](#1722-what-are-specifications-in-spring-data-jpa)
* [17.23 What is Query by Example?](#1723-what-is-query-by-example)
* [17.24 How do you implement dynamic filtering?](#1724-how-do-you-implement-dynamic-filtering)
* [17.25 How do you implement pagination using Pageable?](#1725-how-do-you-implement-pagination-using-pageable)
* [17.26 What is the difference between Page, Slice, and List?](#1726-what-is-the-difference-between-page-slice-and-list)
* [17.27 How do you avoid N+1 queries in repository methods?](#1727-how-do-you-avoid-n1-queries-in-repository-methods)
* [17.28 How do you implement auditing using Spring Data JPA?](#1728-how-do-you-implement-auditing-using-spring-data-jpa)
* [17.29 What is the purpose of @CreatedDate and @LastModifiedDate?](#1729-what-is-the-purpose-of-createddate-and-lastmodifieddate)
* [17.30 How do you handle Hibernate exceptions in Spring Boot REST APIs?](#1730-how-do-you-handle-hibernate-exceptions-in-spring-boot-rest-apis)

---

## Category 18: Hibernate Internals and Advanced Concepts

* [18.1 Explain the internal working of Hibernate when save() is called.](#181-explain-the-internal-working-of-hibernate-when-save-is-called)
* [18.2 Explain the complete lifecycle of a Hibernate entity.](#182-explain-the-complete-lifecycle-of-a-hibernate-entity)
* [18.3 What happens internally when a query is executed?](#183-what-happens-internally-when-a-query-is-executed)
* [18.4 How does Hibernate generate SQL?](#184-how-does-hibernate-generate-sql)
* [18.5 What is the role of the Hibernate action queue?](#185-what-is-the-role-of-the-hibernate-action-queue)
* [18.6 What is the write-behind mechanism?](#186-what-is-the-write-behind-mechanism)
* [18.7 How does dirty checking work internally?](#187-how-does-dirty-checking-work-internally)
* [18.8 What is bytecode enhancement in Hibernate?](#188-what-is-bytecode-enhancement-in-hibernate)
* [18.9 What is the difference between proxy-based lazy loading and bytecode enhancement?](#189-what-is-the-difference-between-proxy-based-lazy-loading-and-bytecode-enhancement)
* [18.10 What is a Hibernate proxy?](#1810-what-is-a-hibernate-proxy)
* [18.11 How does Hibernate create proxies?](#1811-how-does-hibernate-create-proxies)
* [18.12 What is the role of Byte Buddy in Hibernate?](#1812-what-is-the-role-of-byte-buddy-in-hibernate)
* [18.13 What is the difference between proxy initialization and entity loading?](#1813-what-is-the-difference-between-proxy-initialization-and-entity-loading)
* [18.14 What is the purpose of Hibernate.initialize()?](#1814-what-is-the-purpose-of-hibernateinitialize)
* [18.15 What is the purpose of Hibernate.isInitialized()?](#1815-what-is-the-purpose-of-hibernateisinitialized)
* [18.16 What is the difference between Session and StatelessSession internally?](#1816-what-is-the-difference-between-session-and-statelesssession-internally)
* [18.17 What is the Hibernate query plan cache?](#1817-what-is-the-hibernate-query-plan-cache)
* [18.18 What is the query plan cache used for?](#1818-what-is-the-query-plan-cache-used-for)
* [18.19 What is the purpose of @Formula?](#1819-what-is-the-purpose-of-formula)
* [18.20 What is the purpose of @Subselect?](#1820-what-is-the-purpose-of-subselect)
* [18.21 What is the purpose of @Where in older Hibernate versions, and what alternatives exist in modern Hibernate?](#1821-what-is-the-purpose-of-where-in-older-hibernate-versions-and-what-alternatives-exist-in-modern-hibernate)
* [18.22 What are Hibernate filters?](#1822-what-are-hibernate-filters)
* [18.23 What is the purpose of @Filter?](#1823-what-is-the-purpose-of-filter)
* [18.24 What is multi-tenancy in Hibernate?](#1824-what-is-multi-tenancy-in-hibernate)
* [18.25 What are the different multi-tenancy strategies?](#1825-what-are-the-different-multi-tenancy-strategies)
* [18.26 What is the difference between database-per-tenant and schema-per-tenant?](#1826-what-is-the-difference-between-database-per-tenant-and-schema-per-tenant)
* [18.27 What is the purpose of CurrentTenantIdentifierResolver?](#1827-what-is-the-purpose-of-currenttenantidentifierresolver)
* [18.28 What is the role of MultiTenantConnectionProvider?](#1828-what-is-the-role-of-multitenantconnectionprovider)
* [18.29 What is Envers?](#1829-what-is-envers)
* [18.30 How does Hibernate Envers maintain entity history?](#1830-how-does-hibernate-envers-maintain-entity-history)

---

## Category 19: Hibernate Validation, Auditing and Security

* [19.1 What is Bean Validation?](#191-what-is-bean-validation)
* [19.2 How does Hibernate Validator work?](#192-how-does-hibernate-validator-work)
* [19.3 What is the difference between Hibernate ORM and Hibernate Validator?](#193-what-is-the-difference-between-hibernate-orm-and-hibernate-validator)
* [19.4 What is the purpose of @NotNull?](#194-what-is-the-purpose-of-notnull)
* [19.5 What is the difference between @NotNull, @NotEmpty, and @NotBlank?](#195-what-is-the-difference-between-notnull-notempty-and-notblank)
* [19.6 What is the purpose of @Size?](#196-what-is-the-purpose-of-size)
* [19.7 What is the purpose of @Valid?](#197-what-is-the-purpose-of-valid)
* [19.8 What is the difference between @Valid and @Validated?](#198-what-is-the-difference-between-valid-and-validated)
* [19.9 How do you validate entity fields before database insertion?](#199-how-do-you-validate-entity-fields-before-database-insertion)
* [19.10 What is entity auditing?](#1910-what-is-entity-auditing)
* [19.11 How do you track who created or updated an entity?](#1911-how-do-you-track-who-created-or-updated-an-entity)
* [19.12 How do you implement soft deletion?](#1912-how-do-you-implement-soft-deletion)
* [19.13 What is the difference between soft delete and hard delete?](#1913-what-is-the-difference-between-soft-delete-and-hard-delete)
* [19.14 How do you prevent sensitive fields from being exposed through API responses?](#1914-how-do-you-prevent-sensitive-fields-from-being-exposed-through-api-responses)
* [19.15 Why should entities not be directly exposed in REST APIs?](#1915-why-should-entities-not-be-directly-exposed-in-rest-apis)
* [19.16 How do you protect Hibernate queries against SQL injection?](#1916-how-do-you-protect-hibernate-queries-against-sql-injection)
* [19.17 How do you encrypt sensitive database fields?](#1917-how-do-you-encrypt-sensitive-database-fields)
* [19.18 What are the limitations of application-level encryption with searchable fields?](#1918-what-are-the-limitations-of-application-level-encryption-with-searchable-fields)
* [19.19 How would you implement tenant-level data isolation?](#1919-how-would-you-implement-tenant-level-data-isolation)
* [19.20 How do you ensure audit history is maintained for financial records?](#1920-how-do-you-ensure-audit-history-is-maintained-for-financial-records)

---

## Category 20: Testing and Debugging Hibernate Applications

* [20.1 How do you test Hibernate-based applications?](#201-how-do-you-test-hibernate-based-applications)
* [20.2 What is the difference between unit testing and integration testing?](#202-what-is-the-difference-between-unit-testing-and-integration-testing)
* [20.3 How do you test JPA repositories?](#203-how-do-you-test-jpa-repositories)
* [20.4 What is @DataJpaTest?](#204-what-is-datajpatest)
* [20.5 What is the purpose of TestEntityManager?](#205-what-is-the-purpose-of-testentitymanager)
* [20.6 How do you test entity relationships?](#206-how-do-you-test-entity-relationships)
* [20.7 How do you test lazy loading?](#207-how-do-you-test-lazy-loading)
* [20.8 How do you test cascade operations?](#208-how-do-you-test-cascade-operations)
* [20.9 How do you test transaction rollback?](#209-how-do-you-test-transaction-rollback)
* [20.10 How do you verify that Hibernate generates the expected SQL?](#2010-how-do-you-verify-that-hibernate-generates-the-expected-sql)
* [20.11 Why should you flush and clear the persistence context during some repository tests?](#2011-why-should-you-flush-and-clear-the-persistence-context-during-some-repository-tests)
* [20.12 Why can an in-memory H2 database behave differently from PostgreSQL, MySQL, or Oracle?](#2012-why-can-an-in-memory-h2-database-behave-differently-from-postgresql-mysql-or-oracle)
* [20.13 How do you use Testcontainers for database integration testing?](#2013-how-do-you-use-testcontainers-for-database-integration-testing)
* [20.14 How do you test optimistic locking?](#2014-how-do-you-test-optimistic-locking)
* [20.15 How do you reproduce a deadlock issue?](#2015-how-do-you-reproduce-a-deadlock-issue)
* [20.16 How do you debug LazyInitializationException?](#2016-how-do-you-debug-lazyinitializationexception)
* [20.17 How do you debug TransientPropertyValueException?](#2017-how-do-you-debug-transientpropertyvalueexception)
* [20.18 How do you debug PersistentObjectException?](#2018-how-do-you-debug-persistentobjectexception)
* [20.19 How do you debug NonUniqueResultException?](#2019-how-do-you-debug-nonuniqueresultexception)
* [20.20 How do you debug ConstraintViolationException?](#2020-how-do-you-debug-constraintviolationexception)
* [20.21 How do you investigate unexpected INSERT or UPDATE statements?](#2021-how-do-you-investigate-unexpected-insert-or-update-statements)
* [20.22 How do you identify a connection leak?](#2022-how-do-you-identify-a-connection-leak)
* [20.23 How do you debug a slow repository method?](#2023-how-do-you-debug-a-slow-repository-method)
* [20.24 How do you identify N+1 queries during integration testing?](#2024-how-do-you-identify-n1-queries-during-integration-testing)

---

## Category 21: Production Issues and Real-World Scenarios

* [21.1 Your API is slow after introducing Hibernate. How would you investigate?](#211-your-api-is-slow-after-introducing-hibernate-how-would-you-investigate)
* [21.2 Your application executes hundreds of SQL queries for one API request. What could be the reason?](#212-your-application-executes-hundreds-of-sql-queries-for-one-api-request-what-could-be-the-reason)
* [21.3 Your API returns LazyInitializationException. How would you fix it?](#213-your-api-returns-lazyinitializationexception-how-would-you-fix-it)
* [21.4 Your database CPU usage suddenly increases. How would you investigate Hibernate queries?](#214-your-database-cpu-usage-suddenly-increases-how-would-you-investigate-hibernate-queries)
* [21.5 Your connection pool is exhausted. How would you troubleshoot it?](#215-your-connection-pool-is-exhausted-how-would-you-troubleshoot-it)
* [21.6 Your application has frequent database deadlocks. How would you resolve them?](#216-your-application-has-frequent-database-deadlocks-how-would-you-resolve-them)
* [21.7 Two users update the same account balance simultaneously. How would you prevent inconsistent data?](#217-two-users-update-the-same-account-balance-simultaneously-how-would-you-prevent-inconsistent-data)
* [21.8 Your batch job processes one million records. How would you optimize it?](#218-your-batch-job-processes-one-million-records-how-would-you-optimize-it)
* [21.9 Your application is consuming too much heap memory during batch processing. How would you investigate?](#219-your-application-is-consuming-too-much-heap-memory-during-batch-processing-how-would-you-investigate)
* [21.10 Your API loads a customer with 20,000 transactions. How would you optimize it?](#2110-your-api-loads-a-customer-with-20000-transactions-how-would-you-optimize-it)
* [21.11 Your application has an N+1 problem in a nested entity relationship. How would you fix it?](#2111-your-application-has-an-n1-problem-in-a-nested-entity-relationship-how-would-you-fix-it)
* [21.12 Your second-level cache returns stale data. How would you investigate?](#2112-your-second-level-cache-returns-stale-data-how-would-you-investigate)
* [21.13 Your database schema changes but the application fails to start. How would you troubleshoot it?](#2113-your-database-schema-changes-but-the-application-fails-to-start-how-would-you-troubleshoot-it)
* [21.14 Your Hibernate-generated SQL works in H2 but fails in Oracle. What would you investigate?](#2114-your-hibernate-generated-sql-works-in-h2-but-fails-in-oracle-what-would-you-investigate)
* [21.15 Your application inserts duplicate records under concurrent requests. How would you prevent this?](#2115-your-application-inserts-duplicate-records-under-concurrent-requests-how-would-you-prevent-this)
* [21.16 Your transaction rolls back unexpectedly. How would you debug it?](#2116-your-transaction-rolls-back-unexpectedly-how-would-you-debug-it)
* [21.17 Your API is timing out during a large database update. How would you optimize it?](#2117-your-api-is-timing-out-during-a-large-database-update-how-would-you-optimize-it)
* [21.18 Your database has millions of records and offset pagination is slow. What would you implement?](#2118-your-database-has-millions-of-records-and-offset-pagination-is-slow-what-would-you-implement)
* [21.19 Your service restarts frequently due to memory pressure. How would you investigate persistence-context growth?](#2119-your-service-restarts-frequently-due-to-memory-pressure-how-would-you-investigate-persistence-context-growth)
* [21.20 Your application has intermittent database connection failures. How would you investigate the root cause?](#2120-your-application-has-intermittent-database-connection-failures-how-would-you-investigate-the-root-cause)

---

## Category 22: Senior Developer / Technical Lead / Architecture Questions

* [22.1 How would you define Hibernate usage standards for a large development team?](#221-how-would-you-define-hibernate-usage-standards-for-a-large-development-team)
* [22.2 How would you design a reusable persistence layer for multiple microservices?](#222-how-would-you-design-a-reusable-persistence-layer-for-multiple-microservices)
* [22.3 How would you decide between Hibernate, JDBC, and jOOQ for a particular use case?](#223-how-would-you-decide-between-hibernate-jdbc-and-jooq-for-a-particular-use-case)
* [22.4 When would you choose Spring Data JPA over direct EntityManager usage?](#224-when-would-you-choose-spring-data-jpa-over-direct-entitymanager-usage)
* [22.5 When would you choose native SQL over JPQL?](#225-when-would-you-choose-native-sql-over-jpql)
* [22.6 How would you design entity relationships for a large banking application?](#226-how-would-you-design-entity-relationships-for-a-large-banking-application)
* [22.7 How would you prevent tightly coupled entity relationships across microservices?](#227-how-would-you-prevent-tightly-coupled-entity-relationships-across-microservices)
* [22.8 How would you design persistence for a high-throughput transaction service?](#228-how-would-you-design-persistence-for-a-high-throughput-transaction-service)
* [22.9 How would you ensure data consistency during concurrent financial transactions?](#229-how-would-you-ensure-data-consistency-during-concurrent-financial-transactions)
* [22.10 How would you design a scalable batch-processing architecture using Hibernate?](#2210-how-would-you-design-a-scalable-batch-processing-architecture-using-hibernate)
* [22.11 How would you establish standards for fetching strategies across a development team?](#2211-how-would-you-establish-standards-for-fetching-strategies-across-a-development-team)
* [22.12 How would you prevent N+1 problems during code reviews?](#2212-how-would-you-prevent-n1-problems-during-code-reviews)
* [22.13 How would you establish Hibernate performance benchmarks?](#2213-how-would-you-establish-hibernate-performance-benchmarks)
* [22.14 What Hibernate metrics would you monitor in production?](#2214-what-hibernate-metrics-would-you-monitor-in-production)
* [22.15 How would you monitor query execution time and connection pool utilization?](#2215-how-would-you-monitor-query-execution-time-and-connection-pool-utilization)
* [22.16 How would you investigate a sudden increase in database latency after a release?](#2216-how-would-you-investigate-a-sudden-increase-in-database-latency-after-a-release)
* [22.17 How would you review an entity mapping that has multiple bidirectional relationships?](#2217-how-would-you-review-an-entity-mapping-that-has-multiple-bidirectional-relationships)
* [22.18 How would you handle schema migrations across multiple microservices?](#2218-how-would-you-handle-schema-migrations-across-multiple-microservices)
* [22.19 How would you manage database backward compatibility during zero-downtime deployments?](#2219-how-would-you-manage-database-backward-compatibility-during-zero-downtime-deployments)
* [22.20 How would you design multi-tenant persistence for a SaaS application?](#2220-how-would-you-design-multi-tenant-persistence-for-a-saas-application)
* [22.21 How would you design auditability and data retention for financial transactions?](#2221-how-would-you-design-auditability-and-data-retention-for-financial-transactions)
* [22.22 How would you handle database failures during critical transactions?](#2222-how-would-you-handle-database-failures-during-critical-transactions)
* [22.23 How would you design retry mechanisms without creating duplicate database records?](#2223-how-would-you-design-retry-mechanisms-without-creating-duplicate-database-records)
* [22.24 How would you prevent long-running transactions in distributed systems?](#2224-how-would-you-prevent-long-running-transactions-in-distributed-systems)
* [22.25 How would you explain the trade-offs of ORM to architects and engineering managers?](#2225-how-would-you-explain-the-trade-offs-of-orm-to-architects-and-engineering-managers)
* [22.26 How would you mentor junior developers to write efficient Hibernate queries?](#2226-how-would-you-mentor-junior-developers-to-write-efficient-hibernate-queries)
* [22.27 How would you handle disagreements about ORM design during code reviews?](#2227-how-would-you-handle-disagreements-about-orm-design-during-code-reviews)
* [22.28 How would you create a Hibernate coding checklist for production readiness?](#2228-how-would-you-create-a-hibernate-coding-checklist-for-production-readiness)
* [22.29 What are the most common Hibernate anti-patterns you would prohibit in your team?](#2229-what-are-the-most-common-hibernate-anti-patterns-you-would-prohibit-in-your-team)
* [22.30 How would you migrate a legacy JDBC application to Hibernate without disrupting production?](#2230-how-would-you-migrate-a-legacy-jdbc-application-to-hibernate-without-disrupting-production)

---

## Recommended Preparation Order

| Priority | Categories | Importance |
| :--- | :--- | :--- |
| **Must prepare** | 1–8 | Very high |
| **Must prepare** | 9–14 | Very high |
| **Advanced** | 15–20 | High |
| **Senior / Lead** | 21–22 | Very high for experienced roles |

---

## Important Practical Coding Tasks

Don't prepare Hibernate only theoretically. Ensure you write implementation code for the following examples:

1. Employee CRUD using Hibernate.
2. One-to-One Employee–Address mapping.
3. One-to-Many Customer–Account mapping.
4. Many-to-Many Student–Course mapping.
5. Cascade and orphan removal implementation.
6. Lazy vs eager loading demonstration.
7. N+1 problem and its solution.
8. Pagination and sorting.
9. JPQL and native SQL queries.
10. Dynamic queries using Criteria API.
11. Optimistic locking using `@Version`.
12. Pessimistic locking for concurrent updates.
13. First-level and second-level caching.
14. JDBC batch inserts.
15. Transaction rollback scenarios.
16. Flyway database migration with Hibernate.
17. Repository integration testing with Testcontainers.