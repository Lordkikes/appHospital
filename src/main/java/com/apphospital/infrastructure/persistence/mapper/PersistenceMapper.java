package com.apphospital.infrastructure.persistence.mapper;

import com.apphospital.domain.model.Patient;
import com.apphospital.domain.model.Shift;
import com.apphospital.domain.model.Specialty;
import com.apphospital.domain.model.StaffMember;
import com.apphospital.domain.model.User;
import com.apphospital.infrastructure.persistence.entity.PatientEntity;
import com.apphospital.infrastructure.persistence.entity.ShiftEntity;
import com.apphospital.infrastructure.persistence.entity.SpecialtyEntity;
import com.apphospital.infrastructure.persistence.entity.StaffMemberEntity;
import com.apphospital.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersistenceMapper {
    UserEntity toEntity(User user);
    User toDomain(UserEntity userEntity);

    SpecialtyEntity toEntity(Specialty specialty);
    Specialty toDomain(SpecialtyEntity specialtyEntity);

    StaffMemberEntity toEntity(StaffMember staffMember);
    StaffMember toDomain(StaffMemberEntity staffMemberEntity);

    PatientEntity toEntity(Patient patient);
    Patient toDomain(PatientEntity patientEntity);

    ShiftEntity toEntity(Shift shift);
    Shift toDomain(ShiftEntity shiftEntity);
}
