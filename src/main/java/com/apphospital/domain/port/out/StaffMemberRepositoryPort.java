package com.apphospital.domain.port.out;

import com.apphospital.domain.model.StaffMember;

import java.util.List;

public interface StaffMemberRepositoryPort {
    StaffMember save(StaffMember staffMember);
    List<StaffMember> findAll();
}
