/**
 * Implemente una clase Java llamada ProfundidadDeArbolBinario que tiene como variable de
 * instancia un árbol binario de números enteros y un método de instancia
 * sumaElementosProfundidad(int p):int el cuál devuelve la suma de todos los nodos del árbol
 * que se encuentren a la profundidad pasada como argumento.
 * Defina la clase dentro del paquete tp03.ejercicio5
 */
package practica3.ejercicio5;

import Class.ArbolBinario;
import ListasGenericas.ColaGenerica;

public class ProfundidadDeArbolBinario {

    ArbolBinario<Integer> arbol;

    public ProfundidadDeArbolBinario() {

    }

    public ProfundidadDeArbolBinario(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    
    public int sumaElementosProfundidad(int p) {
        int tot = 0, nivel=0;
        ArbolBinario<Integer> a = null;
        ColaGenerica<ArbolBinario<Integer>> c = new ColaGenerica();
        c.encolar(this.arbol);
        c.encolar(null);
        while ((!c.esVacia())&&(nivel<p)) {
            a = c.desencolar();
            if (a != null) {
                System.out.println("dato: "+ a.getDato());
                tot+= a.getDato();
                if (a.tieneHijoIzquierdo()){
                    c.encolar(a.getHijoIzquierdo());
                }
                if (a.tieneHijoDerecho()){
                    c.encolar(a.getHijoDerecho());
                }
            }else if (!c.esVacia()){
                nivel++;
                System.out.println("*************");
                c.encolar(null);
                
            }
        }
        return tot;
    }
}
