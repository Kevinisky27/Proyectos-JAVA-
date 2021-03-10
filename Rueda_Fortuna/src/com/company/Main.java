package com.company;

public class Main {

    public static void main(String[] args) {
        //Este metodo genera en una array numeros aleatorios del 0 al 9 sin repetirse en total 10

        int i = 0, j = 0, cantidad = 10, rango = 10;
        int array[] = null;

        //En esta array guardaremos 10 numero del 0 al 9 y no se repetira ninguno
        array[i] = (int) (Math.random() * rango);

        for (i = 1; i < cantidad; i++) {
            array[i] = (int) (Math.random() * rango);

            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
            }
        }
    }

}
