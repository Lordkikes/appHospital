package com.apphospital.doctores; import jakarta.persistence.*; import java.util.UUID;
@Entity @Table(name="doctors") public class DoctorEntity { @Id public UUID id; @Column(nullable=false) public UUID userId; @Column(nullable=false) public UUID specialtyId; @Column(nullable=false, unique=true) public String licenseNumber; }
