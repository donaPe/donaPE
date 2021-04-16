package com.desafio5.donape.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Beneficios", schema = "equipo1")
public class Beneficios {
    @Id

    private Integer id;
    private String titulo;
    private String descripcion;
    private String url;

    public Beneficios() {
    }

    public Beneficios(Integer id, String titulo, String descripcion, String url) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }
    @Override
    public String toString() {
        return "Bidder{" +
                "id=" + id +
                ", name='" + titulo + '\'' +
                ", email='" + descripcion + '\'' +
                ", password='" + url + '\'' +
                '}';
    }
}
