package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoInscripcion;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "inscripciones")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private  Integer id;

    @Column(name = "inscripcion",unique = true)
    private  String inscripcion;

    @Column(name = "fecha_inscripcion",unique = true)
    private  String fechainscripcion;

    private TipoInscripcion tipoInscripcion;

    @ManyToOne
    @JoinColumn(name = "fk_estudiante",referencedColumnName = "id")
    @JoinColumn(name = "fk_curso",referencedColumnName = "id")
    @JsonBackReference
    Estudiante estudiante;
    Curso curso;
    public Inscripcion() {
    }

    public Inscripcion(Integer id, String inscripcion, String fechainscripcion, TipoInscripcion tipoInscripcion) {
        this.id = id;
        this.inscripcion = inscripcion;
        this.fechainscripcion = fechainscripcion;
        this.tipoInscripcion = tipoInscripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(String inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(String fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public TipoInscripcion getTipoInscripcion() {
        return tipoInscripcion;
    }

    public void setTipoInscripcion(TipoInscripcion tipoInscripcion) {
        this.tipoInscripcion = tipoInscripcion;
    }
}
