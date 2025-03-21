package com.example.AppClassRoom.modelos;

import com.example.AppClassRoom.ayudas.TipoEstudiante;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private  Integer id;

    @Column(name = "estudiante",unique = true)
    private String estudiante;

    @Column(name = "grado",unique = true)
    private String grado;

    @Column(name = "fecha_nacimiento",unique = true)
    private String fachanacimiento;

    @Column(name = "direccion",unique = true,length =255)
    private String direccion;

    private TipoEstudiante tipoEstudiante;
    @ManyToOne
    @JoinColumn(name = "fk_usuario",referencedColumnName = "id")
    @JsonBackReference
    Usuario usuario;
    private List<Inscripcion> inscripciones;
    private  List<Asistencia>asistencias;
    private  List<Calificacion>calificacions;

    public Estudiante() {
    }

    public Estudiante(Integer id, String estudiante, String grado, String fachanacimiento, String direccion, TipoEstudiante tipoEstudiante) {
        this.id = id;
        this.estudiante = estudiante;
        this.grado = grado;
        this.fachanacimiento = fachanacimiento;
        this.direccion = direccion;
        this.tipoEstudiante = tipoEstudiante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getFachanacimiento() {
        return fachanacimiento;
    }

    public void setFachanacimiento(String fachanacimiento) {
        this.fachanacimiento = fachanacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoEstudiante getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(TipoEstudiante tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }
}
