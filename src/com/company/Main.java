package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá una fecha y el programa comprobará si es correcta o no");

        //Declaramos las variables de la fecha y las pedimos por consola.
        System.out.println("Introduzca el día del mes");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes (en número) del año");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año");
        int año =sc.nextInt();

        //Se realizan las validaciones y se informa al usuario
        if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>0&&dia<=30) && (año!=0)){
            System.out.println("Fecha introducida correctamente");
        } else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>0&&dia<=31 && (año!=0)) ) {
            System.out.println("Fecha itroducida correctamente");
        } else if ((mes==2) && (dia>0 && dia<=28) && (año!=0)) {
            System.out.println("Fecha introducida correctamtene");
        } else System.out.println("Fecha incorrecta");


    }

}