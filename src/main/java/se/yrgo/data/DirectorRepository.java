package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import se.yrgo.domain.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}