FROM openjdk:11-jdk-slim


COPY target/demo.zero.downtime.sb-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080