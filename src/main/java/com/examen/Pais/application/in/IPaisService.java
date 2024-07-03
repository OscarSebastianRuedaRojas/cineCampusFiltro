package com.examen.Pais.application.in;

import java.util.ArrayList;

import com.examen.Pais.domain.models.Pais;

public interface IPaisService {
    Pais save(Pais Pais);
    void delete(Long id);
    Pais update(Long id, Pais pais);
    ArrayList<Pais> list();
    Pais FindById(Long id);
}
