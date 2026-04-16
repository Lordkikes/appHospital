package com.apphospital.enfermeras; import jakarta.persistence.*; import java.util.UUID;
@Entity @Table(name="nurses") public class NurseEntity { @Id public UUID id; @Column(nullable=false) public UUID userId; @Column(nullable=false, unique=true) public String licenseNumber; }
