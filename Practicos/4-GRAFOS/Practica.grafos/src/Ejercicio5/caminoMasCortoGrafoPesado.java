package Ejercicio5;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;

public class caminoMasCortoGrafoPesado {

    Grafo<String> mapaCiudades;

    public caminoMasCortoGrafoPesado(Grafo<String> g) {
        this.mapaCiudades = g;
    }

    public ListaGenerica<String> caminoMasCorto(String ciudad1, String ciudad2) {
        ListaGenerica<String> camino = new ListaEnlazadaGenerica<>();
        if (!this.mapaCiudades.esVacio()) {
            Vertice<String> v = buscar(ciudad1);
            if (v != null) {
                boolean[] marca = new boolean[mapaCiudades.listaDeVertices().tamanio() + 1];
                ListaGenerica<String> act = new ListaEnlazadaGenerica<>();
                dfs(v.getPosicion(), mapaCiudades, camino, act, marca, ciudad2, 9999 , 0);
            }
        }
        return camino;
    }

    private Vertice<String> buscar(String ciudadBuscada) {
        Vertice<String> v = null;
        ListaGenerica<Vertice<String>> l = this.mapaCiudades.listaDeVertices();
        l.comenzar();
        while ((!l.fin()) && (v == null)) {
            Vertice<String> act = l.proximo();
            if (act.dato().equals(ciudadBuscada)) {
                v = act;
            }
        }
        return v;
    }
    
    public void clonarCamino(ListaGenerica<String> camino,ListaGenerica<String> l){
        camino.comenzar();
        while (camino.fin()) {
            camino.eliminar(camino.proximo());
        }
        l.comenzar();
        while (!l.fin()) {
            camino.agregarFinal(l.proximo());
        }
    }
        
    private int dfs(int i, Grafo g, ListaGenerica<String> camino ,ListaGenerica<String> act, boolean [] marca, String destino,int pesoMin,int peso){
        Vertice<String> v= g.vertice(i);
        marca[i] = true;
        act.agregarFinal(v.dato());
        if (!v.dato().equals(destino)){
            ListaGenerica<Arista<String>> ady= g.listaDeAdyacentes(v);
            ady.comenzar();
            while (!ady.fin()) {
                Arista<String> a = ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if (!marca[j]) {
                   pesoMin = dfs(j, mapaCiudades, camino, act, marca, destino,pesoMin,(peso+a.peso()));
                }
            }
        }else{
            if (peso<pesoMin) {
                pesoMin = peso;
                clonarCamino(camino, act);
            }
        }
        marca[i]= false;
        act.eliminarEn(act.tamanio());
        return pesoMin;
    }
}
