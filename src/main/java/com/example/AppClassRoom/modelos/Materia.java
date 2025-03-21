package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoMateria;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")

    private Integer id;

    @Column(name = "materia")
    private String materia ;

    @Column(name = "nombre_materia",nullable = false,length =100 )
    private String nombre ;

    private TipoMateria tipoMateria ;

    @ManyToOne
        @JoinColumn(name = "fk_curso",referencedColumnName = "id")
    @JsonBackReference
    Curso curso;
    private List<Calificacion>calificacions;

    public Materia() {
    }

    public Materia(Integer id, String materia, String nombre, TipoMateria tipoMateria) {
        this.id = id;
        this.materia = materia;
        this.nombre = nombre;
        this.tipoMateria = tipoMateria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMateria getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(TipoMateria tipoMateria) {
        this.tipoMateria = tipoMateria;
    }
}
