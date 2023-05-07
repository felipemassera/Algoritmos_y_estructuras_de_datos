package Caminos.TodasRamasMasLejanas;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class TodosCaminosMasLejanos {

    public ListaGenerica<ListaGenerica<Integer>> resolver(ArbolGeneral<Integer> arbol) {
        ListaGenerica<ListaGenerica<Integer>> caminos = new ListaEnlazadaGenerica();
        if (!arbol.esVacio()) {
            ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<>();
            caminos.agregarFinal(new ListaEnlazadaGenerica<>());
            resolver(arbol, caminos, camino);
        }
        return caminos;
    }

    private void resolver(ArbolGeneral<Integer> a, ListaGenerica<ListaGenerica<Integer>> caminos, ListaGenerica<Integer> camAct) {
        camAct.agregarFinal(a.getDato());
        if (!a.esHoja()) {
            ListaGenerica<ArbolGeneral<Integer>> h = a.getHijos();
            h.comenzar();
            while (!h.fin()) {
                resolver(h.proximo(), caminos, camAct);
            }
        } else {
            if (camAct.tamanio() >= caminos.elemento(1).tamanio()) {
                if (camAct.tamanio() > caminos.elemento(1).tamanio()) {
                    caminos.comenzar();
                    while (!caminos.fin()) {
                        caminos.eliminar(caminos.proximo());
                    }
                }
                caminos.agregarFinal(camAct.clonar());
            }
        }
        camAct.eliminarEn(camAct.tamanio());
    }
}


/*  Diagrama del arbol de prueba
                7    
                |    
                5 - 1 - 3
                |       |
                |        11 - 12 - 21 - 22 - 200
                15 -26 - 224 - 287      |     |
                                      (-69)  269
 */
