package se.yrgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "director")
    private Set<MovieDirectorActor> movieDirectorActors;

    // Empty constructor
    public Director() {
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MovieDirectorActor> getMovieDirectorActors() {
        return movieDirectorActors;
    }

    public void setMovieDirectorActors(Set<MovieDirectorActor> movieDirectorActors) {
        this.movieDirectorActors = movieDirectorActors;
    }

    @Override
    public String toString() {
        return "Our director, " + this.name + ".";
    }
}