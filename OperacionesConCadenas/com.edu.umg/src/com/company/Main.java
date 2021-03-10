package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int Menu;



        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("\n 1.- Tamaño \n 2.- Subcadena \n 3.- Comparación de Palabras \n 4.- Comparación de tamaño \n 5.- Salir del Software");
        System.out.println("--------------------------");
        do {
            System.out.println("Digita una opción: ");
            Menu = Scanner.nextInt();

            switch (Menu) {
                case 1:
                    System.out.println("----- TAMAÑO DE CADENA -----");
                    String cadena_ingresada;
                    int num_caracteres;

                    System.out.println("Ingresar cadena: ");

                    cadena_ingresada = Scanner.nextLine();
                    num_caracteres = cadena_ingresada.length();

                    System.out.println("la cadena de texto ingresada: " + cadena_ingresada + "  tiene " + " "  + num_caracteres);

                case 2:
                    System.out.println("Ingresar cadena: ");
                    String nombre = Scanner.nextLine();
                    System.out.println(nombre.substring(0, 4));

                case 3:
                    System.out.println("----- COMPARACIÓN DE PALABRAS ----- ");
                    System.out.println("Ingresar primera cadena: ");
                    String PrimeraCadena = Scanner.nextLine();


                    System.out.println("Ingresar segunda cadena: ");
                    String SegundaCadena = Scanner.nextLine();


                    if (PrimeraCadena.equalsIgnoreCase(SegundaCadena)) {
                        System.out.println("Primera cadena y Segunda cadena, son iguales");
                    }
                    else {
                        System.out.println("Primera cadena y Segunda cadena, no son iguales");
                    }
                    break;


                case 4:
                    System.out.println("----- COMPARACIÓN DE TAMAÑO ----- ");
                    System.out.println("Ingresar la primera cadena: ");
                    String Cadena1 = Scanner.nextLine();

                    System.out.println("Ingresar cadena : ");
                    String Cadena2 = Scanner.nextLine();

                    if (Cadena1.equals(Cadena2)) {
                        System.out.println("Si tienen el mismo tamaño");
                    } else {
                        System.out.println("No tienen el mismo tamaño");
                    }
                    break;


                case 5:
                    System.out.println("----- SALIENDO ----- ");
                    System.out.println("  successful exit");
                    boolean SalirMenu = false;
                    break;


                default:
                    System.out.println("La opción ingresada no es validad");
                    break;
            }


        } while (Menu < 4);
    }
}
