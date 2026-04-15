package com.apphospital.infrastructure.persistence.repository;

import com.apphospital.infrastructure.persistence.entity.SpecialtyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecialtyJpaRepository extends JpaRepository<SpecialtyEntity, UUID> {
}
