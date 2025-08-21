# Stage 1: Build the JAR
FROM maven:3.8.5-openjdk-17-slim AS builder
WORKDIR /app

# Copy everything (not just src)
COPY . .

# Build Spring Boot fat JAR
RUN mvn clean package spring-boot:repackage -DskipTests

# Stage 2: Runtime
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy only the built JAR
COPY --from=builder /app/target/portfolio-tracker-1.0.0.jar app.jar

# Run as non-root user
USER 1000
ENTRYPOINT ["java","-jar","app.jar"]
