package ElDeLaFoto;

import Class.ArbolBinario;
import Class.ArbolBinarioDePrueba;
import Class.ListaGenerica;

public class elDeLAFotosMain {

    public static void main(String[] args) {
        ArbolBinarioDePrueba a = new ArbolBinarioDePrueba();
        //elDeLaFotoPAR p = new elDeLaFotoPAR(a.getArbol());
        //ElDeLaFoto.elDeLaFotoPAR.Dato d = p.resolver();
        
        ElDeLaFotoIMPAR p = new ElDeLaFotoIMPAR(a.getArbol());
        ElDeLaFotoIMPAR.Dato d= p.resolver();
        
        ListaGenerica<ArbolBinario<Integer>> lista = d.getLista();
        
        lista.comenzar();
        while (!lista.fin()) {
            System.out.println(lista.proximo().getDato());
        }
        System.out.println("Numeros IMPAR: "+ d.getNumImpar());
       // System.out.println("Numeros PAR: "+ d.getNumPar());
    }
    
}
