#FROM openjdk:15
#COPY target/classes/ /
#WORKDIR /tmp
#CMD java ie.atu.Passenger

FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]