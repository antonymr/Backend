package com.practica.figuras;

public class Triangulo extends Figura implements IFigura2D, ITriangulo{

    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super("Triangulo", color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base * 3;
    }
}
