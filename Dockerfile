FROM openjdk:11
COPY ./target/Scientific-Calculator-1.0-SNAPSHOT.jar
.jar ./
WORKDIR ./
CMD ["java","-jar","Scientific-Calculator-1.0-SNAPSHOT.jar"]
