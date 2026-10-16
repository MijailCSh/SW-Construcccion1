package com.mycompany.pregunta1;

public class CalculoRer implements EstrategiaCalculoTributario{
    @Override
    public double calcular(double base){
        return base*1.18;
    }    
}
