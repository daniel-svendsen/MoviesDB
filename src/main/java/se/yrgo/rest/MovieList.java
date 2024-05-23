package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.yrgo.data.MovieRepository;
import se.yrgo.domain.Movie;

import java.util.List;

@Service
public class MovieList {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        System.out.println("Fetched movies: " + movies.size());
        return movies;
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public Movie saveMovie(Movie movie) {
        System.out.println("Saving movie: " + movie.getTitle());
        return movieRepository.save(movie);
    }

    public Movie updateMovie(Long id, Movie movie) {
        if (!movieRepository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        movie.setId(id);
        System.out.println("Updating movie with id: " + id);
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new RuntimeException("Movie not found");
        }
        System.out.println("Deleting movie with id: " + id);
        movieRepository.deleteById(id);
    }
}
