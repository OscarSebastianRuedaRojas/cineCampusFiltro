package com.examen.TipoACtor.domain.models;

/**
 * TipoACtor
 */
public class TipoActor {

    private Long id;
    private String descripcion;
    
    public TipoActor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}