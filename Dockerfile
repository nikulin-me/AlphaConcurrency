FROM openjdk:16
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} alpha.jar
CMD ["java","-jar","alpha.jar"]

