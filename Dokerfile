# Step 1: Use an official OpenJDK 21 runtime as the base image
FROM eclipse-temurin:21-jdk-jammy

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the application JAR to the container
COPY build/libs/groupapp-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port your app runs on (default Spring Boot port)
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
