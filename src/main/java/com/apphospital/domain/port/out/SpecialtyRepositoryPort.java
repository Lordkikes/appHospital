package com.apphospital.domain.port.out;

import com.apphospital.domain.model.Specialty;

import java.util.List;

public interface SpecialtyRepositoryPort {
    Specialty save(Specialty specialty);
    List<Specialty> findAll();
}
