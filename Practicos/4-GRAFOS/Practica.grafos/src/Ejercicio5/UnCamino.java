package Ejercicio5;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;


public class UnCamino<T> {
    private Grafo<String> mapaCiudades;
    
    public UnCamino(Grafo<String> g){
        this.mapaCiudades = g;
    }
    
    public ListaGenerica<String> devolverCamino(String ciudad1, String ciudad2){
        ListaGenerica<String> camino = new ListaEnlazadaGenerica<>();
        if (!this.mapaCiudades.esVacio()){
            Vertice<String> v = buscarCiudad(ciudad1);
            if (v!=null) {
                boolean [] marca = new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
                for (int i = 1; i < marca.length; i++) {
                    marca[i]= false;
                }
                dfs(v.getPosicion(),this.mapaCiudades,camino,marca,ciudad2);
            }
        }
        return camino;
    }
   
    private Vertice<String> buscarCiudad(String buscar){
        ListaGenerica<Vertice<String>> ciudades= this.mapaCiudades.listaDeVertices();
        ciudades.comenzar();
        Vertice<String> vertice = null;
        while ((!ciudades.fin()) && (vertice==null)){
            Vertice<String> act = ciudades.proximo();
            if (act.dato().equals(buscar)) {
                vertice=act;
            }
        }
        return vertice;
    }
    
    private boolean dfs(int i, Grafo<String> grafo, ListaGenerica<String> camino, boolean[] marca, String destino){
        marca[i]=true;
        Vertice <String> vertice = grafo.vertice(i);
        camino.agregarFinal(vertice.dato());
        boolean encontre = vertice.dato().equals(destino);
        if (!encontre){
            ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(vertice);
            ady.comenzar();
            while ((!encontre)&&(!ady.fin())) {
                Arista<String> a = ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if(!marca[j]){
                    encontre = dfs(j,grafo,camino,marca,destino);
                }
            }  
        }
        if(!encontre){
            camino.eliminarEn(camino.tamanio());
        }
        return encontre;
    }
}
