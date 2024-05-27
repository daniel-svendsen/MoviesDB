package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.yrgo.data.DirectorRepository;
import se.yrgo.domain.Director;

import java.util.List;

@RestController
public class DirectorRestController {
    @Autowired
    private DirectorRepository data;

    @RequestMapping("/directors")
    public DirectorList allDirectors() {
        List<Director> all = data.findAll();
        return new DirectorList(all);
    }
}
