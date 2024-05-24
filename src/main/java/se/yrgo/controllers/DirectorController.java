package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import se.yrgo.domain.Director;
import se.yrgo.rest.DirectorList;

import java.util.List;

@RestController
@RequestMapping("/website/directors")
public class DirectorController {
    @Autowired
    private DirectorList directorList;

    @RequestMapping(value = "/newDirector.html", method = RequestMethod.GET)
    public ModelAndView renderNewDirectorForm() {
        Director newDirector = new Director();
        return new ModelAndView("newDirector", "form", newDirector);
    }

    @RequestMapping(value = "/newDirector.html", method = RequestMethod.POST)
    public String createDirector(Director director) {
        directorList.saveDirector(director);
        return "redirect:/website/directors/list.html";
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView getAllDirectors() {
        List<Director> allDirectors = directorList.getAllDirectors();
        System.out.println("Fetched directors: " + allDirectors.size());
        return new ModelAndView("allDirectors", "directors", allDirectors);
    }

    @RequestMapping(value = "/director/{id}", method = RequestMethod.GET)
    public ModelAndView getDirectorById (@PathVariable Long id) {
        Director director = directorList.getDirectorById(id);
        return new ModelAndView("directorInfo", "director", director);
    }

    @RequestMapping(value = "/updateDirector/{id}", method = RequestMethod.GET)
    public ModelAndView renderUpdateDirectorForm (@PathVariable Long id) {
        Director director = directorList.getDirectorById(id);
        return new ModelAndView("updateDirector", "form", director);
    }

    @RequestMapping(value = "/updateDirector/{id}", method = RequestMethod.POST)
    public String updateDirector(@PathVariable Long id, Director director) {
        directorList.updateDirector(id, director);
        return "redirect:/website/directors/list.html";
    }

    @RequestMapping(value = "/deleteDirector/{id}", method = RequestMethod.GET)
    public String deleteDirector(@PathVariable Long id) {
        directorList.deleteDirector(id);
        return "redirect:/website/directors/list.html";
    }
}

