package com.apphospital.usuarios;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface UserMapper { UserEntity toEntity(User user); User toDomain(UserEntity entity); }
