package com.apphospital.infrastructure.web.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateSpecialtyRequest(
        @NotBlank String name,
        String description
) {
}
