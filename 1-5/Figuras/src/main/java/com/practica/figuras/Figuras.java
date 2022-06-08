package com.practica.figuras;

import java.text.DecimalFormat;

public class Figuras {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        String mensaje = "";
        //Cuadrado
        Cuadrado cuadrado = new Cuadrado("Azul", 3);
        mensaje = "Figura: " + cuadrado.getNombre() + "\t\tColor: " + cuadrado.getColor() + "\t\tArea: " + df.format(cuadrado.calcularArea()) + "\t\tPerimetro: " + df.format(cuadrado.calcularPerimetro());
        System.out.println(mensaje);
        //Circulo
        Circulo circulo = new Circulo("Amarillo", 3);
        mensaje = "Figura: " + circulo.getNombre() + "\t\tColor: " + circulo.getColor() + "\t\tArea: " + df.format(circulo.calcularArea()) + "\t\tPerimetro: " + df.format(circulo.calcularPerimetro());
        System.out.println(mensaje);
        //Triangulo Rectangulo
        Triangulo trianguloRectangulo = new Triangulo("Rojo", 3, 4);
        mensaje = "\n\nNombre mal\nFigura: " + trianguloRectangulo.getNombre() + "\t\tColor: " + trianguloRectangulo.getColor() + "\t\tArea: " + df.format(trianguloRectangulo.calcularArea()) + "\t\tPerimetro: " + df.format(trianguloRectangulo.calcularPerimetro());
        System.out.println(mensaje);
        trianguloRectangulo.setNombre(trianguloRectangulo.actualizarNombre());
        mensaje = "Nombre Actualizado\nFigura: " + trianguloRectangulo.getNombre() + "\t\tColor: " + trianguloRectangulo.getColor() + "\t\tArea: " + df.format(trianguloRectangulo.calcularArea()) + "\t\tPerimetro: " + df.format(trianguloRectangulo.calcularPerimetro());
        System.out.println(mensaje);
        //Triangulo Isosceles
        TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles("Naranja", 4, 7, 3);
        mensaje = "\n\nNombre mal\nFigura: " + trianguloIsosceles.getNombre() + "\t\tColor: " + trianguloIsosceles.getColor() + "\t\tArea: " + df.format(trianguloIsosceles.calcularArea()) + "\t\tPerimetro: " + df.format(trianguloIsosceles.calcularPerimetro());
        System.out.println(mensaje);
        trianguloIsosceles.setNombre(trianguloIsosceles.actualizarNombre());
        mensaje = "Nombre Actualizado\nFigura: " + trianguloIsosceles.getNombre() + "\t\tColor: " + trianguloIsosceles.getColor() + "\t\tArea: " + df.format(trianguloIsosceles.calcularArea()) + "\t\tPerimetro: " + df.format(trianguloIsosceles.calcularPerimetro());
        System.out.println(mensaje);
    }
}
