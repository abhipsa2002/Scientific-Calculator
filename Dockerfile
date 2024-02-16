FROM openjdk:11
COPY ./target/Scientific-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","Scientific-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
