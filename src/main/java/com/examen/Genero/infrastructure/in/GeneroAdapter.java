package com.examen.Genero.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import com.examen.Genero.application.service.GeneroService;
import com.examen.Genero.domain.models.Genero;

/**
 * GeneroAdapter
 */
public class GeneroAdapter {

    GeneroService generoService;
    Scanner input;

    public GeneroAdapter() {
        this.generoService = new GeneroService();
        this.input = new Scanner(System.in);
    }

    public Long list(){
        try {
            ArrayList<Genero> generos = generoService.list();
            System.out.println("Selecciona el genero: ");
            for (Genero genero : generos) {
                System.out.println(String.format("%d. %s", genero.getId(), genero.getDescripcion()));
            }
            Long id = input.nextLong();
            input.nextLine();
            return  id;
        } catch (Exception e) {
        }
        return  null;
    }

    public void save(){
        try {
            Genero genero = new Genero();
            System.out.println("Ingresa la descripcion del genero ");
            genero.setDescripcion(input.nextLine());
            generoService.save(genero);
        } catch (Exception e) {
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el genero que deseas eliminar");
            Long id = this.list();
            generoService.delete(id);
        } catch (Exception e) {
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el genero que deseas cambiar");
            Long id = this.list();
            Genero genero = new Genero();
            System.out.println("Ingresa la descripcion del genero ");
            genero.setDescripcion(input.nextLine());
            generoService.update(id, genero);
        } catch (Exception e) {
        }
    }
    public void menu(){
        
    }
}