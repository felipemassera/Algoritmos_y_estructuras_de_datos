


package Ejercicio6;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;


public class unCaminoMaxPesoYlistaDeProhibidos {

    public ListaGenerica<String> paseoEnBici(Grafo<String> lugares,String destino, int maxTiempo,ListaGenerica<String> lugaresRestringidos){
        ListaGenerica<String> camino = new ListaEnlazadaGenerica();
        if (!lugares.esVacio()){
            Vertice<String> v= buscar("Ayuntamiento",lugares);
            if (v!=null) {
                boolean [] marca = new boolean [lugares.listaDeVertices().tamanio()+1];
                marcarCiudadesRestringidas(marca,lugaresRestringidos,lugares);
                dfs(v.getPosicion(), lugares, marca, camino, maxTiempo, 0, destino);
            }
        }
        return camino;
    }
    
    private Vertice<String> buscar(String dato, Grafo<String> grafo){
        Vertice<String> v = null;
        ListaGenerica<Vertice<String>> lv = grafo.listaDeVertices();
        lv.comenzar();
        while((!lv.fin()) && (v ==null)){
            Vertice<String>act = lv.proximo();
            if (act.dato().equals(dato)) {
                v= act;
            }
        }
        return v;
    }
    
    private void marcarCiudadesRestringidas(boolean[] marca, ListaGenerica<String> lugaresRestringidos, Grafo<String> grafo){
        lugaresRestringidos.comenzar();
        while (!lugaresRestringidos.fin()){
            marca[buscar(lugaresRestringidos.proximo(),grafo).getPosicion()]= true;
        }
    }
    private boolean dfs(int i, Grafo<String>grafo,boolean[] marca, ListaGenerica<String> camino, int maxTiempo, int tiempoAct, String destino){
        Vertice<String> v= grafo.vertice(i);
        marca[i]=true;
        camino.agregarFinal(v.dato());
        boolean encontre = v.dato().equals(destino);
        if (!encontre){
            ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(v);
            ady.comenzar();
            while ((!encontre)&&(!ady.fin())) {
                Arista<String> a= ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if ((marca[j])&&(tiempoAct + a.peso())<= maxTiempo){  
                    encontre = dfs(j,grafo,marca,camino,maxTiempo,tiempoAct+a.peso(),destino);
                }
            }
        }
        if (!encontre) {
            camino.eliminarEn(camino.tamanio());
        }
        return encontre;
    }
}
