package com.examen.Pais.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import com.examen.Pais.application.service.PaisService;
import com.examen.Pais.domain.models.Pais;

/**
 * PaisAdapter
 */
public class PaisAdapter {

    PaisService paisService;
    Scanner input;

    public PaisAdapter() {
        this.paisService = new PaisService();
        this.input = new Scanner(System.in);
    }

    public Long list(){
        try {
            ArrayList<Pais> paiss = paisService.list();
            System.out.println("Selecciona el pais: ");
            for (Pais pais : paiss) {
                System.out.println(String.format("%d. %s", pais.getId(), pais.getDescripcion()));
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
            Pais pais = new Pais();
            System.out.println("Ingresa la descripcion del pais ");
            pais.setDescripcion(input.nextLine());
            paisService.save(pais);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el pais que deseas eliminar");
            Long id = this.list();
            paisService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el pais que deseas cambiar");
            Long id = this.list();
            Pais pais = new Pais();
            System.out.println("Ingresa la descripcion del pais ");
            pais.setDescripcion(input.nextLine());
            paisService.update(id, pais);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void menu(){
        int opmenu;
        System.out.println("MENU PAIS");
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