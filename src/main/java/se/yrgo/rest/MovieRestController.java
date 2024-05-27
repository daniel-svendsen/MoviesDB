package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.yrgo.domain.Movie;
import se.yrgo.rest.MovieList;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieRestController {

    private final MovieList movieList;

    @Autowired
    public MovieRestController(MovieList movieList) {
        this.movieList = movieList;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> allMovies = movieList.getAllMovies();
        return ResponseEntity.ok(allMovies);
    }

    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody Movie movie) {
        if (movie.getTitle() == null || movie.getTitle().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Title is required");
        }
        movieList.saveMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }
}
