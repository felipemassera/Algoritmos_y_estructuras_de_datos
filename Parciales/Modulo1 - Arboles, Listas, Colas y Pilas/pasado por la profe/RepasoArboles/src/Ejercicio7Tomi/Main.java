package Ejercicio7Tomi;

import Class.ArbolBinarioDePrueba;

public class Main {

    public static void main(String[] args) {
        ArbolBinarioDePrueba ab =new ArbolBinarioDePrueba();
        Parcial p = new Parcial();
        System.out.println("sumas impares: "+ p.sumaImparesPosOrdenMayorA(ab.getArbol(),0));
    }
    
}
 /**
     *                       1
     *                   2       3
     *                13   5    6
     *                    9 16  
     */   