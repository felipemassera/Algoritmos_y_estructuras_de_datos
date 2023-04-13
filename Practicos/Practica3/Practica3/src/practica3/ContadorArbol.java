package practica3;

/**
 * recorridos in order pre orden = r-i-d in orden = i-r-d pos-orden = i-d-r
 */
import ListasGenericas.ArbolBinario;
import ListasGenericas.ListaEnlazadaGenerica;

public class ContadorArbol {

    private ArbolBinario<Integer> a;

    public ContadorArbol(ArbolBinario<Integer> arbol) {
        this.a = arbol;
    }


    public ListaEnlazadaGenerica numerosPares() {
        ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica();
        if (!a.esVacio()) {
            numerosParesInOrden(a, l);
        }
        return l;
    }
    private void numerosParesInOrden(ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> l) {
        if (a.tieneHijoIzquierdo()) {
            numerosParesInOrden(a.getHijoIzquierdo(), l);
        }
        if (a.getDato() % 2 == 0) {
            l.agregarFinal(a.getDato());
        }
        if (a.tieneHijoDerecho()) {
            numerosParesInOrden(a.getHijoDerecho(), l);
        }
    }

    public ListaEnlazadaGenerica numerosPares2() {
        ListaEnlazadaGenerica<Integer> l = new ListaEnlazadaGenerica();
        if (!a.esVacio()) {
            numerosParesPosOrden(a, l);
        }
        return l;
    }
    private void numerosParesPosOrden(ArbolBinario<Integer> a, ListaEnlazadaGenerica<Integer> l) {
        if (a.tieneHijoIzquierdo()) {
            numerosParesPosOrden(a.getHijoIzquierdo(), l);
        }
        if (a.tieneHijoDerecho()) {
            numerosParesPosOrden(a.getHijoDerecho(), l);
        }
        if (a.getDato() % 2 == 0) {
            l.agregarFinal(a.getDato());
        }
    }
}
