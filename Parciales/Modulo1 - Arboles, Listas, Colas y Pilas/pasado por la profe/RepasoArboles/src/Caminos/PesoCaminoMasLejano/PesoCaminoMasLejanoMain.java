package Caminos.PesoCaminoMasLejano;

import Class.ArbolDePrueba;
import Class.ListaGenerica;

public class PesoCaminoMasLejanoMain {
    public static void main(String[] args) {
        ArbolDePrueba p= new ArbolDePrueba();
        PesoCaminoMasLejano res = new PesoCaminoMasLejano();
        ListaGenerica<Integer> camino = res.resolver(p.getArbol());
        camino.comenzar();
        System.out.println("El recorrido del camino con mas peso");
        while (!camino.fin()) {
            System.out.println(camino.proximo());
        }
    }
    
}
