FROM openjdk:17-jdk-slim

WORKDIR /app


COPY target/WebService_Uppgifter_Lektion_5-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]

