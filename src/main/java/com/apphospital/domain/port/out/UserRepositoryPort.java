package com.apphospital.domain.port.out;

import com.apphospital.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {
    User save(User user);
    List<User> findAll();
}
