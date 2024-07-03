package com.examen.Formato.application.out;

import java.util.ArrayList;

import com.examen.Formato.domain.models.Formato;

public interface FormatoRepositoryPort {
    Formato save(Formato formato);
    void delete(Long id);
    Formato update(Long id, Formato formato);
    ArrayList<Formato> list();
    Formato FindById(Long id);
}
