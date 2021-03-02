package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int op;
        while(!exit){

            System.out.println("---Operacion de cadenas---");
            System.out.println("1. tamaño de la cadena ingresada");
            System.out.println("2. Subcadena ");
            System.out.println("3. Comparacion de palabras ");
            System.out.println("4. Comparacion de tamaño ");
            System.out.println("5. exit ");
            op = sn.nextInt();


            System.out.println("vuelva ingresar la opcion que desea  ");
            op = sn.nextInt();


            switch(op ){
                case 1:
                    System.out.println("Ingrese cadena para saber su tamaño");
                    String cadena;
                    Scanner br = new Scanner (System.in);
                    cadena = br.nextLine();
                    int tam = cadena.length();
                    System.out.println("La cadena tiene: " + tam +"letras ");
                    break;
                case 2:
                    Scanner id = new Scanner (System.in);
                    System.out.println("Ingrese la primera palabra ");
                    String pal;
                    pal = id.nextLine();
                    System.out.println("Ingrese la segunda palabra  ");
                    String pal1;
                    pal1 = id.nextLine();

                    if( pal == pal1){
                        System.out.println("Las palabras son iguales  ");

                    }
                    else {
                        System.out.println("Las palabras no son iguales ");
                    }





                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    System.out.println();
            }


        }


    }
}
