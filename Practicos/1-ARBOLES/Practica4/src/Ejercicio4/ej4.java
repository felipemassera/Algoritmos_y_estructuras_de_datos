/*
 */
package Ejercicio4;

import Class.ArbolDePrueba;
import Class.ArbolGeneral;

/**
 *
 * @author Felipe
 */
public class ej4 {

    public static void main(String[] args) {
        ArbolDePrueba ap= new ArbolDePrueba();
        ArbolGeneral a= ap.getArbol();
        a.preOrden();
        System.out.println("");
        System.out.println("En que nivel esta el...? "+a.nivel(222));
        System.out.println("Altura: "+a.altura());
        
        System.out.println("ANCHO del arbol: "+ a.ancho());
        
        
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
