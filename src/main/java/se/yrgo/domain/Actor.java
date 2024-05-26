package se.yrgo.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;
    private Integer age;

    @OneToMany(mappedBy = "actor")
    private Set<MovieDirectorActor> movieDirectorActors;

    // No-argument constructor
    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<MovieDirectorActor> getMovieDirectorActors() {
        return movieDirectorActors;
    }

    public void setMovieDirectorActors(Set<MovieDirectorActor> movieDirectorActors) {
        this.movieDirectorActors = movieDirectorActors;
    }
}
