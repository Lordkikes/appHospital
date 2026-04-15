package com.apphospital.infrastructure.persistence.adapter;

import com.apphospital.domain.model.Specialty;
import com.apphospital.domain.port.out.SpecialtyRepositoryPort;
import com.apphospital.infrastructure.persistence.mapper.PersistenceMapper;
import com.apphospital.infrastructure.persistence.repository.SpecialtyJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpecialtyRepositoryAdapter implements SpecialtyRepositoryPort {

    private final SpecialtyJpaRepository specialtyJpaRepository;
    private final PersistenceMapper persistenceMapper;

    public SpecialtyRepositoryAdapter(SpecialtyJpaRepository specialtyJpaRepository, PersistenceMapper persistenceMapper) {
        this.specialtyJpaRepository = specialtyJpaRepository;
        this.persistenceMapper = persistenceMapper;
    }

    @Override
    public Specialty save(Specialty specialty) {
        return persistenceMapper.toDomain(specialtyJpaRepository.save(persistenceMapper.toEntity(specialty)));
    }

    @Override
    public List<Specialty> findAll() {
        return specialtyJpaRepository.findAll().stream().map(persistenceMapper::toDomain).toList();
    }
}
