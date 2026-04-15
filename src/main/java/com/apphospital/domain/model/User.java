package com.apphospital.domain.model;

import java.util.Set;
import java.util.UUID;

public record User(
        UUID id,
        String username,
        String email,
        String passwordHash,
        Set<RoleType> roles
) {
}
