package com.examen.Actor.application.service;

import java.util.ArrayList;

import com.examen.Actor.application.in.IActorService;
import com.examen.Actor.domain.models.Actor;
import com.examen.Actor.infrastructure.out.ActorMySQL;

/**
 * ActorService
 */
public class ActorService implements IActorService{

    private final ActorMySQL actorMySQL;

    

    public ActorService() {
        this.actorMySQL = new ActorMySQL();
    }

    @Override
    public Actor save(Actor actor) {
        try {
            Actor newactor = actorMySQL.save(actor);
            if (newactor!= null) {
                System.out.println("El actor fue guardado con exito");
                return newactor;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            actorMySQL.delete(id);
            System.out.println("El actor fue eliminado con exito");
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el actor");
        }
    }

    @Override
    public Actor update(Long id, Actor actor) {
        try {
            Actor newactor = actorMySQL.update(id, actor);
            System.out.println("El actor fue actualizado con exito");
            return  newactor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Actor> list() {
        try {
            ArrayList<Actor> actors = actorMySQL.list();
            return actors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Actor FindById(Long id) {
        try {
            Actor newactor = actorMySQL.FindById(id);
            return newactor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}