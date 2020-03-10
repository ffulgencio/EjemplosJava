package com.company;

public class CondicionalSwitch {

    public static void main(String[] args) {
	// write your code here
        int dia = 2;

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }
    }
}
