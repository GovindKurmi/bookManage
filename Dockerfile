FROM openjdk:17-jdk-alpine
ADD target/BookManagement.jar BookManagement.jar
EXPOSE 8083
# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "BookManagement.jar"]
