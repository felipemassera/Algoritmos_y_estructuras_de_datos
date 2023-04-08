package practica3;

import ListasGenericas.ArbolBinario;

public class Practica3_ej2 {
    
    public static void main(String[] args) {
              
        ArbolBinario<Integer> invertido = new ArbolBinario<>(1);
        ArbolBinario<Integer> a = new ArbolBinario<>(1);
        ArbolBinario<Integer> hI = new ArbolBinario<>(2);
        hI.agregarHijoIzquierdo(new ArbolBinario<>(4));
        hI.agregarHijoDerecho(new ArbolBinario<>(5));
        ArbolBinario<Integer> hD = new ArbolBinario<>(3);
        hD.agregarHijoIzquierdo(new ArbolBinario<>(6));
        a.agregarHijoIzquierdo(hI);
        a.agregarHijoDerecho(hD);
//        System.out.println("------inOrden-----I-R-D");
//        a.inOrden();
//        System.out.println("------preOrden-----R-I-D");
//        a.preOrden();
//        System.out.println("------PosOrden-----I-D-R");
//        a.posOrden();
//        System.out.println("------contamos Hojas-------");
//        System.out.println(a.contarHojas());
//        System.out.println("------Invertimos-------");
//        invertido= a.espejo();
//        invertido.inOrden();
        a.entreNiveles(0,442);
    }

}
