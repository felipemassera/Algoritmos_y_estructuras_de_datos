package Caminos.PesoCaminoMasLejano;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class PesoCaminoMasLejano {
    
    public ListaGenerica<Integer> resolver(ArbolGeneral<Integer> arbol) {
        ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<>();
        if (!arbol.esVacio()) {
            int hMax = arbol.altura();
            camino = resolver(arbol, 0, hMax).getCamino();
        }
        return camino;
    }
    
    private class Datos {
        private int sumatoria;
        private ListaGenerica<Integer> camino;

        public Datos() {
            this.sumatoria = -9999;
            this.camino = new ListaEnlazadaGenerica<>();
        }

        public int getSumatoria() {
            return sumatoria;
        }

        public void setSumatoria(int sumatoria) {
            this.sumatoria = sumatoria;
        }
        public void aumentarSumatoria(int sumatoria) {
            this.sumatoria += sumatoria;
        }
        public ListaGenerica<Integer> getCamino() {
            return camino;
        }
        public void setCamino(ListaGenerica<Integer> camino) {
            this.camino = camino;
        }
        public void agregarCamino(Integer c) {
            this.camino.agregarInicio(c);
        }
    }
    private Datos resolver(ArbolGeneral<Integer> a, int nivel, int hMax) {
        Datos d = new Datos();
        if (!a.esHoja()) {
            ListaGenerica<ArbolGeneral<Integer>> h = a.getHijos();
            h.comenzar();
            while (!h.fin()) {
                Datos aux = resolver(h.proximo(), nivel + 1, hMax);
                if (aux.getSumatoria() > d.getSumatoria()) {
                    d = aux;
                }
            }
            d.agregarCamino(a.getDato());
            d.aumentarSumatoria(a.getDato());
        } else if (hMax == nivel) {
            ListaGenerica<Integer> camino = new ListaEnlazadaGenerica<>();
            camino.agregarInicio(a.getDato());
            d.setSumatoria(a.getDato());
            d.setCamino(camino);
        }
        return d;
    }
}
