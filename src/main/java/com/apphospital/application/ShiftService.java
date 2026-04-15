package com.apphospital.application;

import com.apphospital.domain.model.Shift;
import com.apphospital.domain.model.ShiftStatus;
import com.apphospital.domain.port.out.ShiftEventPublisherPort;
import com.apphospital.domain.port.out.ShiftRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ShiftService {

    private final ShiftRepositoryPort shiftRepositoryPort;
    private final ShiftEventPublisherPort shiftEventPublisherPort;

    public ShiftService(ShiftRepositoryPort shiftRepositoryPort, ShiftEventPublisherPort shiftEventPublisherPort) {
        this.shiftRepositoryPort = shiftRepositoryPort;
        this.shiftEventPublisherPort = shiftEventPublisherPort;
    }

    public Shift create(Shift shift) {
        Shift toPersist = new Shift(
                UUID.randomUUID(),
                shift.staffMemberId(),
                shift.patientId(),
                shift.startAt(),
                shift.endAt(),
                ShiftStatus.PROGRAMADA,
                shift.notes());

        Shift created = shiftRepositoryPort.save(toPersist);
        shiftEventPublisherPort.publishCreatedEvent(created);
        return created;
    }

    public List<Shift> findAll() {
        return shiftRepositoryPort.findAll();
    }
}
