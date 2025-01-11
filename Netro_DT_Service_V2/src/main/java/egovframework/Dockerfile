FROM openjdk:17
WORKDIR /app
COPY target/sht_webapp.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]