package com.mycompany.laboratorio1;

public class CursoEspecialidad {
    private Curso curso;
    private Especialidad especialidad;

    public CursoEspecialidad(Curso curso, Especialidad especialidad) {
        this.curso = curso;
        this.especialidad = especialidad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
