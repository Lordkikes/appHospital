package com.apphospital.domain.model;

import java.util.UUID;

public record StaffMember(
        UUID id,
        UUID userId,
        StaffType type,
        UUID specialtyId,
        String licenseNumber
) {
}
