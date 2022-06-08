package com.practica.figuras;

public class TrianguloIsosceles extends Triangulo{

    private double lado;

    public TrianguloIsosceles(String color, double base, double altura, double lado) {
        super(color, base, altura);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String actualizarNombre() {
        return "Triangulo Isosceles";
    }

    @Override
    public double calcularPerimetro() {
        return (getBase() * 2) + lado;
    }
}
