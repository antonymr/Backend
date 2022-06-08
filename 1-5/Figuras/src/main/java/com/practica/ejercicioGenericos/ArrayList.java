package com.practica.ejercicioGenericos;

public class ArrayList  <T>{

    private T[] conjunto;
    private int i;

    public ArrayList(int tamanio){
        conjunto = (T[]) new Object[tamanio];
        i = 0;
    }

    public void agregarElemento(T object){
        conjunto[i] = object;
        i++;
    }

    public T obtenerElemento(int posicion){
        return conjunto[posicion];
    }

}
