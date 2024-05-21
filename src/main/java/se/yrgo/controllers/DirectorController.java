package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import se.yrgo.domain.Director;
import se.yrgo.rest.DirectorList;

import java.util.List;

@RestController
@RequestMapping("/api/directors")
public class DirectorController {
    @Autowired
    private DirectorList directorList;

    @GetMapping
    public List<Director> getAllDirectors() {
        return directorList.getAllDirectors();
    }

    @PostMapping
    public Director createDirector(@RequestBody Director director) {
        return directorList.saveDirector(director);
    }

    @GetMapping("/{id}")
    public Director getDirectorById(@PathVariable Long id) {
        return directorList.getDirectorById(id);
    }

    @PutMapping("/{id}")
    public Director updateDirector(@PathVariable Long id, @RequestBody Director director) {
        return directorList.updateDirector(id, director);
    }

    @DeleteMapping("/{id}")
    public void deleteDirector(@PathVariable Long id) {
        directorList.deleteDirector(id);
    }

}
