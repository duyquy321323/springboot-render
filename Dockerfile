FROM jelastic/maven:3.9.5-openjdk-22.ea-b19 AS build
COPY . .

FROM openjdk:22-slim
WORKDIR /app
COPY --from=build /app/target/your-application.jar ./application.jar
CMD ["java", "-jar", "ltnc.jar"]