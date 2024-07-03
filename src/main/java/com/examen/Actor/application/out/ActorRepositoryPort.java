package com.examen.Actor.application.out;

import java.util.ArrayList;

import com.examen.Actor.domain.models.Actor;

public interface ActorRepositoryPort {
    Actor save(Actor actor);
    void delete(Long id);
    Actor update(Long id, Actor actor);
    ArrayList<Actor> list();
    Actor FindById(Long id);
}
