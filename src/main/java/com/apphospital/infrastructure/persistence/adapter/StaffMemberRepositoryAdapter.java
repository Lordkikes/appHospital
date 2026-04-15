package com.apphospital.infrastructure.persistence.adapter;

import com.apphospital.domain.model.StaffMember;
import com.apphospital.domain.port.out.StaffMemberRepositoryPort;
import com.apphospital.infrastructure.persistence.mapper.PersistenceMapper;
import com.apphospital.infrastructure.persistence.repository.StaffMemberJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffMemberRepositoryAdapter implements StaffMemberRepositoryPort {

    private final StaffMemberJpaRepository staffMemberJpaRepository;
    private final PersistenceMapper persistenceMapper;

    public StaffMemberRepositoryAdapter(StaffMemberJpaRepository staffMemberJpaRepository, PersistenceMapper persistenceMapper) {
        this.staffMemberJpaRepository = staffMemberJpaRepository;
        this.persistenceMapper = persistenceMapper;
    }

    @Override
    public StaffMember save(StaffMember staffMember) {
        return persistenceMapper.toDomain(staffMemberJpaRepository.save(persistenceMapper.toEntity(staffMember)));
    }

    @Override
    public List<StaffMember> findAll() {
        return staffMemberJpaRepository.findAll().stream().map(persistenceMapper::toDomain).toList();
    }
}
