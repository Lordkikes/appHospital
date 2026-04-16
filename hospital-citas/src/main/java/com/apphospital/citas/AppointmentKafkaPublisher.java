package com.apphospital.citas;
import org.springframework.kafka.core.KafkaTemplate; import org.springframework.stereotype.Component;
@Component
public class AppointmentKafkaPublisher { private final KafkaTemplate<String, AppointmentEntity> template; public AppointmentKafkaPublisher(KafkaTemplate<String, AppointmentEntity> template){this.template=template;} public void publishCreated(AppointmentEntity appointment){template.send("hospital.shift.created", appointment.id.toString(), appointment);} }
