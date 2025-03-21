package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoCalificacion;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion")
    private  Integer id;
    @Column (name = "calificacion",unique = true)
    private String calificacion;
    @Column (name =  "nota",unique = true)
    private String nota;
    @Column (name = "fechaEvaluacion")
    private String fechaEvaluacion;

    private TipoCalificacion tipoCalificacion;
    @ManyToOne
    @JoinColumn(name = "fk_materia",referencedColumnName = "id")
    @JoinColumn(name = "fk_estudiante",referencedColumnName = "id")
        @JsonBackReference
    Estudiante estudiante;
    Materia materia;

    public Calificacion() {
    }

    public Calificacion(Integer id, String calificacion, String nota, String fechaEvaluacion, TipoCalificacion tipoCalificacion) {
        this.id = id;
        this.calificacion = calificacion;
        this.nota = nota;
        this.fechaEvaluacion = fechaEvaluacion;
        this.tipoCalificacion = tipoCalificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(String fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public TipoCalificacion getTipoCalificacion() {
        return tipoCalificacion;
    }

    public void setTipoCalificacion(TipoCalificacion tipoCalificacion) {
        this.tipoCalificacion = tipoCalificacion;
    }
}
