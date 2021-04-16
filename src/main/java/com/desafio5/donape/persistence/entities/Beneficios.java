package com.desafio5.donape.persistence.entities;

import javax.persistence.*;

@Entity
@Table(schema = "equipo1",name = "beneficios" )
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
        return "Beneficios{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
