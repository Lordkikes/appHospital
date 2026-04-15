package com.apphospital.domain.model;

import java.util.UUID;

public record Specialty(
        UUID id,
        String name,
        String description
) {
}
