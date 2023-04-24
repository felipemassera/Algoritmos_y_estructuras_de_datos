package Ejercicio2y3;

import Class.ArbolDePrueba;
import Class.ListaGenerica;
import Class.RecorridosAG;

public class ej2y3 {
    public static void imprimirLista(ListaGenerica<Integer> l){    
        l.comenzar();
        while (!l.fin()) {
            System.out.print(" " +l.proximo());
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        ArbolDePrueba a = new ArbolDePrueba();
        Integer num =1;
        RecorridosAG ag = new RecorridosAG();
        
       /**
        * RESOLUCION DE TP EJ3
        */
        ListaGenerica<Integer>  pre = ag.numerosImparesMayoresQuePreOrden(a.getArbol(),num);
        System.out.println("////// preOrden \\\\\\\\\\\\");
        imprimirLista(pre);
        ListaGenerica<Integer> in = ag.numerosImparesMayoresQueInOrden(a.getArbol(), num);
        System.out.println("////// inOrden \\\\\\\\\\\\");
        imprimirLista(in);
        ListaGenerica<Integer> pos = ag.numerosImparesMayoresQuePostOrden(a.getArbol(),num);
        System.out.println("////// posOrden \\\\\\\\\\\\");
        imprimirLista(pos);
        ListaGenerica<Integer> niv = ag.numerosImparesMayoresQuePorNiveles(a.getArbol(),num);
        System.out.println("//////Niveles\\\\\\\\\\\\");
        imprimirLista(niv);
       

    /**
     * MODULOS IMPLEMENTADOS DENTRO DE LA CLASE DEL ARBOLGENERAL
     * b) Si ahora tuviera que implementar estos métodos en la clase ArbolGeneral <T>,
     * que modificaciones haría tanto en la firma como en la implementación de los mismos?
     */
        System.out.println("Recorrido PREORDEN");
        a.getArbol().preOrden();
        System.out.println("\n"+"Recorrido INORDEN");
        a.getArbol().inOrden();
        System.out.println("\n"+"Recorrido POSORDEN");
        a.getArbol().posOrden();
              
    }
    
}
/**
 * Ejercicio2 (TEORICO)
 * a) ¿Qué recorridos conoce para recorrer en profundidad un árbol general? Explique brevemente.
 * Los mecanismos que conozco para el recorrido de un arbol depende de comose procesa los datos de la raiz y los datos de loshijos.
 *  PreOrden (R,I,D) ,posOrden (I,D,R) e inOrden(I,R,D).
 * 
 * b) ¿Qué recorridos conoce para recorrer por niveles un árbol general? Explique brevemente.
 *  no sabe no contesta.
 * 
 * c) ¿Existe alguna diferencia entre los recorridos preorden, postorden, inorden para recorrer los árboles generales respecto de los árboles binarios? Justifique su respuesta.
 * Si exuiste la diferencia en la que en los arboles generales al contar con dos hijos el recorrido es directo por sus nodos, en cambio con un arbol 
 * general, al contar con muchos hijos el mecanismo del procesamiento de la info es diferente.  en el INORDEN x ej : se procesa el 1er hijo de la lista, la raiz
 * y luego el resto de los hijos. PRE ORDEN: Raiz y luego la lista de hijos. POS ORDEN: HIJOS luego RAIZ.
 * 
 * d) ¿Existe alguna noción de orden entre los elementos de un árbol general? Justifique su respuesta.
 *      No existe orden alguno. 
 * 
 * e) En un árbol general se define el grado de un nodo como el número de hijos de ese nodo y el grado del árbol como el máximo de los grados de los nodos del árbol. 
 * ¿Qué relación encuentra entre los Árboles Binarios sin tener en cuenta la implementación? Justifique su respuesta.
 * Que en un arbol binario como maximo el grado puede llegar a ser GRADO2, mientras que en uno general no tiene limite de hijos, o se a que su grado max
 *  GRADO N.  A Ambos arboles la cantidad max de hijos de un nodo es el GRADO del ARBOL.
 */