package com.mycompany.pregunta2;

public class Pregunta2 {

    public static void main(String[] args) {
        Contrato contrato1 = Contrato.builder()
                .ClausulaPenalidad(true)
                .Codigo("20244052D")
                .FechaFirma("15/10/2026")
                .Monto(100.3)
                .Observaciones("Ninguna")
                .Proveedor("Alicorp")
                .VigenciaDias(10)
                .build();
        
        Contrato contrato2 = Contrato.builder()
                .Codigo("20244052D")
                .Monto(100)
                .Proveedor("Alicorp")
                .build();
    }
}
