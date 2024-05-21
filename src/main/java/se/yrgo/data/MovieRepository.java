package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import se.yrgo.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}