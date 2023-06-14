package Ejercicio5;

import Class.ArbolGeneral;
import Class.ListaEnlazadaGenerica;
import Class.ListaGenerica;

public class ArbolEmpresa {
    
    public ArbolGeneral<AreaEmpresa> ArbolEmpresa() {
//nodos nivel 1
        ArbolGeneral<AreaEmpresa> a1 = new ArbolGeneral(new AreaEmpresa("j", 13));
        ArbolGeneral<AreaEmpresa> a12 = new ArbolGeneral(new AreaEmpresa("k", 25));
        ArbolGeneral<AreaEmpresa> a13 = new ArbolGeneral(new AreaEmpresa("l", 10));
        
//nodos nivel 2
        ArbolGeneral<AreaEmpresa> b1 = new ArbolGeneral(new AreaEmpresa("A", 4));
        ArbolGeneral<AreaEmpresa> b2 = new ArbolGeneral(new AreaEmpresa("B", 7));
        ArbolGeneral<AreaEmpresa> b3 = new ArbolGeneral(new AreaEmpresa("C", 5));
        
        ArbolGeneral<AreaEmpresa> b4 = new ArbolGeneral(new AreaEmpresa("D", 6));
        ArbolGeneral<AreaEmpresa> b5 = new ArbolGeneral(new AreaEmpresa("E", 10));
        ArbolGeneral<AreaEmpresa> b6 = new ArbolGeneral(new AreaEmpresa("F", 18));
        
        ArbolGeneral<AreaEmpresa> b7 = new ArbolGeneral(new AreaEmpresa("G", 9));
        ArbolGeneral<AreaEmpresa> b8 = new ArbolGeneral(new AreaEmpresa("H", 12));
        ArbolGeneral<AreaEmpresa> b9 = new ArbolGeneral(new AreaEmpresa("I", 19));

        ListaGenerica<ArbolGeneral<AreaEmpresa>> j = new ListaEnlazadaGenerica();
        j.agregarFinal(b1);
        j.agregarFinal(b2);
        j.agregarFinal(b3);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> k = new ListaEnlazadaGenerica();
        k.agregarFinal(b4);
        k.agregarFinal(b5);
        k.agregarFinal(b6);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> l = new ListaEnlazadaGenerica();
        l.agregarFinal(b7);
        l.agregarFinal(b8);
        l.agregarFinal(b9);
 //seteo la lista de hijos en cada nodo del nivel 1
        a1.setHijos(j);
        a12.setHijos(k);
        a12.setHijos(l);
 //seteo nodos al nodo raiz
        ListaGenerica<ArbolGeneral<AreaEmpresa>> uno = new ListaEnlazadaGenerica();
        uno.agregarFinal(a1);
        uno.agregarFinal(a12);
        uno.agregarFinal(a13);
        
        ArbolGeneral<AreaEmpresa> al = new ArbolGeneral(new AreaEmpresa("m", 14));
        al.setHijos(uno);
        return al;
    }

    
}
