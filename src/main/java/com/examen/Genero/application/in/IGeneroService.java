package com.examen.Genero.application.in;

import java.util.ArrayList;

import com.examen.Genero.domain.models.Genero;

public interface IGeneroService {
    Genero save(Genero genero);
    void delete(Long id);
    Genero update(Long id, Genero genero);
    ArrayList<Genero> list();
    Genero FindById(Long id);
}
