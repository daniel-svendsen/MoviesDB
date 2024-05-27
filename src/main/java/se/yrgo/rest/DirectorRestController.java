package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.data.DirectorRepository;
import se.yrgo.domain.Director;

import java.util.List;

@RestController
public class DirectorRestController {
    @Autowired
    private DirectorRepository data;

    @GetMapping(value = "/api/directors")
    public DirectorList allDirectors() {
        List<Director> all = data.findAll();
        return new DirectorList(all);
    }

    @PostMapping(value = "/api/directors")
    public ResponseEntity<?> addDirector(@RequestBody Director director) {
        if (director.getName() == null || director.getName().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name is required");
        }
        Director newDirector = data.save(director);
        return ResponseEntity.status(HttpStatus.CREATED).body(newDirector);
    }
}
