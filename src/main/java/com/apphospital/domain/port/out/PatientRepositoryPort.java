package com.apphospital.domain.port.out;

import com.apphospital.domain.model.Patient;

import java.util.List;

public interface PatientRepositoryPort {
    Patient save(Patient patient);
    List<Patient> findAll();
}
