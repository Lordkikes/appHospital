package com.apphospital.infrastructure.web;

import com.apphospital.application.SpecialtyService;
import com.apphospital.domain.model.Specialty;
import com.apphospital.infrastructure.web.dto.CreateSpecialtyRequest;
import com.apphospital.infrastructure.web.mapper.WebMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/specialties")
public class SpecialtyController {

    private final SpecialtyService specialtyService;
    private final WebMapper webMapper;

    public SpecialtyController(SpecialtyService specialtyService, WebMapper webMapper) {
        this.specialtyService = specialtyService;
        this.webMapper = webMapper;
    }

    @PostMapping
    public Specialty create(@RequestBody @Valid CreateSpecialtyRequest request) {
        return specialtyService.create(webMapper.toDomain(request));
    }

    @GetMapping
    public List<Specialty> findAll() {
        return specialtyService.findAll();
    }
}
