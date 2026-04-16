package com.apphospital.infrastructure.web.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;
import java.util.UUID;

public record CreateShiftRequest(
        @NotNull UUID staffMemberId,
        @NotNull UUID patientId,
        @NotNull @Future OffsetDateTime startAt,
        @NotNull @Future OffsetDateTime endAt,
        String notes
) {
}
