FROM java:8-jdk-alpine

COPY ./target/spring.config.client-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

#RUN sh -c 'touch login-service-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring.config.client-0.0.1-SNAPSHOT.jar"]