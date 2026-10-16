package com.mycompany.pregunta1;

public class CalculoGeneral implements EstrategiaCalculoTributario{
    @Override
    public double calcular(double base){
        base = base*(1.18);
        base = base*(1.02);
        return base;
    }    
}
