package com.apphospital.domain.port.out;

import com.apphospital.domain.model.Shift;

public interface ShiftEventPublisherPort {
    void publishCreatedEvent(Shift shift);
}
