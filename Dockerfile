FROM maven:3.8.2-jdk-17

WORKDIR /task-list
COPY "./target/task-list-0.0.1-SNAPSHOT.jar" "app.jar"

RUN mvn clean install

CMD mvn spring-boot:run