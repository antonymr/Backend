package com.practica.figuras;

public class Circulo extends Figura implements IFigura2D{

    private double radio;

    public Circulo(String color, double radio) {
        super("Circulo", color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * (Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
