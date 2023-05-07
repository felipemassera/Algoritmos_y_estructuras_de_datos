
package Ejercicio8Tomi;

import Class.ArbolDePrueba;

public class main8tomi {

    public static void main(String[] args) {
    
        ArbolDePrueba a =new ArbolDePrueba();
        
        Parcial p = new Parcial(a.getArbol());
        System.out.println(p.resolver());
    }
    
}
