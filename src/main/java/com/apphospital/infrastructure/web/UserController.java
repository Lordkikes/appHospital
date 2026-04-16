package com.apphospital.infrastructure.web;

import com.apphospital.application.UserService;
import com.apphospital.domain.model.User;
import com.apphospital.infrastructure.web.dto.CreateUserRequest;
import com.apphospital.infrastructure.web.mapper.WebMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final WebMapper webMapper;

    public UserController(UserService userService, WebMapper webMapper) {
        this.userService = userService;
        this.webMapper = webMapper;
    }

    @PostMapping
    public User create(@RequestBody @Valid CreateUserRequest request) {
        return userService.create(webMapper.toDomain(request));
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }
}
