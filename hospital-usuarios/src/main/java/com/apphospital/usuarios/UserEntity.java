package com.apphospital.usuarios;

import com.apphospital.shared.RoleType;
import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity @Table(name="users")
public class UserEntity {
 @Id public UUID id;
 @Column(nullable=false, unique=true) public String username;
 @Column(nullable=false, unique=true) public String email;
 @Column(nullable=false) public String passwordHash;
 @ElementCollection(fetch=FetchType.EAGER) @CollectionTable(name="user_roles", joinColumns=@JoinColumn(name="user_id"))
 @Enumerated(EnumType.STRING) @Column(name="role") public Set<RoleType> roles;
}
