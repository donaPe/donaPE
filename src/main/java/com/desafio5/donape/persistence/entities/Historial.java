package com.desafio5.donape.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "equipo1",name = "historial_donacion" )
public class Historial {
    @Id
    private Integer id;
    private String dni;
    @Column (name = "nombre_lugar_donacion")
    private String lugarDonacion;
    private String fecha;
    private Integer id_donante;

    public Historial() {
    }

    public Historial(Integer id, String dni, String lugarDonacion, String fecha, Integer id_donante) {
        this.id = id;
        this.dni = dni;
        this.lugarDonacion = lugarDonacion;
        this.fecha = fecha;
        this.id_donante = id_donante;
    }
    @Override
    public String toString() {
        return "Historial{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", lugarDonacion='" + lugarDonacion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", id_donante='" + id_donante + '\'' +
                '}';
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLugarDonacion() {
        return lugarDonacion;
    }

    public void setLugarDonacion(String lugarDonacion) {
        this.lugarDonacion = lugarDonacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Integer getId_donante() {
        return id_donante;
    }

    public void setId_donante(Integer id_donante) {
        this.id_donante = id_donante;
    }
}
