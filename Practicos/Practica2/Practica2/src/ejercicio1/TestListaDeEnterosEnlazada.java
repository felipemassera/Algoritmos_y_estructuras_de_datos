/*
 */
package ejercicio1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] cadenas = new String[6];
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = Integer.toString((int)(Math.random()*10+1));
        }
        for (String ele : cadenas) {
            System.out.println(ele);
        }
        ListaDeEnterosEnlazada te = new ListaDeEnterosEnlazada();

        for (int i = 0; i < cadenas.length; i++) {
            te.agregarFinal(Integer.parseInt(cadenas[i]));
        }

        while (!te.fin()) {
            System.out.println(te.proximo());
        }
        
        te.comenzar();
        while (!te.fin()) {
            System.out.println(te.proximo());
        }
        
    }

}
