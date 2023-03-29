package ejercicio1;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class Inciso1o5 {

    public static void daloVuelta(ListaDeEnteros te) {
        if (!te.fin()) {
            int num = te.proximo();
            daloVuelta(te);
            System.out.println(num);
        }

    }

    public static void main(String[] args) {

        ListaDeEnteros le = new ListaDeEnterosConArreglos();
        le.agregarFinal(45);
        le.agregarFinal(5);
        le.agregarFinal(435545);
        daloVuelta(le);

    }

}
