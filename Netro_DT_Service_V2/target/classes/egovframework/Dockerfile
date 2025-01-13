FROM openjdk:17-jdk-slim
ENV JENKINS_OPTS --httpPort=8889
WORKDIR /app
COPY target/sht_webapp.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]