package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.yrgo.data.MovieRepository;
import se.yrgo.domain.Movie;

import java.util.List;

@Service
public class MovieList {
    private static final Logger logger = LoggerFactory.getLogger(MovieList.class);

    private final MovieRepository movieRepository;

    @Autowired
    public MovieList(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        logger.info("Fetched movies: {}", movies.size());
        return movies;
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public Movie saveMovie(Movie movie) {
        logger.info("Saving movie: {}", movie.getTitle());
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie movie) {
        if (!movieRepository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        movie.setId(id);
        logger.info("Updating movie with id: {}", id);
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        logger.info("Deleting movie with id: {}", id);
        movieRepository.deleteById(id);
    }
}
