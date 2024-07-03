package com.examen.Genero.application.service;

import java.util.ArrayList;

import com.examen.Genero.application.in.IGeneroService;
import com.examen.Genero.domain.models.Genero;
import com.examen.Genero.infrastructure.out.GeneroMySQL;

/**
 * GeneroService
 */
public class GeneroService implements IGeneroService{

    private final GeneroMySQL generoMySQL;

    

    public GeneroService() {
        this.generoMySQL = new GeneroMySQL();
    }

    @Override
    public Genero save(Genero genero) {
        try {
            Genero newgenero = generoMySQL.save(genero);
            if (newgenero!= null) {
                System.out.println("El genero fue agregado con exito");
                return newgenero;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            generoMySQL.delete(id);
            System.out.println("El genero fue eliminado con exito");
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el genero");
        }
    }

    @Override
    public Genero update(Long id, Genero genero) {
        try {
            Genero newGenero = generoMySQL.update(id, genero);
            System.out.println("El genero fue actualizado con exito");
            return  newGenero;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Genero> list() {
        try {
            ArrayList<Genero> generos = generoMySQL.list();
            return generos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Genero FindById(Long id) {
        try {
            Genero newGenero = generoMySQL.FindById(id);
            return newGenero;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    
}