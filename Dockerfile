FROM eclipse-temurin:17

CMD ["mvn", "clean", "package"]

COPY target/*.jar order-service-v1.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/order-service-v1.jar"]