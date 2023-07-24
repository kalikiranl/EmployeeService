FROM openjdk:17
COPY build/libs/demo-0.0.1-SNAPSHOT.jar Application.jar
CMD ["java","-jar","Application.jar"]
EXPOSE 2019