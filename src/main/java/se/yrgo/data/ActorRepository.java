package se.yrgo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import se.yrgo.domain.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {
}