FROM openjdk:17-jdk-alpine
ADD target/springbootLearn.jar springbootLearn.jar
EXPOSE 8083

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "springbootLearn.jar"]
