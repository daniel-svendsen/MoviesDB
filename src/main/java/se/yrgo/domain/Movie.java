package se.yrgo.domain;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @OneToMany(mappedBy = "movie")
    private Set<MovieDirectorActor> movieDirectorActors;

    // No-argument constructor
    public Movie() {
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<MovieDirectorActor> getMovieDirectorActors() {
        return movieDirectorActors;
    }

    public void setMovieDirectorActors(Set<MovieDirectorActor> movieDirectorActors) {
        this.movieDirectorActors = movieDirectorActors;
    }
}
