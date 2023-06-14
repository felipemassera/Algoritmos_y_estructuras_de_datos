package Ejercicio5;

import Grafo.Grafo;
import Grafo.Arista;
import Grafo.Vertice;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;

/**
 * // Retorna la lista de ciudades que forman un camino para llegar de ciudad1 
 * a ciudad2 teniendo en cuenta que el auto debe cargar la menor cantidad de
 * veces. El auto no se debe quedar sin combustible en medio de una ruta, además
 * puede completar su tanque al llegar a cualquier ciudad. Si no existe camino
 * retorna la lista vacía.
 */

public class caminoConMenorCargaDeCombustible {
    
    private Grafo<String> mapaCiudades;
    
    public caminoConMenorCargaDeCombustible(Grafo<String> g){
        this.mapaCiudades = g;
    }
    
    public ListaGenerica<String> caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2,int tanqueAuto){
        ListaGenerica<String> camino = new ListaEnlazadaGenerica<>();
        if (!this.mapaCiudades.esVacio()) {
            Vertice<String> v = buscar(ciudad1);
            if (v!=null) {
                boolean [] marca = new boolean [this.mapaCiudades.listaDeVertices().tamanio()+1];
                ListaGenerica<String> act = new ListaEnlazadaGenerica();
                dfs(v.getPosicion(),this.mapaCiudades,camino,act, marca,tanqueAuto,tanqueAuto,0,999, ciudad2);
            }
        }
        return camino;
    }
    private Vertice<String> buscar(String origen){
        Vertice<String> v= null;
        ListaGenerica<Vertice<String>> lv= this.mapaCiudades.listaDeVertices();
        lv.comenzar();
        while ((!lv.fin())&&(v==null)) {
            Vertice<String> act= lv.proximo();
            if (act.dato().equals(origen)) {
                v=act;
            }
        }
        return v;
    }
    private void clonar(ListaGenerica<String> fin, ListaGenerica<String> act){
        fin.comenzar();
        while (!fin.fin()) {
            fin.eliminar(fin.proximo());
        }
        act.comenzar();
        while (!act.fin()) {
            fin.agregarFinal(act.proximo());
        }
    }
    
    
    private int dfs(int i, Grafo<String> g,ListaGenerica<String> camino,
            ListaGenerica<String> act,boolean [] marca, int tanqueAct,int tanqueLleno,int cargas,int cargasMin, String destino){
        
        Vertice<String> v = g.vertice(i);
        marca[i] = true;
        act.agregarFinal(v.dato());
        if (v.dato().equals(destino)){
            if(cargas < cargasMin) {
                clonar(camino,act);
            }
        }else{
            ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(v);
            ady.comenzar();
            while (!ady.fin()) {
                Arista<String> a = ady.proximo();
                int j = a.verticeDestino().getPosicion();
                    if (tanqueAct-a.peso()>=0) {
                        //tanqueAct-=a.peso();
                        cargasMin= dfs(j,g,camino,act,marca,(tanqueAct-a.peso()),tanqueLleno,cargas,cargasMin,destino);
                    }else if ((tanqueLleno-a.peso()>=0)&&(cargasMin > cargas+1)) {
                        //cargas++;
                        //tanqueAct = tanqueLleno - a.peso();
                        cargasMin= dfs(j,g,camino,act,marca,(tanqueLleno-a.peso()),tanqueLleno,cargas+1,cargasMin,destino);
                    }
            }
        }
        marca[i] = false;
        act.eliminarEn(act.tamanio());
        return cargasMin;
    }
    
    
    
}
