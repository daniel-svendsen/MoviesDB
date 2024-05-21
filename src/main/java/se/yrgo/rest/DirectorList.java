package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.yrgo.data.DirectorRepository;
import se.yrgo.domain.Director;

import java.util.List;

@Service
public class DirectorList {
    @Autowired
    private DirectorRepository directorRepository;
    private List<Director> directorRepositoryList;

    public DirectorList() {}

    public DirectorList(List<Director> directors) {
        this.directorRepositoryList = directors;
    }

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director saveDirector(Director director) {
        return directorRepository.save(director);
    }
}
