package com.apphospital.infrastructure.persistence.adapter;

import com.apphospital.domain.model.Patient;
import com.apphospital.domain.port.out.PatientRepositoryPort;
import com.apphospital.infrastructure.persistence.mapper.PersistenceMapper;
import com.apphospital.infrastructure.persistence.repository.PatientJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientRepositoryAdapter implements PatientRepositoryPort {

    private final PatientJpaRepository patientJpaRepository;
    private final PersistenceMapper persistenceMapper;

    public PatientRepositoryAdapter(PatientJpaRepository patientJpaRepository, PersistenceMapper persistenceMapper) {
        this.patientJpaRepository = patientJpaRepository;
        this.persistenceMapper = persistenceMapper;
    }

    @Override
    public Patient save(Patient patient) {
        return persistenceMapper.toDomain(patientJpaRepository.save(persistenceMapper.toEntity(patient)));
    }

    @Override
    public List<Patient> findAll() {
        return patientJpaRepository.findAll().stream().map(persistenceMapper::toDomain).toList();
    }
}
