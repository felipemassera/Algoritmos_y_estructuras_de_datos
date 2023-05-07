package Ejercicio7;

import Class.ArbolGeneral;
import Class.ColaGenerica;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;


public class EntreNiveles {
     public ListaGenerica<Datos> resolver(int menor, int mayor, ArbolGeneral<Integer> arbol) {
        ListaGenerica<Datos> res = new ListaEnlazadaGenerica<>();
        if (!arbol.esVacio()) {
            ColaGenerica<ArbolGeneral<Integer>> cola =new ColaGenerica<>();
            ArbolGeneral<Integer> aux;
            cola.encolar(arbol);
            cola.encolar(null);
            int nivel =0;
            while (!cola.esVacia()) {
                aux = cola.desencolar();
                if (aux!=null) {
                    if ((aux.getDato()>=menor)&&(aux.getDato()<=mayor)) {
                        Datos d = new Datos(aux.getDato(),nivel);
                        res.agregarFinal(d);
                    }
                    if (!aux.esHoja()) {
                        ListaGenerica<ArbolGeneral<Integer>> h = aux.getHijos();
                        h.comenzar();
                        while (!h.fin()) {
                            cola.encolar(h.proximo());
                        }
                    }
                }else if(!cola.esVacia()){
                    cola.encolar(null);
                    nivel++;
                }
            }
        }
        return res;
    }
     
        public class Datos {

        private Integer dato;
        private Integer nivel;

        public Datos(Integer d, int nivel) {
            this.dato = d;
            this.nivel = nivel;
        }
        public Integer getDato() {
            return dato;
        }
        public Integer getNivel() {
            return nivel;
        }
        public String toString() {
            return "Datos: " + this.getDato() + ", en el nivel: " + this.getNivel();
        }
    }
}
