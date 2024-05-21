package se.yrgo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "movie_director_actor")
public class MovieDirectorActor {

    @EmbeddedId
    private MovieDirectorActorId id;

    @ManyToOne
    @MapsId("movieId")
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @MapsId("directorId")
    @JoinColumn(name = "director_id")
    private Director director;

    @ManyToOne
    @MapsId("actorId")
    @JoinColumn(name = "actor_id")
    private Actor actor;

    // Constructors, getters, and setters
    public MovieDirectorActor() {}

    public MovieDirectorActor(Movie movie, Director director, Actor actor) {
        this.id = new MovieDirectorActorId(movie.getId(), director.getId(), actor.getId());
        this.movie = movie;
        this.director = director;
        this.actor = actor;
    }

    public MovieDirectorActorId getId() {
        return id;
    }

    public void setId(MovieDirectorActorId id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
