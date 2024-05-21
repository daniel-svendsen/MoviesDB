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

    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    public Director getDirectorById(Long id) {
        return directorRepository.findById(id).orElseThrow(() -> new RuntimeException("Searching for Id: Director not Found!"));
    }

    public Director saveDirector(Director director) {
        return directorRepository.save(director);
    }

    public Director updateDirector(Long id, Director director) {
        if(!directorRepository.existsById(id)) {
            throw new RuntimeException("Updating Director: Director not Found!");
        }
        director.setId(id);
        return directorRepository.save(director);
    }

    public void deleteDirector(Long id) {
        if(!directorRepository.existsById(id)) {
            throw new RuntimeException("Deleting Director: Director not Found!");
        }
        directorRepository.deleteById(id);
    }
}
