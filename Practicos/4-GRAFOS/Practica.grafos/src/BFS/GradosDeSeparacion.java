


package BFS;

import Grafo.Arista;
import Grafo.ColaGenerica;
import Grafo.Grafo;
import Grafo.ListaGenerica;
import Grafo.Vertice;


public class GradosDeSeparacion {
    public int maximoGradoDeSeparacion (Grafo <String> grafo){
        int cantMax = Integer.MIN_VALUE; 
        int cant = -1;
        if (!grafo.esVacio()) {
            ListaGenerica <Vertice<String>> lv = grafo.listaDeVertices();
            lv.comenzar();
            while((cant!=0)&&(!lv.fin())){
                cant = bfs(grafo, lv.proximo().getPosicion());
                if (cant>cantMax) {
                    cantMax = cant;
                }
            }
        }
        return cantMax;
    }
    
    private int bfs(Grafo<String> g, int pos){
        int nivel = 0; 
        boolean [] marca = new boolean [g.listaDeVertices().tamanio()+1];
        ColaGenerica<Vertice<String>> cola = new ColaGenerica<>();
        ListaGenerica<Arista<String>> ady ;
        Vertice<String> v = g.vertice(pos);
        cola.encolar(v);
        int cant = 1;
        marca[pos]= true;
        cola.encolar(null);
        while (!cola.esVacia()) {
            v= cola.desencolar();
            if (v!=null) {
                ady = g.listaDeAdyacentes(v);
                ady.comenzar();
                while (!ady.fin()) {
                    int j = ady.proximo().verticeDestino().getPosicion();
                    if (!marca[j]) {
                        cola.encolar(g.vertice(j));
                        ++cant;   
                        marca[j]= true;
                    }
                }
            }else if (!cola.esVacia()){
                ++nivel;
                cola.encolar(null);
            }
        }
        if (cant != g.listaDeVertices().tamanio()) {
            nivel = 0;
        }
        return nivel;
    }
}
