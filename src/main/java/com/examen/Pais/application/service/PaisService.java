package com.examen.Pais.application.service;

import java.util.ArrayList;

import com.examen.Pais.application.in.IPaisService;
import com.examen.Pais.domain.models.Pais;
import com.examen.Pais.infrastructure.out.PaisMySQL;

/**
 * PaisService
 */
public class PaisService implements IPaisService{

    private final PaisMySQL paisMySQL;

    

    public PaisService() {
        this.paisMySQL = new PaisMySQL();
    }

    @Override
    public Pais save(Pais pais) {
        try {
            Pais newpais = paisMySQL.save(pais);
            if (newpais!= null) {
                return newpais;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            paisMySQL.delete(id);
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el pais");
        }
    }

    @Override
    public Pais update(Long id, Pais pais) {
        try {
            Pais newpais = paisMySQL.update(id, pais);
            return  newpais;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public ArrayList<Pais> list() {
        try {
            ArrayList<Pais> paises = paisMySQL.list();
            return paises;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Pais FindById(Long id) {
        try {
            Pais newPais = paisMySQL.FindById(id);
            return newPais;
        } catch (Exception e) {
        }
        return null;
    }
}