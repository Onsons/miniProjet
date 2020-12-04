FROM adoptopenjdk/openjdk14:alpine-jre
ADD target/todo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]