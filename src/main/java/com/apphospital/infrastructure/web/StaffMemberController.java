package com.apphospital.infrastructure.web;

import com.apphospital.application.StaffMemberService;
import com.apphospital.domain.model.StaffMember;
import com.apphospital.infrastructure.web.dto.CreateStaffMemberRequest;
import com.apphospital.infrastructure.web.mapper.WebMapper;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffMemberController {

    private final StaffMemberService staffMemberService;
    private final WebMapper webMapper;

    public StaffMemberController(StaffMemberService staffMemberService, WebMapper webMapper) {
        this.staffMemberService = staffMemberService;
        this.webMapper = webMapper;
    }

    @PostMapping
    public StaffMember create(@RequestBody @Valid CreateStaffMemberRequest request) {
        return staffMemberService.create(webMapper.toDomain(request));
    }

    @GetMapping
    public List<StaffMember> findAll() {
        return staffMemberService.findAll();
    }
}
