package com.apphospital.infrastructure.web.dto;

import com.apphospital.domain.model.RoleType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Set;

public record CreateUserRequest(
        @NotBlank String username,
        @NotBlank @Email String email,
        @NotBlank String passwordHash,
        @NotEmpty Set<RoleType> roles
) {
}
