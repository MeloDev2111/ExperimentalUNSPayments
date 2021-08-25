package com.experimentalUNS.pasarelapago.Models;
import java.util.Calendar;

import javax.persistence.*;


@Entity
public class Matricula{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false,cascade=CascadeType.ALL)
    @JoinColumn(name="id_estudiante",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name="fk_matricula_estudiante"))
    private Estudiante estudiante;

    @ManyToOne(optional = false, cascade=CascadeType.ALL)
    @JoinColumn(name="id_apoderado",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(name="fk_matricula_apoderado"))
    private Apoderado apoderado;

    @Temporal(value = TemporalType.DATE)
    @Column(updatable = false, nullable = false)
    private Calendar fechaMatricula;

    @Column(length = 12, nullable = false, unique = true)
    private String codMatricula;

    public Matricula() {
    }

    public Matricula(Estudiante estudiante, Apoderado apoderado, Calendar fechaMatricula, String codMatricula) {
        this.estudiante = estudiante;
        this.apoderado = apoderado;
        this.fechaMatricula = fechaMatricula;
        this.codMatricula = codMatricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public Calendar getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Calendar fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codMatricula == null) ? 0 : codMatricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Matricula other = (Matricula) obj;
        if (codMatricula == null) {
            if (other.codMatricula != null)
                return false;
        } else if (!codMatricula.equals(other.codMatricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Matricula [apoderado=" + apoderado + ", codMatricula=" + codMatricula + ", estudiante=" + estudiante
                + ", fechaMatricula=" + fechaMatricula + "]";
    }  

}

