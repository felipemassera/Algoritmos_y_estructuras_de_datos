package Ejercicio5;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;

public class caminoExeptuandoCiudades {

    private Grafo<String> mapasCiudades;

    public caminoExeptuandoCiudades(Grafo<String> g) {
        this.mapasCiudades = g;
    }

    /**
     * // Retorna la lista de ciudades que forman un camino desde ciudad1 a
     * ciudad2, sin pasar por las ciudades que están contenidas en la lista
     * ciudades pasada por parámetro, si no existe camino retorna la lista
     * vacía. (Sin tener en cuenta el combustible).
     */
    /**
     *
     * @param ciudad1
     * @param ciudad2
     * @param ciudades
     * @return
     */
    public ListaGenerica<String> devolverCaminoExceptuando(String ciudad1, String ciudad2, ListaGenerica<String> ciudades) {
        ListaGenerica<String> camino = new ListaEnlazadaGenerica<>();
        if (!this.mapasCiudades.esVacio()) {
            Vertice<String> v = buscarCiudad(ciudad1);
            if (v != null) {
                boolean[] marca = new boolean[mapasCiudades.listaDeVertices().tamanio() + 1];
                marcarCiudadesVisitadas(ciudades, marca);
                dfs(v.getPosicion(), this.mapasCiudades, marca, camino, ciudad2);
            }
        }
        return camino;
    }

    private Vertice<String> buscarCiudad(String buscar) {
        Vertice<String> v = null;
        ListaGenerica<Vertice<String>> lv = this.mapasCiudades.listaDeVertices();
        lv.comenzar();
        if ((!lv.fin()) && (v == null)) {
            Vertice<String> act = lv.proximo();
            if (act.dato().equals(buscar)) {
                v = act;
            }
        }
        return v;
    }

    private void marcarCiudadesVisitadas(ListaGenerica<String> cVisitadas, boolean[] marca) {
        cVisitadas.comenzar();
        while (!cVisitadas.fin()) {
            marca[buscarCiudad(cVisitadas.proximo()).getPosicion()] = true;
        }
    }

    private boolean dfs(int i, Grafo<String> g, boolean[] marca, ListaGenerica<String> camino, String destino) {
        marca[i] = true;
        Vertice<String> v = g.vertice(i);
        camino.agregarFinal(v.dato());
        boolean encontre = v.dato().equals(destino);
        if (!encontre) {
            ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(v);
            ady.comenzar();
            while ((!encontre) && (!ady.fin())) {
                Arista<String> a = ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if (!marca[j]) {
                    encontre = dfs(j, g, marca, camino, destino);
                }
            }
        }
        if (!encontre) {
            camino.eliminarEn(camino.tamanio());
        }
        return encontre;
    }

}
