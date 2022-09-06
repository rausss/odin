FROM maven:3.8.6-eclipse-temurin-17-alpine AS MAVEN_BUILD

COPY ./ ./

RUN mvn clean package

FROM openjdk:8-jre-alpine3.9

COPY --from=MAVEN_BUILD /target/odin-0.0.1-SNAPSHOT.jar /odin.jar

CMD ["java", "-jar", "target/odin-0.0.1-SNAPSHOT.jar"]