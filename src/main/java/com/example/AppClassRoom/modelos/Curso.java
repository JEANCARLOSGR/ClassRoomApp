package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoCurso;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer id;
    @Column(name = "curso",unique = true)
    private  String curso ;
    @Column (name = "nombre",unique = true)
    private String nombre;

    private TipoCurso tipoCurso ;

    @ManyToOne
    @JoinColumn(name = "fk_docente",referencedColumnName = "id")
            @JsonBackReference
    Docente docente;
    private List<Curso> cursos;
    private List<Inscripcion>inscripciones;
    private  List<Asistencia>asistencias;
    private  List<Materia>materias;

    public Curso() {
    }

    public Curso(Integer id, String curso, String nombre, TipoCurso tipoCurso) {
        this.id = id;
        this.curso = curso;
        this.nombre = nombre;
        this.tipoCurso = tipoCurso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}
