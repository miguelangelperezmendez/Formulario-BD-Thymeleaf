package com.Formulario_BD_Thymeleaf.Controlador;

public class Suma {
    
    public Double suma (Double num1, Double num2){
        Double suma = num1 + num2;
        return suma;
    }

    public static void main(String[] args) {
        Suma suma = new Suma();
        Double resultado = suma.suma(8.2, 20.4);
        System.out.println( resultado);
    }
}
