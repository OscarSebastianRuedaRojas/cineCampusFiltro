package com.examen.Pelicula.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import com.examen.Pelicula.application.service.PeliculaService;
import com.examen.Pelicula.domain.models.Pelicula;

/**
 * PeliculaAdapter
 */
public class PeliculaAdapter {

    PeliculaService peliculaService;
    Scanner input;

    public PeliculaAdapter() {
        this.peliculaService = new PeliculaService();
        this.input = new Scanner(System.in);
    }

    public Long list(){
        try {
            ArrayList<Pelicula> peliculas = peliculaService.list();
            System.out.println("Selecciona el pelicula: ");
            for (Pelicula pelicula : peliculas) {
                System.out.println(String.format("%d. %s", pelicula.getId(), pelicula.getNombre()));
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
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingresa el codigo interno de la pelicula");
            pelicula.setCodinterno((input.nextLine()));
            System.out.println("Ingresa el nombre de la pelicula");
            pelicula.setNombre(input.nextLine());
            System.out.println("Ingresa la duracion de la pelicula");
            pelicula.setDuracion(input.nextLine());
            System.out.println("Ingresa la sinopsis de la pelicula");
            pelicula.setSinopsis(input.nextLine());
            peliculaService.save(pelicula);
        } catch (Exception e) {
        }
    }

    public void delete(){
        try {
            System.out.println("Ingresa el pelicula que deseas eliminar");
            Long id = this.list();
            peliculaService.delete(id);
        } catch (Exception e) {
        }
    }

    public void update(){
        try {
            System.out.println("Ingresa el pelicula que deseas cambiar");
            Long id = this.list();
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingresa el codigo interno de la pelicula");
            pelicula.setCodinterno((input.nextLine()));
            System.out.println("Ingresa el nombre de la pelicula");
            pelicula.setNombre(input.nextLine());
            System.out.println("Ingresa la duracion de la pelicula");
            pelicula.setDuracion(input.nextLine());
            System.out.println("Ingresa la sinopsis de la pelicula");
            pelicula.setSinopsis(input.nextLine());
            peliculaService.save(pelicula);
            peliculaService.update(id, pelicula);
        } catch (Exception e) {
        }
    }
    public void menu(){
        
    }
}