package practica3.ejercicio5;

import ListasGenericas.ArbolBinario;

public class main {

    public static void main(String[] args) {
        
        ArbolBinario<Integer> a = new ArbolBinario<>(1);
        ArbolBinario<Integer> ai = new ArbolBinario<>(2);
        ai.agregarHijoIzquierdo(new ArbolBinario<>(3));
        ai.agregarHijoDerecho(new ArbolBinario<>(4));
        ArbolBinario<Integer> ad = new ArbolBinario<>(5);
        ad.agregarHijoIzquierdo(new ArbolBinario<>(6));
        ad.agregarHijoDerecho(new ArbolBinario<>(7));
        a.agregarHijoIzquierdo(ai);
        a.agregarHijoDerecho(ad);
        
        ProfundidadDeArbolBinario p = new ProfundidadDeArbolBinario(a);
        
        System.out.println("total = " + p.sumaElementosProfundidad(1));
        
        
    }
    
}
