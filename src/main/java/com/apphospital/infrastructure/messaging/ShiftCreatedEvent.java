package com.apphospital.infrastructure.messaging;

import com.apphospital.domain.model.ShiftStatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public record ShiftCreatedEvent(
        UUID id,
        UUID staffMemberId,
        UUID patientId,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        ShiftStatus status,
        String notes
) {
}
