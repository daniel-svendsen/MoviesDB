package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.yrgo.data.DirectorRepository;
import se.yrgo.domain.Director;

import java.util.List;

public class DirectorList {

    private List<Director> directors;

    public DirectorList() {}

    public DirectorList(List<Director> directors) {
        this.directors = directors;
    }

    public List<Director> getAllDirectors() {
        return directors;
    }

    /*public Director getDirectorById(Long id) {
        return directorRepository.findById(id).orElseThrow(() -> new RuntimeException("Searching for Id: Director not Found!"));
    }

    public Director saveDirector(Director director) {
        System.out.println("Saving director: " + director.getName());
        return directorRepository.save(director);
    }

    public Director updateDirector(Long id, Director director) {
        if(!directorRepository.existsById(id)) {
            throw new RuntimeException("Updating Director: Director not Found!");
        }
        director.setId(id);
        System.out.println("Updating director with id: " + id);
        return directorRepository.save(director);
    }*/

 /*   public void deleteDirector(Long id) {
        if(!directorRepository.existsById(id)) {
            throw new RuntimeException("Deleting Director: Director not Found!");
        }
        System.out.println("Deleting director with id " + id);
        directorRepository.deleteById(id);
    }*/
}
