/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.practica.calculadora;

/**
 *
 * @author aamr_
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones<Double, Integer> operaciones = new Operaciones<Double, Integer>(1.0, 0);
        String mensaje = "La suma es: " + operaciones.obtenerSuma();
        mensaje += "\nLa resta es: " + operaciones.obtenerResta();
        mensaje += "\nLa multiplicacion es: " + operaciones.obtenerMultiplicacion();
        mensaje += "\nLa division es: " + operaciones.obtenerDivision();
        System.out.println(mensaje);
    }
}
