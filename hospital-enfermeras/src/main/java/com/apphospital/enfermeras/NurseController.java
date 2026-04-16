package com.apphospital.enfermeras;
import org.springframework.web.bind.annotation.*;import java.util.*;
record CreateNurseRequest(UUID userId, String licenseNumber){}
@RestController @RequestMapping("/api/enfermeras")
public class NurseController { private final NurseRepository repo; public NurseController(NurseRepository repo){this.repo=repo;} @PostMapping public NurseEntity create(@RequestBody CreateNurseRequest r){ NurseEntity e=new NurseEntity(); e.id=UUID.randomUUID(); e.userId=r.userId(); e.licenseNumber=r.licenseNumber(); return repo.save(e);} @GetMapping public List<NurseEntity> list(){return repo.findAll();}}
