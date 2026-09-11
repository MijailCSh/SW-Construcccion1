package com.mycompany.laboratorio1;

public class Matricula {
    private Alumno alumno;
    private Curso cursos[];

    public Matricula(Alumno alumno, Curso[] cursos) {
        this.alumno = alumno;
        this.cursos = cursos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
