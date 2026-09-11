package com.mycompany.laboratorio1;

public class CursoDoc {
    private Docente docente;
    private Curso curso;
    private int vacantes;

    public CursoDoc(Docente docente, Curso curso, int vacantes) {
        this.docente = docente;
        this.curso = curso;
        this.vacantes = vacantes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }
}
