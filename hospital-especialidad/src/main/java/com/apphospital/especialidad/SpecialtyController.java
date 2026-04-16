package com.apphospital.especialidad;
import org.springframework.web.bind.annotation.*;import java.util.*;
record CreateSpecialtyRequest(String name,String description){}
@RestController @RequestMapping("/api/especialidades")
public class SpecialtyController { private final SpecialtyRepository repo; public SpecialtyController(SpecialtyRepository repo){this.repo=repo;} @PostMapping public SpecialtyEntity create(@RequestBody CreateSpecialtyRequest r){ SpecialtyEntity e=new SpecialtyEntity(); e.id=UUID.randomUUID(); e.name=r.name(); e.description=r.description(); return repo.save(e);} @GetMapping public List<SpecialtyEntity> list(){return repo.findAll();}}
