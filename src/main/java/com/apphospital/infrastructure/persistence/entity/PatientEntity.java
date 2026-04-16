package com.apphospital.infrastructure.persistence.entity;

import com.apphospital.domain.model.EpsType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "patients")
public class PatientEntity {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String documentNumber;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EpsType epsType;

    @Column(nullable = false)
    private String epsName;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public EpsType getEpsType() { return epsType; }
    public void setEpsType(EpsType epsType) { this.epsType = epsType; }
    public String getEpsName() { return epsName; }
    public void setEpsName(String epsName) { this.epsName = epsName; }
}
