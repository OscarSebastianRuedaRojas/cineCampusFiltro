package com.examen.Pais.application.out;

import java.util.ArrayList;

import com.examen.Pais.domain.models.Pais;


public interface PaisRepositoryPort {
    Pais save(Pais Pais);
    void delete(Long id);
    Pais update(Long id, Pais pais);
    ArrayList<Pais> list();
    Pais FindById(Long id);
}
