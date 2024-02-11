FROM openjdk:17-jdk-slim

WORKDIR application

COPY target/trainingsground_actions-jar-with-dependencies.jar /application/trainingsground.jar

RUN addgroup --gid 1000 appusers && \
    adduser --uid 1000 --gid 1000 --disabled-password --gecos "" appuser && \
    mkdir -p /application/.m2 && \
    chown appuser:appusers . -R

USER appuser


ENTRYPOINT ["java", "-jar", "/application/trainingsground.jar"]