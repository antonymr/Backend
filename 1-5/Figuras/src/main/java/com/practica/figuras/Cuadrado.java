package com.practica.figuras;

public class Cuadrado extends Figura implements IFigura2D{

    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public Cuadrado(String color, int lado) {
        super("Cuadrado", color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
