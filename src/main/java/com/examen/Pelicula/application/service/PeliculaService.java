package com.examen.Pelicula.application.service;

import java.util.ArrayList;

import com.examen.Pelicula.application.in.IPeliculaService;
import com.examen.Pelicula.domain.models.Pelicula;
import com.examen.Pelicula.infrastructure.out.PeliculaMySQL;

/**
 * PeliculaService
 */
public class PeliculaService implements IPeliculaService{

    private final PeliculaMySQL peliculaMySQL;

    

    public PeliculaService() {
        this.peliculaMySQL = new PeliculaMySQL();
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        try {
            Pelicula newpelicula = peliculaMySQL.save(pelicula);
            if (newpelicula!= null) {
                System.out.println("La pelicula fue agregado con exito");
                return newpelicula;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            peliculaMySQL.delete(id);
            System.out.println("La pelicula fue eliminada con exito");
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el pelicula");
        }
    }

    @Override
    public Pelicula update(Long id, Pelicula pelicula) {
        try {
            Pelicula newpelicula = peliculaMySQL.update(id, pelicula);
            System.out.println("La pelicula fue actualizada con exito");
            return  newpelicula;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Pelicula> list() {
        try {
            ArrayList<Pelicula> peliculaes = peliculaMySQL.list();
            return peliculaes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Pelicula FindById(Long id) {
        try {
            Pelicula newPelicula = peliculaMySQL.FindById(id);
            return newPelicula;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}