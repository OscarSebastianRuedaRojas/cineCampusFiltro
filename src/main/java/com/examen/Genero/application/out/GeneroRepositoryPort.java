package com.examen.Genero.application.out;

import java.util.ArrayList;

import com.examen.Genero.domain.models.Genero;

public interface GeneroRepositoryPort {
    Genero save(Genero genero);
    void delete(Long id);
    Genero update(Long id, Genero genero);
    ArrayList<Genero> list();
}
