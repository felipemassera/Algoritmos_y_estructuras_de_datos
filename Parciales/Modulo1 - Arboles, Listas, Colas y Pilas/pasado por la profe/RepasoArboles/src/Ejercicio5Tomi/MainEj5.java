package Ejercicio5Tomi;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class MainEj5 {

    public static void main(String[] args) {

        ListaGenerica<ArbolGeneral<Character>> l = new ListaEnlazadaGenerica<>();
        ArbolGeneral<Character> a1 = new ArbolGeneral<>('A');
        a1.agregarHijo(new ArbolGeneral<Character>('S'));
        a1.agregarHijo(new ArbolGeneral<Character>('U'));
        ArbolGeneral<Character> a2 = new ArbolGeneral<>('N');
        ArbolGeneral<Character> b1 = new ArbolGeneral<>('W');
        l.agregarFinal(a1);
        l.agregarFinal(a2);
        ListaGenerica<ArbolGeneral<Character>> l2 = new ListaEnlazadaGenerica<>();
        l2.agregarFinal(b1);
        ArbolGeneral<Character> c1 = new ArbolGeneral<>('P');//es A

        c1.agregarHijo(new ArbolGeneral<Character>('S'));//estos se rompen
        c1.agregarHijo(new ArbolGeneral<Character>('V'));

        ArbolGeneral<Character> c2 = new ArbolGeneral<>('Q');
        ListaGenerica<ArbolGeneral<Character>> l3 = new ListaEnlazadaGenerica<>();
        l3.agregarFinal(c1);
        l3.agregarFinal(c2);
        ArbolGeneral<Character> a3 = new ArbolGeneral<>('A', l2);
        ArbolGeneral<Character> b2 = new ArbolGeneral<>('S', l3); //S
        l.agregarFinal(a3);
        l2.agregarFinal(b2);

        ArbolGeneral<Character> r = new ArbolGeneral<>('C', l);

        r.porNiveles();
        System.out.println("");
        
        System.out.println("Posorden");
        r.posOrden();
        System.out.println("");
        System.out.println("Inorden");
        r.inOrden();
        
        

        Parcial p = new Parcial();
        ListaGenerica<ListaGenerica<Character>> listas = p.caminosPares(r);

        while (!listas.fin()) {

            System.out.println(listas.proximo());
        }
    }

}
