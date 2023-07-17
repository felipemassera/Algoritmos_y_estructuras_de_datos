public class Parcial() {

    public int maximoGradoDeSeparacion (Grafo<String> grafo) {
        int cant = -1;
        int cantMax = Integer.MIN_VALUE;
        if (!grafo.esVacio()){
            l = grafo.listaDeVertices();
            while (cant != 0 && !l.fin()) {
                cant = bfs(grafo, l.proximo().posicion());
                if ((cant > cantMax)||(cant==0)){
                    cantMax = cant;
                }
            }
        }
        return cantMax;
    }
 
    private int bfs (Grafo<String> grafo, int origen){
        boolean [] marca = new boolean [grafo.listaDeVertices().tamanio() + 1];
        ColaGenerica<Vertice<String>> cola = new ColaGenerica();
        ListaGenerica<Arista<String>> ady;
        Vertice<String> v = grafo.vertice(origen);
        cola.encolar(v);
        cola.encolar(null);
        marca[origen] = true;
        nivel = 0;
        cant = 0;
        while(!cola.esVacio()){
            v = cola.desencolar();
            if(v!=null){
                ady = grafo.listaDeAdyacentes(v);
                ady.comenzar();
                while(!ady.fin()){
                    int j = ady.proximo().verticeDestino().posicion();
                    if(!marca[j]){
                        cola.encolar(grafo.vertice(j));
                        marca[j]=true;
                        cant++;
                    }
                }
            }else if(!cola.esVacio){
                nivel++;
                cola.encolar(null);
            }    
        }
        if(cant != marca.length - 1){
            nivel = 0;
        }
        return nivel;
    }
    
}