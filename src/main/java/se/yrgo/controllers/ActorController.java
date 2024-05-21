package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import se.yrgo.domain.Actor;
import se.yrgo.rest.ActorList;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {
    @Autowired
    private ActorList actorService;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.saveActor(actor);
    }
}