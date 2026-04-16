package com.apphospital.infrastructure.web.dto;

import com.apphospital.domain.model.StaffType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreateStaffMemberRequest(
        @NotNull UUID userId,
        @NotNull StaffType type,
        @NotNull UUID specialtyId,
        @NotBlank String licenseNumber
) {
}
