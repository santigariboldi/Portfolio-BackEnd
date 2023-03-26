FROM amazoncorretto:17-alpine-jdk
MAINTAINER SNG
COPY target/sng-0.0.1-SNAPSHOT.jar sng-0.0.1-SNAPSHOT.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sng-0.0.1-SNAPSHOT.jar"]