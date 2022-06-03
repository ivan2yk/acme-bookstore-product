FROM openjdk:11-jre-slim
COPY target/*.jar /app.jar
CMD ["java", "-Dspring.profiles.active=h2", "-jar", "app.jar"]