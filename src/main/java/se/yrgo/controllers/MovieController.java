package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.yrgo.domain.Movie;
import se.yrgo.rest.MovieList;

import java.util.List;

@Controller
@RequestMapping("/website/movies")
public class MovieController {
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    private final MovieList movieList;

    @Autowired
    public MovieController(MovieList movieList) {
        this.movieList = movieList;
    }

    @RequestMapping(value = "/newMovie.html", method = RequestMethod.GET)
    public ModelAndView renderNewMovieForm() {
        Movie newMovie = new Movie();
        return new ModelAndView("newMovie", "form", newMovie);
    }

    @RequestMapping(value = "/newMovie.html", method = RequestMethod.POST)
    public String createMovie(Movie movie) {
        movieList.saveMovie(movie);
        return "redirect:/website/movies/list.html";
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView getAllMovies() {
        List<Movie> allMovies = movieList.getAllMovies();
        logger.info("Fetched movies: {}", allMovies.size());
        return new ModelAndView("allMovies", "movies", allMovies);
    }

    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public ModelAndView getMovieById(@PathVariable Long id) {
        Movie movie = movieList.getMovieById(id);
        return new ModelAndView("movieInfo", "movie", movie);
    }

    @RequestMapping(value = "/updateMovie/{id}", method = RequestMethod.GET)
    public ModelAndView renderUpdateMovieForm(@PathVariable Long id) {
        Movie movie = movieList.getMovieById(id);
        return new ModelAndView("updateMovie", "form", movie);
    }

    @RequestMapping(value = "/updateMovie/{id}", method = RequestMethod.POST)
    public String updateMovie(@PathVariable Long id, Movie movie) {
        movieList.updateMovie(id, movie);
        return "redirect:/website/movies/list.html";
    }

    @RequestMapping(value = "/deleteMovie/{id}", method = RequestMethod.GET)
    public String deleteMovie(@PathVariable Long id) {
        movieList.deleteMovie(id);
        return "redirect:/website/movies/list.html";
    }
}
