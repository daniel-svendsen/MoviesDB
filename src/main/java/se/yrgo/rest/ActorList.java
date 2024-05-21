package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.yrgo.data.ActorRepository;
import se.yrgo.domain.Actor;

import java.util.List;

@Service
public class ActorList {
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public Actor saveActor(Actor actor) {
        return actorRepository.save(actor);
    }
}