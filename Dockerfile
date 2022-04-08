FROM openjdk:11
COPY ./target/SPE_DevOps_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_DevOps_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]