package com.practica.calculadora;

public class Operaciones <T extends Number, U extends Number>{

    private T numeroUno;
    private U numeroDos;

    public Operaciones(T t, U u){
        this.numeroUno = t;
        this.numeroDos = u;
    }

    public float obtenerSuma(){
        return numeroUno.floatValue() + numeroDos.floatValue();
    }
    public float obtenerResta(){
        return numeroUno.floatValue() - numeroDos.floatValue();
    }
    public float obtenerMultiplicacion(){
        return numeroUno.floatValue() * numeroDos.floatValue();
    }
    public float obtenerDivision(){
        if (numeroDos.floatValue() == 0){
            return 0;
        }
        return numeroUno.floatValue() / numeroDos.floatValue();
    }


}
