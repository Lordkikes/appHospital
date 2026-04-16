package com.apphospital.citas;
import com.apphospital.shared.ShiftStatus; import jakarta.persistence.*; import java.time.OffsetDateTime; import java.util.UUID;
@Entity @Table(name="appointments") public class AppointmentEntity { @Id public UUID id; @Column(nullable=false) public UUID patientId; @Column(nullable=false) public UUID doctorId; public UUID nurseId; @Column(nullable=false) public OffsetDateTime startAt; @Column(nullable=false) public OffsetDateTime endAt; @Enumerated(EnumType.STRING) @Column(nullable=false) public ShiftStatus status; public String notes; }
