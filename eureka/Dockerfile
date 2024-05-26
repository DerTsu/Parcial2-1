FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-docker.jar
ENTRYPOINT [ "java", "-jar", "/spring-boot-docker.jar" ]