package com.mycompany.pregunta1;

public class Pregunta1 {
    
    public static void main(String[] args) {
        
        
        EstrategiaCalculoTributario estrategia = new CalculoGeneral();
        Factura factura = new Factura(estrategia);
        
        double total = factura.calcularTotal(1000.15);
        
        System.out.printf("El total es; %f", total);
    }
}
