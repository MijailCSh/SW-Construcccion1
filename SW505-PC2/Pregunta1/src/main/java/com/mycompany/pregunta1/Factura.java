
package com.mycompany.pregunta1;

public class Factura {
    private final EstrategiaCalculoTributario estrategia;
    
    public Factura(EstrategiaCalculoTributario estrategia) {
        this.estrategia = estrategia;
    }
    public double calcularTotal(double base) {
        double total = estrategia.calcular(base);
        return total;
    }
}