package com.apphospital.infrastructure.persistence.adapter;

import com.apphospital.domain.model.User;
import com.apphospital.domain.port.out.UserRepositoryPort;
import com.apphospital.infrastructure.persistence.mapper.PersistenceMapper;
import com.apphospital.infrastructure.persistence.repository.UserJpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserJpaRepository userJpaRepository;
    private final PersistenceMapper persistenceMapper;

    public UserRepositoryAdapter(UserJpaRepository userJpaRepository, PersistenceMapper persistenceMapper) {
        this.userJpaRepository = userJpaRepository;
        this.persistenceMapper = persistenceMapper;
    }

    @Override
    public User save(User user) {
        return persistenceMapper.toDomain(userJpaRepository.save(persistenceMapper.toEntity(user)));
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll().stream().map(persistenceMapper::toDomain).toList();
    }
}
