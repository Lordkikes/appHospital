package com.apphospital.infrastructure.persistence.repository;

import com.apphospital.infrastructure.persistence.entity.StaffMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StaffMemberJpaRepository extends JpaRepository<StaffMemberEntity, UUID> {
}
