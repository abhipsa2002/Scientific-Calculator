FROM openjdk:11
COPY ./target/Scientific-Calculator-1.0-SNAPSHOT-shaded.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific-Calculator-1.0-SNAPSHOT-shaded.jar"]
