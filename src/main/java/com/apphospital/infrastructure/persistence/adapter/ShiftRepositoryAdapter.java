package com.apphospital.infrastructure.persistence.adapter;

import com.apphospital.domain.model.Shift;
import com.apphospital.domain.port.out.ShiftRepositoryPort;
import com.apphospital.infrastructure.persistence.mapper.PersistenceMapper;
import com.apphospital.infrastructure.persistence.repository.ShiftJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShiftRepositoryAdapter implements ShiftRepositoryPort {

    private final ShiftJpaRepository shiftJpaRepository;
    private final PersistenceMapper persistenceMapper;

    public ShiftRepositoryAdapter(ShiftJpaRepository shiftJpaRepository, PersistenceMapper persistenceMapper) {
        this.shiftJpaRepository = shiftJpaRepository;
        this.persistenceMapper = persistenceMapper;
    }

    @Override
    public Shift save(Shift shift) {
        return persistenceMapper.toDomain(shiftJpaRepository.save(persistenceMapper.toEntity(shift)));
    }

    @Override
    public List<Shift> findAll() {
        return shiftJpaRepository.findAll().stream().map(persistenceMapper::toDomain).toList();
    }
}
