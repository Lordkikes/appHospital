# appHospital - Gestión de citas hospitalarias

Proyecto base en **Java 21 + Spring Boot + PostgreSQL + Kafka** siguiendo **arquitectura hexagonal**.

## Capacidades funcionales implementadas
- Registro y consulta de usuarios y roles.
- Registro y consulta de médicos y enfermeras (staff asistencial).
- Registro y consulta de especialidades.
- Registro y consulta de pacientes, incluyendo tipo de EPS (pública o privada).
- Registro y consulta de turnos/citas.
- Publicación de evento Kafka al crear un turno (`hospital.shift.created`).

## Arquitectura
- `domain`: modelo de dominio + puertos de salida.
- `application`: casos de uso / servicios de aplicación.
- `infrastructure`: adaptadores de persistencia (JPA/PostgreSQL), web (REST), y mensajería (Kafka).

## Requisitos
- Java 21
- Maven 3.9+
- Docker / Docker Compose

## Ejecución local
1. Levantar infraestructura:
   ```bash
   docker compose up -d
   ```
2. Ejecutar aplicación:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints principales
- `POST /api/users`, `GET /api/users`
- `POST /api/specialties`, `GET /api/specialties`
- `POST /api/staff`, `GET /api/staff`
- `POST /api/patients`, `GET /api/patients`
- `POST /api/shifts`, `GET /api/shifts`

## Buenas prácticas aplicadas
- Separación estricta por capas hexagonales.
- Mapeo de DTO/entidades con MapStruct.
- Validaciones de entrada con Bean Validation.
- Contratos de persistencia desacoplados mediante puertos.
