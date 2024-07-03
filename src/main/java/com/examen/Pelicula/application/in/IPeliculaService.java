package com.examen.Pelicula.application.in;

import java.util.ArrayList;

import com.examen.Pelicula.domain.models.Pelicula;

public interface IPeliculaService {
    Pelicula save(Pelicula pelicula);
    void delete(Long id);
    Pelicula update(Long id, Pelicula pelicula);
    ArrayList<Pelicula> list();
    Pelicula FindById(Long id);
}
