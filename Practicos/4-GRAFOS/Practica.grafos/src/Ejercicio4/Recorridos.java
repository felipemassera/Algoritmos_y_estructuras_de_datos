package Ejercicio4;

import Grafo.Arista;
import Grafo.ColaGenerica;
import Grafo.Grafo;
import Grafo.ListaEnlazadaGenerica;
import Grafo.ListaGenerica;
import Grafo.Vertice;

public class Recorridos<T> {

    public ListaGenerica<Vertice<T>> dfs(Grafo<T> grafo) {
        ListaGenerica<Vertice<T>> camino = new ListaEnlazadaGenerica();
        if (!grafo.esVacio()) {
            //se hace tamanio +1 ya que se usa para poder laburar con listas o con matrices
            boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()+1];
            for (int i = 1; i < marca.length; i++) {
                marca[i] = false; //inicializo el array en falso
            }
            for (int i = 1; i <= grafo.listaDeVertices().tamanio(); i++) {
                if (!marca[i]) {
                    dfs(i, grafo, marca, camino);
                }
            }
        }
        return camino;
    }

    private void dfs(int i, Grafo<T> grafo, boolean[] marca, ListaGenerica<Vertice<T>> camino) {
        marca[i] = true;
        Vertice<T> v = grafo.listaDeVertices().elemento(i);
        camino.agregarFinal(v);
        ListaGenerica<Arista<T>> ady= grafo.listaDeAdyacentes(v);
        ady.comenzar();
        while (!ady.fin()) {
            int j = ady.proximo().verticeDestino().getPosicion();
            if (!marca[j]) {
                dfs(j,grafo,marca,camino);
            }
        }
    }
    
    public ListaGenerica<Vertice<T>> bfs(Grafo<T> grafo) {
        ListaGenerica<Vertice<T>> camino = new ListaEnlazadaGenerica<>();
        if (!grafo.esVacio()){
            boolean [] marca = new boolean [grafo.listaDeVertices().tamanio()+1];
            for (int i=1; i<= marca.length ; i++){
               marca[i] = false; //inicializo el vector en falso
            }
            for (int i=1; i<= marca.length; i++){
                if (!marca[i]) {
                    bfs(i, grafo, marca, camino);
                }
            }
        }
        return camino;
    }
    private void bfs(int i, Grafo<T> grafo, boolean[] marca, ListaGenerica<Vertice<T>> camino){
        marca[i] = true;
        ListaGenerica<Arista<T>> ady = null;
        ColaGenerica<Vertice<T>> cola = new ColaGenerica<>();
        cola.encolar(grafo.listaDeVertices().elemento(i));
        while (!cola.esVacia()) {
            Vertice<T> v= cola.desencolar();
            camino.agregarFinal(v);
            System.out.println(v.dato()); //aca mostramos el dato contenico capaz sin .dato muestra algo no se
            ady = grafo.listaDeAdyacentes(v);
            ady.comenzar();
            while (!ady.fin()) {
                Arista<T> a = ady.proximo();
                int j = a.verticeDestino().getPosicion();
                if (!marca[j]) {
                    Vertice<T> w = a.verticeDestino();
                    marca[j]=true;
                    cola.encolar(w);
                }
            }
        }
    }
    
}
