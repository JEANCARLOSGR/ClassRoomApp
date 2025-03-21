package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoAsistencia;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table
public class Asistencia {
    @Column (name = "id_asistencia")
    private  Integer id;

    @Column (name = "asistencia",unique = true)
    private String asistencia;

    @Column (name = "fecha",unique = true)
    private String fecha;
    @Column (name = "estado", unique = true)
    private String estado;

    private TipoAsistencia tipoAsistencia;
    @ManyToOne
    @JoinColumn(name = "fk_curso",referencedColumnName = "id")
    @JoinColumn(name = "fk_estudiante",referencedColumnName = "id")
        @JsonBackReference
    Estudiante estudiante;
    Curso curso;

    public Asistencia(){

    }

    public Asistencia(Integer id, String asistencia, String fecha, String estado, TipoAsistencia tipoAsistencia) {
        this.id = id;
        this.asistencia = asistencia;
        this.fecha = fecha;
        this.estado = estado;
        this.tipoAsistencia = tipoAsistencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoAsistencia getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(TipoAsistencia tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }
}
