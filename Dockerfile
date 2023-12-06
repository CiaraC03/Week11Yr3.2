FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/RegistrationServiceWk4-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "RegistrationServiceWk4-0.0.1-SNAPSHOT.jar"]