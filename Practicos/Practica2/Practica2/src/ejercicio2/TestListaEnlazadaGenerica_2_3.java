/*
 */
package ejercicio2;

import ListasGenericas.ListaEnlazadaGenerica;
import ejercicio2.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class TestListaEnlazadaGenerica_2_3 {

    public static void main(String[] args) {
        ListaEnlazadaGenerica<Estudiante> le = new ListaEnlazadaGenerica<Estudiante>();
        Estudiante e1 = new Estudiante(1, 525, "Ayrton", "Alvarez", "Soy_coquito@gmail.com");
        Estudiante e2 = new Estudiante(1, 198, "Francisco", "Keli", "elKelimpia@gmial.com");
        Estudiante e3 = new Estudiante(1, 2232, "Joaquin", "Gonxa", "SoyJoacoYuso@outlook.com");
        Estudiante e4 = new Estudiante(1, 488, "Ivan", "Gonza", "toyPerdido@gmial.com");        
        le.agregarFinal(e1);
        le.agregarFinal(e2);
        le.agregarFinal(e3);
        le.agregarFinal(e4);
        System.out.println("tamanio lista: "+le.tamanio());
        
        /**
         * Prueba del inciso 2.4 (Test OK)
         */
        /**
        Estudiante [] est = new Estudiante[4];
        est[0]=e1; est[1]=e1; est[2]=e3;est[3]=e4;
        System.out.println(le.agregar(est));
        System.out.println("tamanio lista: "+le.tamanio());*/
        
        Scanner leer = new Scanner(System.in);
        int num;
        try{
        
          num = leer.nextInt();
          System.out.println(num);
        
        
        
        
        } catch (Exception e){
            System.out.println("no es numero");
        }
        
    }
}
