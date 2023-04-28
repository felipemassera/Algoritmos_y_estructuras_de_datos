/*
 */
package Ejercicio6;

import Class.ArbolDePrueba;
import Class.ArbolGeneral;

/**
 *
 * @author Felipe
 */
public class ej6 {

    /**
     * PREGUNTAR A AYUDANTE POR QUE NO TOMA EL CASO (7, 287)
     */
    public static void main(String[] args) {
        ArbolDePrueba ap = new ArbolDePrueba();
        ArbolGeneral<Integer> arbol = ap.getArbol();
        arbol.preOrden();
        
        System.out.println("");
        
        System.out.println("Son familia? "+ arbol.esAncestro(7,22));
    }
     /*  Diagrama del arbol de prueba
                7    
                |    
                5 - 1 - 3
                |       |
                |        11 - 12 - 21 - 22
                15 -26 - 224 - 287
        */
}
