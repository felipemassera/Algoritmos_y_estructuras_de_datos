package Ejercicio5;

import Class.ArbolDePrueba;
import Class.ArbolGeneral;
import Class.ColaGenerica;
import Class.ListaGenerica;

public class AnalizadorArbol<T> {

    public int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa> arbol) {
        int cantNodos = 0, prom = 0, maxProm = -999;
        if (!arbol.esVacio()) {
            ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<>();
            ArbolGeneral<AreaEmpresa> aux;
            cola.encolar(arbol);
            cola.encolar(null);
            while (!cola.esVacia()) {
                aux = cola.desencolar();
                if (aux != null) {
                    cantNodos++;
                    prom += aux.getDato().getRetardo();
                    if (aux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = aux.getHijos();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                    }
                } else {
                    maxProm = Math.max(maxProm, (prom / cantNodos));
                    if (!cola.esVacia()) {
                        cantNodos = 0;
                        prom = 0;
                        cola.encolar(null);
                    }
                }
            }
        }
        return maxProm;
    }
}
