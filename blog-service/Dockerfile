FROM openjdk:17
LABEL authors="Ramanath Naik"
# Set working directory inside the container
WORKDIR /app
# Set working directory inside the container
COPY ./target/blog-service.jar /app
# Expose the port the Spring Boot application will run on
EXPOSE 8080
# Command to run the application
CMD ["java", "-jar", "blog-service.jar"]