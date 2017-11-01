# Spring-boot-data-H2-embedded

This Demo App uses Spring Boot Data with H2 In Memory Database

Basic database operations using Spring Data explained with simple examples

Create a Spring Boot application using https://start.spring.io (Spring Initializer) by chosing dependencies as Spring Web & Data

In this app we used H2 in memory database for demo purpose. 

Application.properties

```
spring.datasource.url=jdbc:h2:mem:TEST;MVCC=true;DB_CLOSE_DELAY=-1;MODE=Oracle
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.platform=h2
spring.jpa.hibernate.ddl-auto=none
```

This single line will do all the magic for you using Spring JPA

```
public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
```

To download this code

git clone https://github.com/iamvickyav/Spring-boot-data-H2-embedded.git
