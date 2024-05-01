FROM maven:3.9.5-openjdk-22.ea-b19 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:22-slim
COPY --from=build /taget/ltnc-0.0.1-SNAPSHOT.jar ltnc.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","ltnc.jar"]