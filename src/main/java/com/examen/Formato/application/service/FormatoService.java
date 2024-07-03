package com.examen.Formato.application.service;

import java.util.ArrayList;

import com.examen.Formato.application.in.IFormatoService;
import com.examen.Formato.domain.models.Formato;
import com.examen.Formato.infrastructure.out.FormatoMySQL;

/**
 * FormatoService
 */
public class FormatoService implements IFormatoService{

    private final FormatoMySQL formatoMySQL;

    

    public FormatoService() {
        this.formatoMySQL = new FormatoMySQL();
    }

    @Override
    public Formato save(Formato formato) {
        try {
            Formato newformato = formatoMySQL.save(formato);
            if (newformato!= null) {
                System.out.println("El formato fue guardado con exito");
                return newformato;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            formatoMySQL.delete(id);
            System.out.println("El formato fue eliminado con exito");
        } catch (Exception e) {
            System.out.println("Ocurrio un problema al eliminar el formato");
        }
    }

    @Override
    public Formato update(Long id, Formato formato) {
        try {
            Formato newformato = formatoMySQL.update(id, formato);
            System.out.println("El formato fue actualizado con exito");
            return  newformato;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Formato> list() {
        try {
            ArrayList<Formato> formatoes = formatoMySQL.list();
            return formatoes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Formato FindById(Long id) {
        try {
            Formato newformato = formatoMySQL.FindById(id);
            return newformato;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}