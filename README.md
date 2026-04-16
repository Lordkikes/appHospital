# appHospital - arquitectura multimódulo por dominio

Parent: **appHospital**

## Módulos
- `hospital-usuarios`
- `hospital-especialidad`
- `hospital-doctores`
- `hospital-enfermeras`
- `hospital-pacientes`
- `hospital-citas`
- `hospital-shared` (tipos compartidos)
- `hospital-boot` (arranque Spring Boot)

## Stack
- Java 21
- Spring Boot
- PostgreSQL
- Kafka
- MapStruct
- Docker

## Build y ejecución
```bash
docker compose up -d
mvn clean package
java -jar hospital-boot/target/hospital-boot-0.0.1-SNAPSHOT.jar
```
