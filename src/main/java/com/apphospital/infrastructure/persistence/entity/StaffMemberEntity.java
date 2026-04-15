package com.apphospital.infrastructure.persistence.entity;

import com.apphospital.domain.model.StaffType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "staff_members")
public class StaffMemberEntity {

    @Id
    private UUID id;

    @Column(nullable = false)
    private UUID userId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StaffType type;

    @Column(nullable = false)
    private UUID specialtyId;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }
    public StaffType getType() { return type; }
    public void setType(StaffType type) { this.type = type; }
    public UUID getSpecialtyId() { return specialtyId; }
    public void setSpecialtyId(UUID specialtyId) { this.specialtyId = specialtyId; }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
}
