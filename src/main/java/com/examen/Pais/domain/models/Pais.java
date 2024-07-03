package com.examen.Pais.domain.models;

/**
 * Pais
 */
public class Pais {

    private Long id;
    private String descripcion;
    
    public Pais() {
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