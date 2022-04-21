FROM openjdk:8-jre-alpine

COPY build/libs/api-cotizaciones-spring-0.1.0.jar /usr/src/api-cotizaciones-spring/api-cotizaciones-spring-0.1.0.jar

WORKDIR /usr/src/api-cotizaciones-spring/
EXPOSE 8080
CMD ["java", "-jar", "api-cotizaciones-spring-0.1.0.jar"]
