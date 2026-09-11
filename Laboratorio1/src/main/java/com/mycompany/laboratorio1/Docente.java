package com.mycompany.laboratorio1;

public class Docente extends Persona{
    private String codigoDoc;

    public Docente(String codigoDoc, String nombres, String apellidos, String dni) {
        super(nombres, apellidos, dni);
        this.codigoDoc = codigoDoc;
    }

    public String getCodigoDoc() {
        return codigoDoc;
    }

    public void setCodigoDoc(String codigoDoc) {
        this.codigoDoc = codigoDoc;
    }
}
