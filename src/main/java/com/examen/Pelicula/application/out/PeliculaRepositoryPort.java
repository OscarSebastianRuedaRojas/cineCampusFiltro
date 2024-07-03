package com.examen.Pelicula.application.out;

import java.util.ArrayList;

import com.examen.Pelicula.domain.models.Pelicula;

public interface PeliculaRepositoryPort {
    Pelicula save(Pelicula pelicula);
    void delete(Long id);
    Pelicula update(Long id, Pelicula pelicula);
    ArrayList<Pelicula> list();
    Pelicula FindById(Long id);
}
