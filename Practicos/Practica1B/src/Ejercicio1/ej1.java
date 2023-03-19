package Ejercicio1;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese num1: ");
        int num1 = leer.nextInt();
        System.out.print("ingrese num2: ");
        int num2 = leer.nextInt();
        numeros n = new numeros(num1, num2);
        System.out.println(n.toString(num1, num2));
       
        if (num1 != num2) {
            int opcion;

            do {
                n.menu();
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        n.aFor(num1, num2); //inciso A  
                        break;
                    case 2:
                        n.bWhile(num1, num2); //inciso B
                        break;
                    case 3:
                        n.cNada(num1, num2); //inciso C
                        break;
                    case 4:
                        System.out.println("Saliste");
                        break;
                    default:
                        System.out.println("no es una opcion valida");
                        ;
                }
            } while (opcion != 4);

        }
    }
}