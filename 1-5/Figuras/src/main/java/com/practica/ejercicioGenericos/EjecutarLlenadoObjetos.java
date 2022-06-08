package com.practica.ejercicioGenericos;

public class EjecutarLlenadoObjetos {
    public static void main(String[] args) {
        ArrayList<Empleado> coleccion= new ArrayList<Empleado>(4);
        /*coleccion.agregarElemento("Maria");
        coleccion.agregarElemento("Julio");
        coleccion.agregarElemento("Daniel");
        coleccion.agregarElemento("Byron");
        String valor = (String) coleccion.obtenerElemento(2);*/
        coleccion.agregarElemento(new Empleado("Antony", "Guayaquil", "0987654321"));
        coleccion.agregarElemento(new Empleado("Alexander", "Guayas", "0987654321"));
        coleccion.agregarElemento(new Empleado("Patricio", "Sur", "0987654321"));
        coleccion.agregarElemento(new Empleado("Adam", "Guasmo", "0987654321"));
        Empleado valor = coleccion.obtenerElemento(2);
        System.out.println(valor);
    }
}
