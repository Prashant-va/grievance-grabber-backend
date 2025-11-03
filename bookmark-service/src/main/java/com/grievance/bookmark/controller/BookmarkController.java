package com.grievance.bookmark.controller;

import com.grievance.bookmark.model.Bookmark;
import com.grievance.bookmark.repo.BookmarkRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {
    private final BookmarkRepository repo;
    public BookmarkController(BookmarkRepository repo){this.repo=repo;}

    @PostMapping
    public Bookmark create(@RequestBody Bookmark b){return repo.save(b);}

    @GetMapping("/user/{userId}")
    public List<Bookmark> forUser(@PathVariable Long userId){return repo.findByUserId(userId);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if(!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
