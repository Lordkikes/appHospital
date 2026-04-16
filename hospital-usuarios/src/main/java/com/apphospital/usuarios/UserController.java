package com.apphospital.usuarios;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;
import com.apphospital.shared.RoleType;

record CreateUserRequest(@NotBlank String username,@Email String email,@NotBlank String passwordHash,@NotEmpty Set<RoleType> roles){}

@RestController @RequestMapping("/api/usuarios")
public class UserController {
 private final UserService service;
 public UserController(UserService service){this.service=service;}
 @PostMapping public User create(@RequestBody @Valid CreateUserRequest r){ return service.create(new User(null,r.username(),r.email(),r.passwordHash(),r.roles())); }
 @GetMapping public List<User> list(){ return service.findAll(); }
}
