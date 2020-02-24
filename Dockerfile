FROM openjdk:8u232-jdk
VOLUME /tmp
COPY target/*.jar /deployments/app.jar

ENTRYPOINT exec java -jar /deployments/app.jar