package Caminos.RamaMasLejana;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class HojaMasLejana {

    public ListaGenerica<Integer> resolver(ArbolGeneral<Integer> arbol) {
        ListaGenerica<Integer> camino = new ListaEnlazadaGenerica();
        if (!arbol.esVacio()) {
            int alturaMax = arbol.altura();
            System.out.println("Altura max: "+ alturaMax);
            camino = resolver(arbol, 0, alturaMax);
        }
        return camino;
    }

    private ListaGenerica<Integer> resolver(ArbolGeneral<Integer> a, int nivel, int hMax) {
        ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<>();
        if (!a.esHoja()) {
            ListaGenerica<ArbolGeneral<Integer>> h = a.getHijos();
            h.comenzar();
            while ((!h.fin()) && (camino.esVacia())) {
                camino = resolver(h.proximo(), nivel + 1, hMax);
            }
            if (!camino.esVacia()) {
                camino.agregarInicio(a.getDato());
            }
        } else if (nivel == hMax) {
            camino.agregarInicio(a.getDato());
        }
        return camino;
    }
}
