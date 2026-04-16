package com.apphospital.doctores;
import org.springframework.web.bind.annotation.*;import java.util.*;
record CreateDoctorRequest(UUID userId, UUID specialtyId, String licenseNumber){}
@RestController @RequestMapping("/api/doctores")
public class DoctorController { private final DoctorRepository repo; public DoctorController(DoctorRepository repo){this.repo=repo;} @PostMapping public DoctorEntity create(@RequestBody CreateDoctorRequest r){ DoctorEntity e=new DoctorEntity(); e.id=UUID.randomUUID(); e.userId=r.userId(); e.specialtyId=r.specialtyId(); e.licenseNumber=r.licenseNumber(); return repo.save(e);} @GetMapping public List<DoctorEntity> list(){return repo.findAll();}}
