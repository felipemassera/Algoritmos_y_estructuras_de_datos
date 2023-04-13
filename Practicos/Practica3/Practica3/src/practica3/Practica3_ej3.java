/*
 */
package practica3;

import ListasGenericas.ArbolBinario;
import ListasGenericas.ListaEnlazadaGenerica;

/**
 *
 * @author Felipe
 */
public class Practica3_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ArbolBinario<Integer> otroArbol = new ArbolBinario<Integer>(1);
        
        ArbolBinario<Integer> hi = new ArbolBinario<Integer>(2);
        hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(3));
        hi.agregarHijoDerecho(new ArbolBinario<Integer>(4));
        ArbolBinario<Integer> hd = new ArbolBinario<Integer>(5);
        hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
        hd.agregarHijoDerecho(new ArbolBinario<Integer>(7));
        otroArbol.agregarHijoIzquierdo(hi);
        otroArbol.agregarHijoDerecho(hd);
        
        otroArbol.inOrden();
        System.out.println("");
        otroArbol.posOrden();
        
        ContadorArbol cont = new ContadorArbol(otroArbol);
        
        ListaEnlazadaGenerica<Integer> list1 = new ListaEnlazadaGenerica();
        ListaEnlazadaGenerica<Integer> list2 = new ListaEnlazadaGenerica();
        
        list1 = cont.numerosPares();
        list2 = cont.numerosPares2();
        
        System.out.println("LISTA1");
        list1.comenzar();
        while(!list1.fin()){
            System.out.println(list1.proximo());
        }
        System.out.println("LISTA2");
        list2.comenzar();
        while(!list2.fin()){
            System.out.println(list2.proximo());
        }
        
    }
    
}
