FROM centos

RUN yum install -y java

VOLUME /tmp
ADD target/spring-h2-demo.jar spring-h2-demo.jar
RUN sh -c 'touch /spring-h2-demo.jar'
ENTRYPOINT ["java", "-jar", "/spring-h2-demo.jar"]