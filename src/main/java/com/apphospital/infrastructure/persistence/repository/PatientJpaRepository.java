package com.apphospital.infrastructure.persistence.repository;

import com.apphospital.infrastructure.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientJpaRepository extends JpaRepository<PatientEntity, UUID> {
}
