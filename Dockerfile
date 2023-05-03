FROM openjdk:17
EXPOSE 8080
ADD target/hello-world-app.jar hello-world-app.jar
ENTRYPOINT ["java","-jar","/hello-world-app.jar"]
