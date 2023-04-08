/*
 */
package practica3;

import ListasGenericas.ArbolBinario;

/**
 *
 * @author Felipe
 */
public class Practica3_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContadorArbol<Integer> a = new ContadorArbol(new ArbolBinario<Integer> arbol(3));
        ArbolBinario<Integer> hI = new ArbolBinario<>(2);
        hI.agregarHijoIzquierdo(new ArbolBinario<>(4));
        hI.agregarHijoDerecho(new ArbolBinario<>(5));
        ArbolBinario<Integer> hD = new ArbolBinario<>(3);
        hD.agregarHijoIzquierdo(new ArbolBinario<>(6));
        a.agregarHijoIzquierdo(hI);
        a.agregarHijoDerecho(hD);
        
        
    }
    
}
