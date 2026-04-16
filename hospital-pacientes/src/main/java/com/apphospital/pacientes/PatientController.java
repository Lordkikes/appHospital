package com.apphospital.pacientes;
import com.apphospital.shared.EpsType; import org.springframework.web.bind.annotation.*; import java.time.LocalDate; import java.util.*;
record CreatePatientRequest(String documentNumber,String firstName,String lastName,LocalDate birthDate,EpsType epsType,String epsName){}
@RestController @RequestMapping("/api/pacientes")
public class PatientController { private final PatientRepository repo; public PatientController(PatientRepository repo){this.repo=repo;} @PostMapping public PatientEntity create(@RequestBody CreatePatientRequest r){ PatientEntity e=new PatientEntity(); e.id=UUID.randomUUID(); e.documentNumber=r.documentNumber(); e.firstName=r.firstName(); e.lastName=r.lastName(); e.birthDate=r.birthDate(); e.epsType=r.epsType(); e.epsName=r.epsName(); return repo.save(e);} @GetMapping public List<PatientEntity> list(){return repo.findAll();}}
