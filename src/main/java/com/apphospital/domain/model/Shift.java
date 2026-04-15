package com.apphospital.domain.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record Shift(
        UUID id,
        UUID staffMemberId,
        UUID patientId,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        ShiftStatus status,
        String notes
) {
}
