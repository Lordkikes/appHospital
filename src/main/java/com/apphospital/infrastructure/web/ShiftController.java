package com.apphospital.infrastructure.web;

import com.apphospital.application.ShiftService;
import com.apphospital.domain.model.Shift;
import com.apphospital.infrastructure.web.dto.CreateShiftRequest;
import com.apphospital.infrastructure.web.mapper.WebMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shifts")
public class ShiftController {

    private final ShiftService shiftService;
    private final WebMapper webMapper;

    public ShiftController(ShiftService shiftService, WebMapper webMapper) {
        this.shiftService = shiftService;
        this.webMapper = webMapper;
    }

    @PostMapping
    public Shift create(@RequestBody @Valid CreateShiftRequest request) {
        return shiftService.create(webMapper.toDomain(request));
    }

    @GetMapping
    public List<Shift> findAll() {
        return shiftService.findAll();
    }
}
