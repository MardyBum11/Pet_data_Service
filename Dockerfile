FROM openjdk:17
ADD target/demo-0.0.1-pet-info.jar demo-0.0.1-pet-info.jar
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-pet-info.jar"]
EXPOSE 8080
