FROM ubuntu:latest
LABEL authors="joshrichhy"

FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests

FROM openjdk:17
COPY --from=build target/*.jar fibonacci.jar

ENTRYPOINT ["java", "-jar", "-Dserver.port=8282","fibonacci.jar"]
