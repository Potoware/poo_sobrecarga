package com.potoware.poosobrecarga;

import javax.sound.midi.Soundbank;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        System.out.println("Sumar int: "+ cal.sumar(10,5));
        System.out.println("Sumar float: "+ cal.sumar(11.5f,4f));
        System.out.println("Sumar float int: "+ cal.sumar(10f,5));
        System.out.println("Sumar int-float"+cal.sumar(12,12.4f));
        System.out.println("Sumar double: "+cal.sumar(12d,12.54d));
        System.out.println("Sumar String"+cal.sumar("10", "5"));
        System.out.println("Sumar 3 Int: "+ cal.sumar(10,5,3));


        System.out.println("Sumar long"+cal.sumar(10l,5l));



    }



}
