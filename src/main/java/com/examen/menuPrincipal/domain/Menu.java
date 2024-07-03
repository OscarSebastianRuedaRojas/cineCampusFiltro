package com.examen.menuPrincipal.domain;

import com.examen.Actor.infrastructure.in.ActorAdapter;
import com.examen.Formato.infrastructure.in.FormatoAdapter;
import com.examen.Genero.infrastructure.in.GeneroAdapter;
import com.examen.Pais.infrastructure.in.PaisAdapter;
import com.examen.Pelicula.infrastructure.in.PeliculaAdapter;
import com.examen.TipoACtor.infrastructure.in.TipoActorAdapter;

public class Menu {
    
    ActorAdapter actorAdapter;
    PeliculaAdapter peliculaAdapter;
    FormatoAdapter formatoAdapter;

    GeneroAdapter generoAdapter;
    PaisAdapter paisAdapter;
    TipoActorAdapter tipoActorAdapter;



    public Menu() {
        this.actorAdapter = new ActorAdapter();
        this.peliculaAdapter = new PeliculaAdapter();
        this.formatoAdapter = new FormatoAdapter();
        this.generoAdapter = new GeneroAdapter();
        this.paisAdapter = new PaisAdapter();
        this.tipoActorAdapter = new TipoActorAdapter();
    }

    public ActorAdapter getActorAdapter() {
        return actorAdapter;
    }

    public void setActorAdapter(ActorAdapter actorAdapter) {
        this.actorAdapter = actorAdapter;
    }

    public PeliculaAdapter getPeliculaAdapter() {
        return peliculaAdapter;
    }

    public void setPeliculaAdapter(PeliculaAdapter peliculaAdapter) {
        this.peliculaAdapter = peliculaAdapter;
    }

    public FormatoAdapter getFormatoAdapter() {
        return formatoAdapter;
    }

    public void setFormatoAdapter(FormatoAdapter formatoAdapter) {
        this.formatoAdapter = formatoAdapter;
    }

    public GeneroAdapter getGeneroAdapter() {
        return generoAdapter;
    }

    public void setGeneroAdapter(GeneroAdapter generoAdapter) {
        this.generoAdapter = generoAdapter;
    }

    public PaisAdapter getPaisAdapter() {
        return paisAdapter;
    }

    public void setPaisAdapter(PaisAdapter paisAdapter) {
        this.paisAdapter = paisAdapter;
    }

    public TipoActorAdapter getTipoActorAdapter() {
        return tipoActorAdapter;
    }

    public void setTipoActorAdapter(TipoActorAdapter tipoActorAdapter) {
        this.tipoActorAdapter = tipoActorAdapter;
    }

}
