package com.apphospital.application;

import com.apphospital.domain.model.Specialty;
import com.apphospital.domain.port.out.SpecialtyRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpecialtyService {

    private final SpecialtyRepositoryPort specialtyRepositoryPort;

    public SpecialtyService(SpecialtyRepositoryPort specialtyRepositoryPort) {
        this.specialtyRepositoryPort = specialtyRepositoryPort;
    }

    public Specialty create(Specialty specialty) {
        Specialty toPersist = new Specialty(UUID.randomUUID(), specialty.name(), specialty.description());
        return specialtyRepositoryPort.save(toPersist);
    }

    public List<Specialty> findAll() {
        return specialtyRepositoryPort.findAll();
    }
}
