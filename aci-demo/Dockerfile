FROM openjdk:17-jdk-slim
VOLUME /tmp

# Expose port 80 instead of 8080
EXPOSE 80

# Copy and run the JAR
COPY target/*.jar app.jar

# Pass server.port=80 to Spring Boot at runtime
ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=80"]

