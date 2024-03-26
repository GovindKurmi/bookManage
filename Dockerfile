# Use a base image with OpenJDK installed
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring Boot application JAR file into the container
COPY target/BookManagement.jar /app/BookManagement.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8092

# Specify the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "BookManagement.jar"]
