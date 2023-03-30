/*
 */
package ejercicio2;

import ListasGenericas.ListaEnlazadaGenerica;

public class TestListaGenerica_1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEnlazadaGenerica<Integer> le = new ListaEnlazadaGenerica();
        
        for (int i = 0; i < 10; i++) {
            le.agregarFinal(i);
        }
        le.comenzar();
        while (!le.fin()){
            System.out.println(le.proximo());
        }
    }
    
}
