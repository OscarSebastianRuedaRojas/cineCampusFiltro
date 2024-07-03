package com.examen.TipoACtor.application.service;

import java.util.ArrayList;

import com.examen.TipoACtor.application.in.ITipoActorService;
import com.examen.TipoACtor.domain.models.TipoActor;
import com.examen.TipoACtor.infrastructure.out.TipoActorMySQL;

/**
 * TipoActorService
 */
public class TipoActorService implements ITipoActorService{

    private final TipoActorMySQL tipoActorMySQL;

    

    public TipoActorService() {
        this.tipoActorMySQL = new TipoActorMySQL();
    }

    @Override
    public TipoActor save(TipoActor tipoActor) {
        try {
            TipoActor newtipoActor = tipoActorMySQL.save(tipoActor);
            if (newtipoActor!= null) {
                System.out.println("El tipo de actor fue agregado con exito");
                return newtipoActor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            tipoActorMySQL.delete(id);
            System.out.println("El tipo de actor fue eliminado con exito");
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el tipoActor");
        }
    }

    @Override
    public TipoActor update(Long id, TipoActor tipoActor) {
        try {
            TipoActor newtipoActor = tipoActorMySQL.update(id, tipoActor);
            System.out.println("El tipo de actor fue actualizado con exito");
            return  newtipoActor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<TipoActor> list() {
        try {
            ArrayList<TipoActor> tipoActors = tipoActorMySQL.list();
            return tipoActors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TipoActor FindById(Long id) {
        try {
            TipoActor newtipoActor = tipoActorMySQL.FindById(id);
            return newtipoActor;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}