package ElDeLaFoto;

import Class.ArbolBinario;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class ElDeLaFotoIMPAR {

    private ArbolBinario<Integer> arbol;

    public Dato resolver() {
        Dato d = new Dato();
        if (!this.arbol.esVacio()) {
            resolver(this.arbol, d);
        }
        return d;
    }

    public ElDeLaFotoIMPAR(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    private void resolver(ArbolBinario<Integer> a, Dato d) {
        if (a.getDato() % 2 == 1) {
            d.setNumImpar();
            if ((a.tieneHijoIzquierdo()) && (!a.tieneHijoDerecho())) {
                d.llenarLista(a);
            }
            if ((!a.tieneHijoIzquierdo()) && (a.tieneHijoDerecho())) {
                d.llenarLista(a);
            }
        }
        if (!a.esHoja()) {
            if (a.tieneHijoIzquierdo()) {
                resolver(a.getHijoIzquierdo(), d);
            }
            if (a.tieneHijoDerecho()) {
                resolver(a.getHijoDerecho(), d);
            }
        }
    }

    public class Dato {

        private ListaGenerica<ArbolBinario<Integer>> lista;
        private int num;

        public Dato() {
            this.lista = new ListaEnlazadaGenerica<>();
            this.num = 0;
        }

        public ListaGenerica<ArbolBinario<Integer>> getLista() {
            return lista;
        }

        public void llenarLista(ArbolBinario<Integer> num) {
            this.lista.agregarFinal(num);
        }

        public int getNumImpar() {
            return num;
        }

        public void setNumImpar() {
            this.num++;
        }
    }

}
