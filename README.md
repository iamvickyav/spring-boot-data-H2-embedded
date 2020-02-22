# Spring-boot-data-H2-embedded

In this app, I used H2 in-memory database for demo purpose

**Application.properties**

```
spring.datasource.url=jdbc:h2:mem:TEST;DB_CLOSE_DELAY=-1;
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.platform=h2
spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
```

This single interface will do all the magic for you

```
public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
```

**To Run without Docker**

```
> mvn clean install
> java -jar target/spring-h2-demo.jar
```

**To Run with Docker**
```
> mvn clean install
> docker build -t springboot-h2-sample
> docker run -d -p 8080:8080 springboot-h2-sample

> docker stop <image-name>
```
