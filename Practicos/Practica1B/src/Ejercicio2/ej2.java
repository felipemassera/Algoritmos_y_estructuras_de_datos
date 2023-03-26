/*
 */
package Ejercicio2;

import java.util.Scanner;

public class ej2 {

    public static void metodo(int[] vector, int value) {
        for (int i = 0; i < value; i++) {
            vector[i] = value *(i+1);
        }
        System.out.println("salgo de la creacion");
    }

    public static void mostrarVector(int[] vector, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println((i + 1) + "- " + vector[i]);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese N valor para completar el arreglo");
        int n = leer.nextInt();
        if (n >= 1) {
            int[] vector = new int[n];
            metodo(vector, n);
            mostrarVector(vector, n);
        } else {
            System.out.println("EL numero debe ser mayor o igual a 1");
        }
        leer.close();
    }

}
