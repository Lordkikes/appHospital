package com.apphospital.application;

import com.apphospital.domain.model.User;
import com.apphospital.domain.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public User create(User user) {
        User toPersist = new User(
                UUID.randomUUID(),
                user.username(),
                user.email(),
                user.passwordHash(),
                user.roles());
        return userRepositoryPort.save(toPersist);
    }

    public List<User> findAll() {
        return userRepositoryPort.findAll();
    }
}
