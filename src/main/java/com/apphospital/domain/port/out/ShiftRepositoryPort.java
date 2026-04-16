package com.apphospital.domain.port.out;

import com.apphospital.domain.model.Shift;

import java.util.List;

public interface ShiftRepositoryPort {
    Shift save(Shift shift);
    List<Shift> findAll();
}
