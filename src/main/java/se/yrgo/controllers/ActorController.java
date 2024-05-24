package se.yrgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import se.yrgo.data.ActorRepository;
import se.yrgo.domain.Actor;

import java.util.List;
import java.util.Optional;

/***
 * MVC Controller for Actor stuff
 */

@Controller
@RequestMapping("/website/actors")
public class ActorController {
    @Autowired
    private ActorRepository data;

    // MVC:s
    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView getAllActors() {
        List<Actor> allActors = data.findAll();
        System.out.println("Fetched actors: " + allActors.size());
        return new ModelAndView("allActors", "actors", allActors);
    }

    @GetMapping("/addActor.html")
    public ModelAndView showAddActorForm() {
        return new ModelAndView("addActor");
    }

    @RequestMapping(value = "/addActor.html", method = RequestMethod.POST)
    public ModelAndView addNewActor(@RequestParam("name") String name, @RequestParam Optional<Integer> age) {
        Actor newActor = new Actor(name);
        age.ifPresent(newActor::setAge);
        data.save(newActor);
        return new ModelAndView("redirect:/website/actors/list.html"); // Redirect to list all actors
    }
}