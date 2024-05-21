package se.yrgo.domain;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "actor")
    private Set<MovieDirectorActor> movieDirectorActors;

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
}
