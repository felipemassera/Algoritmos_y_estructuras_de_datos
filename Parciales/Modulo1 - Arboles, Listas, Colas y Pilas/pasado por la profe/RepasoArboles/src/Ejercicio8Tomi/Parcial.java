


package Ejercicio8Tomi;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;


public class Parcial {
    
    private ArbolGeneral<Integer> a;
    
    public Parcial(ArbolGeneral<Integer> arbol){
        this.a = arbol;
    }
    
    public ListaGenerica<Integer> resolver(){
        ListaGenerica<Integer> l = new ListaEnlazadaGenerica<>();
        if (!this.a.esVacio() ) {
            resolver(this.a, l);
        }
        return l;
    }
    
    private void resolver(ArbolGeneral<Integer>a , ListaGenerica<Integer>l){
        
        if (!a.esHoja()) {
            int sumatoria=0;
            ListaGenerica<ArbolGeneral<Integer>> h = a.getHijos();
            h.comenzar();
            
            while (!h.fin()) {
                ArbolGeneral<Integer> aux = h.proximo();
                resolver(aux,l);
                sumatoria +=aux.getDato();    
            }
            if (h.tamanio()%2==1) {
                l.agregarFinal(sumatoria);
            }
        }
    }
}