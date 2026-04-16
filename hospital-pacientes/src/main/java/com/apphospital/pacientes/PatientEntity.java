package com.apphospital.pacientes;
import com.apphospital.shared.EpsType; import jakarta.persistence.*; import java.time.LocalDate; import java.util.UUID;
@Entity @Table(name="patients") public class PatientEntity { @Id public UUID id; @Column(nullable=false,unique=true) public String documentNumber; @Column(nullable=false) public String firstName; @Column(nullable=false) public String lastName; @Column(nullable=false) public LocalDate birthDate; @Enumerated(EnumType.STRING) @Column(nullable=false) public EpsType epsType; @Column(nullable=false) public String epsName; }
