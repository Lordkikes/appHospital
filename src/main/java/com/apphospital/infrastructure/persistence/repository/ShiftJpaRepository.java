package com.apphospital.infrastructure.persistence.repository;

import com.apphospital.infrastructure.persistence.entity.ShiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShiftJpaRepository extends JpaRepository<ShiftEntity, UUID> {
}
