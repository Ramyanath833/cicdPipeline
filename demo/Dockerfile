FROM adoptopenjdk/openjdk14:alpine-slim
COPY target/cicdStudent.jar cicdStudent.jar
EXPOSE 8071
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "cicdStudent.jar"]
