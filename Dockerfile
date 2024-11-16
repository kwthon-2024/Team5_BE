# Step 1: Use JDK 21 for the build stage
FROM eclipse-temurin:21-jdk-alpine AS builder

# Step 2: Set up the Gradle build environment adsfawef
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Step 3: Ensure the gradlew script is executable and build the application
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

# Step 4: Use JDK 21 for the runtime stage
FROM eclipse-temurin:21-jdk-alpine

# Step 5: Expose the application port
EXPOSE 8080

# Step 6: Copy the built JAR file from the builder stage (use wildcard to avoid filename mismatch)
COPY --from=builder build/libs/*.jar app.jar

# Step 7: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]