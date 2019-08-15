FROM openjdk:11

EXPOSE 8888

RUN mkdir app

COPY ./build/libs/exemplo-sping-cloud-config-0.0.1-SNAPSHOT.jar /app/exemplo-sping-cloud-config-0.0.1-SNAPSHOT.jar

ENTRYPOINT java -jar ./app/exemplo-sping-cloud-config-0.0.1-SNAPSHOT.jar

