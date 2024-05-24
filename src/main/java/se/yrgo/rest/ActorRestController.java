package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.data.ActorRepository;
import se.yrgo.domain.Actor;

import java.util.List;

@RestController
public class ActorRestController {
    @Autowired
    private ActorRepository data;

    @GetMapping(value = "/api/actors")
    public ActorList allActors() {
        List<Actor> all = data.findAll();
        return new ActorList(all);
    }

    @SuppressWarnings("java:S1452")
    @PostMapping(value = "/api/actors")
    public ResponseEntity<?> addActor(@RequestBody Actor actor) {
        if (actor.getName() == null || actor.getName().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name is required");
        }
        Actor newActor = data.save(actor);
        return ResponseEntity.status(HttpStatus.CREATED).body(newActor);
    }
}