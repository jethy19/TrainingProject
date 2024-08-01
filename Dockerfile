FROM openjdk:21
EXPOSE 9000
ADD target/AQE.jar AQE.jar
ENTRYPOINT ["java", "-jar", "/AQE.jar"]
