package com.examen.TipoACtor.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;


import com.examen.TipoACtor.application.service.TipoActorService;
import com.examen.TipoACtor.domain.models.TipoActor;

/**
 * TipoACtorAdapter
 */
public class TipoActorAdapter {

    TipoActorService tipoActorService;
    Scanner input;

    public TipoActorAdapter() {
        this.tipoActorService = new TipoActorService();
        this.input = new Scanner(System.in);
    }

    public Long list(){
        try {
            ArrayList<TipoActor> tipoActors = tipoActorService.list();
            System.out.println("Selecciona el tipoActor: ");
            for (TipoActor tipoActor : tipoActors) {
                System.out.println(String.format("%d. %s", tipoActor.getId(), tipoActor.getDescripcion()));
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
            TipoActor tipoActor = new TipoActor();
            System.out.println("Ingresa la descripcion del tipoActor ");
            tipoActor.setDescripcion(input.nextLine());
            tipoActorService.save(tipoActor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el tipoActor que deseas eliminar");
            Long id = this.list();
            tipoActorService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el tipoActor que deseas cambiar");
            Long id = this.list();
            TipoActor tipoActor = new TipoActor();
            System.out.println("Ingresa la descripcion del tipoActor ");
            tipoActor.setDescripcion(input.nextLine());
            tipoActorService.update(id, tipoActor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void menu(){
        int opmenu;
        System.out.println("MENU tipo Actores");
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