package se.yrgo.domain;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieDirectorActorId implements Serializable {

    private Long movieId;
    private Long directorId;
    private Long actorId;

    // Constructors
    public MovieDirectorActorId() {}

    public MovieDirectorActorId(Long movieId, Long directorId, Long actorId) {
        this.movieId = movieId;
        this.directorId = directorId;
        this.actorId = actorId;
    }

    // Getters and setters
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDirectorActorId that = (MovieDirectorActorId) o;
        return Objects.equals(movieId, that.movieId) &&
               Objects.equals(directorId, that.directorId) &&
               Objects.equals(actorId, that.actorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, directorId, actorId);
    }
}
