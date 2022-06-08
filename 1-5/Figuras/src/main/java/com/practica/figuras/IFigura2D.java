package com.practica.figuras;

public interface IFigura2D {

    static final double PI = Math.PI;

    double calcularArea();
    double calcularPerimetro();
    default String limpiarFigura(){
        return "Ninguno";
    }

}
