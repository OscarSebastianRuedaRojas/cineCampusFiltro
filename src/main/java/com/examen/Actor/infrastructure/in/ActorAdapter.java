package com.examen.Actor.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import com.examen.Actor.application.service.ActorService;
import com.examen.Actor.domain.models.Actor;
import com.examen.Genero.infrastructure.in.GeneroAdapter;
import com.examen.Pais.infrastructure.in.PaisAdapter;

/**
 * ActorAdapter
 */
public class ActorAdapter {

    ActorService actorService;
    Scanner input;
    PaisAdapter paisAdapter;
    GeneroAdapter generoAdapter;

    public ActorAdapter() {
        this.actorService = new ActorService();
        this.input = new Scanner(System.in);
        this.paisAdapter = new PaisAdapter();
        this.generoAdapter = new GeneroAdapter();
    }

    public Long list(){
        try {
            ArrayList<Actor> actors = actorService.list();
            System.out.println("Selecciona el actor: ");
            for (Actor actor : actors) {
                System.out.println(String.format("%d. %s", actor.getId(), actor.getNombre()));
            }
            Long id = input.nextLong();
            input.nextLine();
            return  id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    public void save(){
        try {
            Actor actor = new Actor();
            System.out.println("Ingresa el nombre del actor ");
            actor.setNombre(input.nextLine());
            System.out.println("Ingresa la nacionalidad del actor");
            actor.setIdNacionalidad(paisAdapter.list());
            System.out.println("Ingresa la edad del actor");
            actor.setEdad(input.nextInt());
            input.nextLine();
            System.out.println("Ingresa el genero del actor");
            actor.setIdGenero(generoAdapter.list());
            actorService.save(actor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el actor que deseas eliminar");
            Long id = this.list();
            actorService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el actor que deseas cambiar");
            Long id = this.list();
            Actor actor = new Actor();
            System.out.println("Ingresa la descripcion del actor ");
            System.out.println("Ingresa el nombre del actor ");
            actor.setNombre(input.nextLine());
            System.out.println("Ingresa la nacionalidad del actor");
            actor.setIdNacionalidad(paisAdapter.list());
            System.out.println("Ingresa la edad del actor");
            actor.setEdad(input.nextInt());
            input.nextLine();
            System.out.println("Ingresa el genero del actor");
            actor.setIdGenero(generoAdapter.list());
            actorService.update(id, actor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void menu(){
        int opmenu;
        System.out.println("MENU actores");
        System.out.println("1. Agregar");
        System.out.println("2. Editar ");
        System.out.println("3. Buscar ");
        System.out.println("4. Eliminar ");
        System.out.println("Salir");
        System.out.println("Ingrese una opcion");

        opmenu = input.nextInt();
        input.nextLine();
        switch (opmenu) {
            case 1:
                save();
                break;
            case 2:
                update();
                break;
            case 3:
                list();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
}