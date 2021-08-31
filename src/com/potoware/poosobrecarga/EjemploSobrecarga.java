package com.potoware.poosobrecarga;
import static com.potoware.poosobrecarga.Calculadora.*;
import javax.sound.midi.Soundbank;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: "+ sumar(10,5));
        System.out.println("Sumar float: "+ sumar(11.5f,4f));
        System.out.println("Sumar float int: "+ sumar(10f,5));
        System.out.println("Sumar int-float"+sumar(12,12.4f));
        System.out.println("Sumar double: "+sumar(12d,12.54d));
        System.out.println("Sumar String"+sumar("10", "5"));
        System.out.println("Sumar 3 Int: "+ sumar(10,5,3));
        System.out.println("Sumar...: "+ sumar(10,5,3,5,2,15,2,1,4,1));
        System.out.println("Sumar float...int"+sumar(4,8,4,4,1,2,3));

        System.out.println("Sumar long"+Calculadora.sumar(10l,5l));



    }



}
