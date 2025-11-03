package com.grievance.user.controller;

import com.grievance.user.model.User;
import com.grievance.user.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;
    public UserController(UserRepository repo){this.repo = repo;}

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User u){
        // NOTE: For demo only - no password hashing. Do NOT use in production.
        User saved = repo.save(u);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<User> all(){ return repo.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<User> get(@PathVariable Long id){
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
