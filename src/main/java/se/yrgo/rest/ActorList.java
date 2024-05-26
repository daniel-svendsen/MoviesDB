package se.yrgo.rest;

import se.yrgo.domain.Actor;

import java.util.List;

public class ActorList {
    private List<Actor> actors;

    public ActorList() {
    }

    public ActorList(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public int getNumberOfActors() {
        return actors.size();
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}