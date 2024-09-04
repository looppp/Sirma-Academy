# Maven for build
# WORKDIR
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /app


# Copy dependency pom.xml
# Install dependency
COPY pom.xml .
RUN mvn dependency:go-offline -B


# Copy src
COPY src ./src
# Build nb - skip tests => jar files

RUN mvn clean package -DskipTests

# runtime - alpine version (running the application)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# copy jar file
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar
# port
EXPOSE 8085
# entry point
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]