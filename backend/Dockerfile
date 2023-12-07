#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /docvet
COPY . .
RUN mvn clean package

#
# Package stage
#
FROM openjdk:17-alpine
COPY --from=build /backend/target/docvet.jar docvet.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docvet.jar"]