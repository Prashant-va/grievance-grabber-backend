package com.grievance.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.grievance.model.Grievance;
import com.grievance.repo.GrievanceRepository;

import java.util.List;

@RestController
@RequestMapping("/grievances")
public class GrievanceController {
    private final GrievanceRepository repo;
    public GrievanceController(GrievanceRepository repo){this.repo=repo;}

    @PostMapping
    public Grievance create(@RequestBody Grievance g){return repo.save(g);}

    @GetMapping
    public List<Grievance> all(){return repo.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Grievance> get(@PathVariable Long id){
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if(!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
