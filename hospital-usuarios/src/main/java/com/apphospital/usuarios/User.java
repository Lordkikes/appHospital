package com.apphospital.usuarios;

import com.apphospital.shared.RoleType;
import java.util.Set;
import java.util.UUID;

public record User(UUID id, String username, String email, String passwordHash, Set<RoleType> roles) {}
