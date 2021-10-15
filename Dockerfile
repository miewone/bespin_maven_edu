FROM openjdk
ADD ./target/bespin_maven_edu-0.0.1-SNAPSHOT.jar edu.jar
ENTRYPOINT ["java","-jar","/edu.jar"]