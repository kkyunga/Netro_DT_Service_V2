FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/sht_webapp.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]