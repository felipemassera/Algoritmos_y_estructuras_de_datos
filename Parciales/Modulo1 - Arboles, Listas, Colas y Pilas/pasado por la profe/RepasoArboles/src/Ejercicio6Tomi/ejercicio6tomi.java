/*
 */
package Ejercicio6Tomi;

import Class.ArbolBinarioDePrueba;

/**
 *
 * @author Felipe
 */
public class ejercicio6tomi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinarioDePrueba ab = new ArbolBinarioDePrueba();
        NivelArbol n = new NivelArbol(ab.getArbol());
        System.out.println("Dato " +n.minEnNivelAB(3).getDato());
    }
    
}
