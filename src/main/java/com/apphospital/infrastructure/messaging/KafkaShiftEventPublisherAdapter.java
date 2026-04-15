package com.apphospital.infrastructure.messaging;

import com.apphospital.domain.model.Shift;
import com.apphospital.domain.port.out.ShiftEventPublisherPort;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaShiftEventPublisherAdapter implements ShiftEventPublisherPort {

    private static final String TOPIC = "hospital.shift.created";

    private final KafkaTemplate<String, ShiftCreatedEvent> kafkaTemplate;

    public KafkaShiftEventPublisherAdapter(KafkaTemplate<String, ShiftCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void publishCreatedEvent(Shift shift) {
        ShiftCreatedEvent event = new ShiftCreatedEvent(
                shift.id(),
                shift.staffMemberId(),
                shift.patientId(),
                shift.startAt(),
                shift.endAt(),
                shift.status(),
                shift.notes());

        kafkaTemplate.send(TOPIC, shift.id().toString(), event);
    }
}
