package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// while
        Scanner teclado = new Scanner(System.in);

/*
        System.out.print("Escriba el limite: ");
        int limite = teclado.nextInt();

        int x = 0;

        while(x < limite){
            x = x + 1;
            if (x % 2 == 0) {

                if (x == 50){
                    break;
                }
                System.out.println(x);
            }

        }

        int numero = 1;
        int result = 0;
        while(numero != 0){
            System.out.print("Ingrese un numero: ");
            numero = teclado.nextInt();
            result = result + numero;
        }
        System.out.println("La suma es: " + result);

   */
        /*
        Hacer un programa que lea del teclado un numero
        mientras sea distinto de cero. Si ingresa cero
        terminara y mostrara la suma total de los numeros
        dados.
         */

        /*
        hacer un programa que muestre la tabla de multiplicar
        de un numero

        System.out.print(" Ingrese un numero ");
         //int numero = teclado.nextInt();
        for (int x = 1; x <= 12; x = x + 1) {
            for (int i = 1; i <= 12; i = i + 1) {
                int result = i * x;
                System.out.println(x + " X " + i + " = " + result);
            }
            System.out.println();
        }
            */

        int numero;
        System.out.print("Escriba un numero: ");
        numero = teclado.nextInt();
        while(1 == 2){
            System.out.println("El numero es: " + numero);
        }
        do{
            System.out.println("Una vez");
        }
        while(false);
        System.out.println("Adios!");

    }
}
