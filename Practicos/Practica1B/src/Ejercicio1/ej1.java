package Ejercicio1;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese num1: ");
        int num1 = leer.nextInt();
        System.out.print("ingrese num2: ");
        int num2 = leer.nextInt();

        int opcion;
        do {
            servicio.menu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Inciso A --> FOR");
                    servicio.aFor(num1, num2); //inciso A  
                    break;
                case 2:
                    System.out.println("Inciso B --> WHILE");
                    servicio.bWhile(num1, num2); //inciso B
                    break;
                case 3:
                    System.out.println("Inciso C --> Recursion");
                    servicio.cRecursion(num1, num2); //inciso C
                    break;
                case 4:
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("no es una opcion valida");
            }
        } while (opcion != 4);

    }
}
