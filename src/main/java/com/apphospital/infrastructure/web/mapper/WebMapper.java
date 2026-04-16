package com.apphospital.infrastructure.web.mapper;

import com.apphospital.domain.model.Patient;
import com.apphospital.domain.model.Shift;
import com.apphospital.domain.model.ShiftStatus;
import com.apphospital.domain.model.Specialty;
import com.apphospital.domain.model.StaffMember;
import com.apphospital.domain.model.User;
import com.apphospital.infrastructure.web.dto.CreatePatientRequest;
import com.apphospital.infrastructure.web.dto.CreateShiftRequest;
import com.apphospital.infrastructure.web.dto.CreateSpecialtyRequest;
import com.apphospital.infrastructure.web.dto.CreateStaffMemberRequest;
import com.apphospital.infrastructure.web.dto.CreateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WebMapper {

    User toDomain(CreateUserRequest request);
    Specialty toDomain(CreateSpecialtyRequest request);
    StaffMember toDomain(CreateStaffMemberRequest request);
    Patient toDomain(CreatePatientRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "status", expression = "java(ShiftStatus.PROGRAMADA)")
    Shift toDomain(CreateShiftRequest request);
}
