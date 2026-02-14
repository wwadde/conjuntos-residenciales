# Stage 1: Build
FROM gradle:8-jdk21-alpine AS builder
WORKDIR /build
COPY build.gradle.kts settings.gradle.kts ./
COPY src ./src
RUN gradle bootJar --no-daemon

# Stage 2: Runtime
FROM eclipse-temurin:21-jre-alpine
LABEL maintainer="william"
LABEL description="Conjuntos API"

# Crear usuario no-root por seguridad
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /app
COPY --from=builder /build/build/libs/*.jar app.jar

# Instalar curl para healthcheck
USER root
RUN apk add --no-cache curl
USER spring:spring

ENV SPRING_PROFILES_ACTIVE=prod

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
