package com.examen.TipoACtor.application.out;

import java.util.ArrayList;

import com.examen.TipoACtor.domain.models.TipoActor;

public interface TipoActorRepositoryPort {
    TipoActor save(TipoActor tipoActor);
    void delete(Long id);
    TipoActor update(Long id, TipoActor tipoActor);
    ArrayList<TipoActor> list();
    TipoActor FindById(Long id);
}
