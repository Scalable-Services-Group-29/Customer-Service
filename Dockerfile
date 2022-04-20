FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} customer.jar
ENTRYPOINT ["java","-jar","/customer.jar"]
