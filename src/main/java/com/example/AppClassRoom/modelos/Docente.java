package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoDocente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Docente")
    private Integer id;
    @Column(name = "especialidad",unique = true)
    private  String  especialidad;

    @Column (name = "tipoDocente")
    private TipoDocente tipoDocente;

    @OneToMany(mappedBy = "docente")
    @JsonManagedReference
    private List<Curso> cursos;
    public Docente() {
    }

    public Docente(Integer id, String especialidad, TipoDocente tipoDocente) {
        this.id = id;
        this.especialidad = especialidad;
        this.tipoDocente = tipoDocente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public TipoDocente getTipoDocente() {
        return tipoDocente;
    }

    public void setTipoDocente(TipoDocente tipoDocente) {
        this.tipoDocente = tipoDocente;
    }
}
