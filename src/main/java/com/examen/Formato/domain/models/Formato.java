package com.examen.Formato.domain.models;

/**
 * Formato
 */
public class Formato {

    private Long id;
    private String descripcion;
    
    public Formato() {
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