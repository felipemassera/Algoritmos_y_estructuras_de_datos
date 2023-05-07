package Ejercicio5Tomi;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class Parcial {

    public ListaGenerica<ListaGenerica<Character>> caminosPares(ArbolGeneral<Character> arbol) {
        ListaGenerica<ListaGenerica<Character>> lista = new ListaEnlazadaGenerica<>();
        if (!arbol.esVacio()) {
            ListaGenerica<Character> camAct = new ListaEnlazadaGenerica<>();
            lista.agregarFinal(new ListaEnlazadaGenerica<>());
            caminosPares(arbol,camAct,lista);
        }
        return lista;
    }
    //Preorden
    private void caminosPares(ArbolGeneral<Character> a,ListaGenerica<Character> camAct,ListaGenerica<ListaGenerica<Character>> lista){
        camAct.agregarFinal(a.getDato());
        if (!a.esHoja()) {
            ListaGenerica<ArbolGeneral<Character>> h = a.getHijos();
            h.comenzar();
            while (!h.fin()) {
                caminosPares(h.proximo(), camAct, lista);
            }
        }else{
            if (camAct.tamanio()%2==0) {
               lista.agregarFinal(camAct.clonar());
            }
        }
        camAct.eliminarEn(camAct.tamanio());
    }
}
