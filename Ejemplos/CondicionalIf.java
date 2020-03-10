package com.company;

public class CondicionalIf {

    public static void main(String[] args) {
        int dia = 1000000000;

        if (dia == 1){
            System.out.println("Lunes");
        }
        else if (dia == 2){
            System.out.println("Martes");

        }else if (dia == 3){
            System.out.println("Miercoles");

        }else if (dia == 4){
            System.out.println("Jueves");

        }else if (dia == 5){
            System.out.println("Viernes");

        }else{
            System.out.println("No hay dia para el valor dado!");

        }
    }
}
