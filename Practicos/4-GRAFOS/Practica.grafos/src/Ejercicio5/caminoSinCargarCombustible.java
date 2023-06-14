package Ejercicio5;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;

/**
 * El método caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto):
 * ListaGenerica<String> // Retorna la lista de ciudades que forman un camino para llegar
 * de ciudad1 a ciudad2. El auto no debe quedarse sin combustible y no puede cargar.
 * Si no existe camino retorna la lista vacía.
 */
public class caminoSinCargarCombustible {
    private Grafo<String> mapaCiudades;

    public caminoSinCargarCombustible(Grafo<String> mapaCiudades) {
        this.mapaCiudades = mapaCiudades;
    }
    
    public ListaGenerica<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto){
        ListaGenerica<String> camino = new ListaEnlazadaGenerica<>();
        if (!this.mapaCiudades.esVacio()) {
            Vertice<String> v = buscar(ciudad1);
            if (v!=null) {
                boolean [] marca = new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
                dfs(v.getPosicion(), mapaCiudades, marca,camino ,ciudad2, tanqueAuto);
            }
        }
        return camino;
    }
    
    private Vertice<String> buscar(String origen){
        Vertice<String> v= null;
        ListaGenerica<Vertice<String>> lv = this.mapaCiudades.listaDeVertices();
        lv.comenzar();
        while ((!lv.fin())&&(v==null)) {
            Vertice<String> act = lv.proximo();
            if (act.dato().equals(origen)) {
                v=act;
            }
        }
        return v;
    }
    
    private boolean dfs(int i, Grafo<String> g, boolean[] marca,ListaGenerica<String> camino, String destino, int tanque){
        Vertice<String> v = g.vertice(i);
        marca[i] = true;
        camino.agregarFinal(v.dato());
        boolean encontre = v.dato().equals(destino);
        if(!encontre){
            ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(v);
            ady.comenzar();
            while ((!encontre)&&(!ady.fin())) {
                Arista<String> a= ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if ((!marca[j])&&(tanque-a.peso()>=0)) {
                    int naftaRestante = tanque - a.peso();
                    encontre = dfs(j,g,marca,camino,destino,naftaRestante);
                }
            }
        }
        if (!encontre) {
            camino.eliminarEn(camino.tamanio());
        }
        return encontre;
    }
}
