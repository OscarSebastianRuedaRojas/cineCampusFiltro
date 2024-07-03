package com.examen.TipoACtor.application.in;

import java.util.ArrayList;

import com.examen.TipoACtor.domain.models.TipoActor;

/**
 * ITipoActorService
 */
public interface ITipoActorService {

    TipoActor save(TipoActor tipoActor);
    void delete(Long id);
    TipoActor update(Long id, TipoActor tipoActor);
    ArrayList<TipoActor> list();
    TipoActor FindById(Long id);
}