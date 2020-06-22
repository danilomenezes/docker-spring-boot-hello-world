FROM openjdk:8
ADD target/poc-docker-0.0.1-SNAPSHOT.jar opt/apl/poc-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","opt/apl/poc-docker-0.0.1-SNAPSHOT.jar"]