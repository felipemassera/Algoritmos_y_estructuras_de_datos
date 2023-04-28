


package Ejercicio7;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;


public class RedDeAguaPotable{
    
    private ArbolGeneral<Double> casa;

    public RedDeAguaPotable(ArbolGeneral<Double> a) {
        this.casa = a;
    }

        
    public double minimoCaudal(double caudal){
        double min= 9999;
        if (!this.casa.esVacio()) {
           min =recorrido(this.casa,caudal);   
        }
        return min;
    }
    
    private double recorrido(ArbolGeneral<Double> a, double caudal){
        double min = caudal;
        a.setDato(caudal);
        if (a.tieneHijos()) {
            ListaGenerica<ArbolGeneral<Double>> hijos = a.getHijos();
            hijos.comenzar();
            caudal = a.getDato()/ hijos.tamanio();
            while (!hijos.fin()) {
                min = Math.min(recorrido(hijos.proximo(),caudal), min);
            }
        }
        return min;
    }
    
    
}
