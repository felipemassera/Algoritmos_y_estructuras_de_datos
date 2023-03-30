package ejercicio1;

import ListasDeEnteros.ListaDeEnterosConArreglos;


public class TestListaDeEnterosConArreglos {

    public static void main(String[] args) {
        ListaDeEnterosConArreglos n1 = new ListaDeEnterosConArreglos();
     /**
     * INCISO 1.2
     */
        for (int i = 0; i < args.length; i++) {
            n1.agregarFinal(Integer.parseInt(args[i]));
        }
        while (!n1.fin()){  
            System.out.println(n1.proximo());
        }

        /**
         * INCISO 1.3
         */
        TestListaDeEnterosEnlazada te = new TestListaDeEnterosEnlazada();
    }
    
}
