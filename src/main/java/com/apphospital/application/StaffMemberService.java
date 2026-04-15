package com.apphospital.application;

import com.apphospital.domain.model.StaffMember;
import com.apphospital.domain.port.out.StaffMemberRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StaffMemberService {

    private final StaffMemberRepositoryPort staffMemberRepositoryPort;

    public StaffMemberService(StaffMemberRepositoryPort staffMemberRepositoryPort) {
        this.staffMemberRepositoryPort = staffMemberRepositoryPort;
    }

    public StaffMember create(StaffMember staffMember) {
        StaffMember toPersist = new StaffMember(
                UUID.randomUUID(),
                staffMember.userId(),
                staffMember.type(),
                staffMember.specialtyId(),
                staffMember.licenseNumber());
        return staffMemberRepositoryPort.save(toPersist);
    }

    public List<StaffMember> findAll() {
        return staffMemberRepositoryPort.findAll();
    }
}
