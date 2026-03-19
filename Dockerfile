FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY build/libs/devops-0.0.1-SNAPSHOT-plain.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]