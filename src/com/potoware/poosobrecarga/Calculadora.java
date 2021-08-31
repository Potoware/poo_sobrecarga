package com.potoware.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static float sumar(float a, float b){
        return a+b;
    }

    public static float sumar(int i, float j){
        return  i + j;
    }

    public static float sumar(float i, int j){
        return  i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {
            return Integer.parseInt(a) + Integer.parseInt(b);
        }catch (NumberFormatException e){
            resultado = 0;

        }
        return  resultado;
    }

    public static int sumar(int a, int b, int c){
        return  a+b+c;
    }

    public static int sumar(int...argumentos){
        int total = 0;
        for(int args: argumentos){
        total+=args;
        }
        return total;
    }

    public static float sumar(int a,float...argumentos){
        int total = 0;
        for(float args: argumentos){
            total+=args;
        }
        return total;
    }


}
