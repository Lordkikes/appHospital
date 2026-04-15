package com.apphospital.infrastructure.web;

import com.apphospital.application.PatientService;
import com.apphospital.domain.model.Patient;
import com.apphospital.infrastructure.web.dto.CreatePatientRequest;
import com.apphospital.infrastructure.web.mapper.WebMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;
    private final WebMapper webMapper;

    public PatientController(PatientService patientService, WebMapper webMapper) {
        this.patientService = patientService;
        this.webMapper = webMapper;
    }

    @PostMapping
    public Patient create(@RequestBody @Valid CreatePatientRequest request) {
        return patientService.create(webMapper.toDomain(request));
    }

    @GetMapping
    public List<Patient> findAll() {
        return patientService.findAll();
    }
}
