package com.mycompany.laboratorio1;

public class Alumno extends Persona{
    private String codigoAlumn;
    private int cicloRel;
    private int credPer;
    private int credLlev;
    private Especialidad especialidad;

    public Alumno(String codigoAlumn, int cicloRel, int credPer, int credLlev, Especialidad especialidad, String nombres, String apellidos, String dni) {
        super(nombres, apellidos, dni);
        this.codigoAlumn = codigoAlumn;
        this.cicloRel = cicloRel;
        this.credPer = credPer;
        this.credLlev = credLlev;
        this.especialidad = especialidad;
    }
    
    

    public String getCodigoAlumn() {
        return codigoAlumn;
    }

    public void setCodigoAlumn(String codigoAlumn) {
        this.codigoAlumn = codigoAlumn;
    }

    public int getCicloRel() {
        return cicloRel;
    }

    public void setCicloRel(int cicloRel) {
        this.cicloRel = cicloRel;
    }

    public int getCredPer() {
        return credPer;
    }

    public void setCredPer(int credPer) {
        this.credPer = credPer;
    }

    public int getCredLlev() {
        return credLlev;
    }

    public void setCredLlev(int credLlev) {
        this.credLlev = credLlev;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
