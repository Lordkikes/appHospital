package com.apphospital.infrastructure.web.dto;

import com.apphospital.domain.model.EpsType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record CreatePatientRequest(
        @NotBlank String documentNumber,
        @NotBlank String firstName,
        @NotBlank String lastName,
        @NotNull LocalDate birthDate,
        @NotNull EpsType epsType,
        @NotBlank String epsName
) {
}
