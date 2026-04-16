package com.apphospital.especialidad;
import jakarta.persistence.*;import java.util.UUID;
@Entity @Table(name="specialties") public class SpecialtyEntity { @Id public UUID id; @Column(nullable=false, unique=true) public String name; public String description; }
