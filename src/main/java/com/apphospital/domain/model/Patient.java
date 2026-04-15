package com.apphospital.domain.model;

import java.time.LocalDate;
import java.util.UUID;

public record Patient(
        UUID id,
        String documentNumber,
        String firstName,
        String lastName,
        LocalDate birthDate,
        EpsType epsType,
        String epsName
) {
}
