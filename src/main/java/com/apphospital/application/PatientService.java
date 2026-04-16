package com.apphospital.application;

import com.apphospital.domain.model.Patient;
import com.apphospital.domain.port.out.PatientRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientRepositoryPort patientRepositoryPort;

    public PatientService(PatientRepositoryPort patientRepositoryPort) {
        this.patientRepositoryPort = patientRepositoryPort;
    }

    public Patient create(Patient patient) {
        Patient toPersist = new Patient(
                UUID.randomUUID(),
                patient.documentNumber(),
                patient.firstName(),
                patient.lastName(),
                patient.birthDate(),
                patient.epsType(),
                patient.epsName());
        return patientRepositoryPort.save(toPersist);
    }

    public List<Patient> findAll() {
        return patientRepositoryPort.findAll();
    }
}
