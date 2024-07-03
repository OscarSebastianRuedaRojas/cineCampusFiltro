package com.examen.Formato.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import com.examen.Formato.application.service.FormatoService;
import com.examen.Formato.domain.models.Formato;

/**
 * FormatoAdapter
 */
public class FormatoAdapter {

    FormatoService formatoService;
    Scanner input;

    public FormatoAdapter() {
        this.formatoService = new FormatoService();
        this.input = new Scanner(System.in);
    }

    public Long list(){
        try {
            ArrayList<Formato> formatos = formatoService.list();
            System.out.println("Selecciona el formato: ");
            for (Formato formato : formatos) {
                System.out.println(String.format("%d. %s", formato.getId(), formato.getDescripcion()));
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
            Formato formato = new Formato();
            System.out.println("Ingresa la descripcion del formato ");
            formato.setDescripcion(input.nextLine());
            formatoService.save(formato);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el formato que deseas eliminar");
            Long id = this.list();
            formatoService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el formato que deseas cambiar");
            Long id = this.list();
            Formato formato = new Formato();
            System.out.println("Ingresa la descripcion del formato ");
            formato.setDescripcion(input.nextLine());
            formatoService.update(id, formato);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void menu(){
        int opmenu;
        System.out.println("MENU formato");
        System.out.println("1. Agrefar");
        System.out.println("2. Editar ");
        System.out.println("3. Buscar ");
        System.out.println("4. Eliminar ");
        System.out.println("Salir");
        System.out.println("Ingrese una opcion");

        opmenu = input.nextInt();
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