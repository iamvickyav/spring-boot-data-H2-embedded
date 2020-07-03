FROM openjdk:8-jre-slim
WORKDIR /home
COPY /target/spring-h2-demo.jar spring-h2-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-h2-demo.jar"]
