package com.apphospital.usuarios;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
 private final UserRepository repository; private final UserMapper mapper;
 public UserService(UserRepository repository, UserMapper mapper){this.repository=repository; this.mapper=mapper;}
 public User create(User user){ return mapper.toDomain(repository.save(mapper.toEntity(new User(UUID.randomUUID(),user.username(),user.email(),user.passwordHash(),user.roles())))); }
 public List<User> findAll(){ return repository.findAll().stream().map(mapper::toDomain).toList(); }
}
