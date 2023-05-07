package Ejercicio6Tomi;

import Class.ArbolBinario;
import Class.ColaGenerica;

public class NivelArbol {

    private ArbolBinario<Integer> a;

    public NivelArbol(ArbolBinario<Integer> a) {
        this.a = a;
    }

    public ArbolBinario<Integer> minEnNivelAB(int n) {
        ArbolBinario<Integer> ab = null;
        if (!this.a.esVacio()) {
            ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<>();
            ArbolBinario<Integer> aux;
            boolean ok = false;
            cola.encolar(this.a);
            cola.encolar(null);
            int nivel = 0;
            int min = 9999;
            while ((!cola.esVacia()) && (!ok)) {
                aux = cola.desencolar();
                if ((aux != null) && (!ok)) {
                    if ((aux.esHoja()) && (nivel == n)) {
                        min = Math.min(min, aux.getDato());
                        if (min == aux.getDato()) {
                            ab = aux;
                        }
                    }
                    if ((!aux.esHoja()) && (!ok)) {
                        if (aux.tieneHijoIzquierdo()) {
                            cola.encolar(aux.getHijoIzquierdo());
                        }
                        if (aux.tieneHijoDerecho()) {
                            cola.encolar(aux.getHijoDerecho());
                        }
                    }
                } else if (!cola.esVacia()) {
                    cola.encolar(null);
                    if (nivel == n) {
                        ok = true;
                    }
                    nivel++;
                }

            }
        }
        return ab;
    }
}
