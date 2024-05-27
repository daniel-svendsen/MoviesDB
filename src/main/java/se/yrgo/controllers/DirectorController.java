package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import se.yrgo.data.DirectorRepository;
import se.yrgo.domain.Director;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/website/directors")
public class DirectorController {
   /* @Autowired
    private DirectorList directorList;*/

    // I'm testing this because this is what Nahid used.
    @Autowired
    private DirectorRepository directorRepository;

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView getAllDirectors() {
        List<Director> allDirectors = directorRepository.findAll();
        System.out.println("Fetched directors: " + allDirectors.size());
        return new ModelAndView("allDirectors", "directors", allDirectors);
    }

    @GetMapping(value = "newDirector.html")
    public ModelAndView renderNewDirectorForm() {
        return new ModelAndView("newDirector");
    }

    @RequestMapping(value = "/newDirector.html", method = RequestMethod.POST)
    public ModelAndView createDirector(@RequestParam("name") String name) {
        Director newDirector = new Director(name);
        directorRepository.save(newDirector);
        return new ModelAndView("redirect:/website/directors/list.html");
    }

    /*
    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView getAllDirectors() {
        List<Director> allDirectors = directorList.getAllDirectors();
        System.out.println("Fetched directors: " + allDirectors.size());
        return new ModelAndView("allDirectors", "directors", allDirectors);
    }
    */

/*    @RequestMapping(value = "/newDirector.html", method = RequestMethod.POST)
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
    }*/

    @RequestMapping(value = "/director/{name}")
    public ModelAndView showDirectorByName(@PathVariable("name") String name) {
        Director director = directorRepository.findByName(name);
        return new ModelAndView("directorInfo", "director", director);
    }
}

