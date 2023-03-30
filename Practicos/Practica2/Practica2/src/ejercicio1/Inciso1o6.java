
import ListasDeEnteros.ListaDeEnterosEnlazada;

public class Inciso1o6 {

    public static ListaDeEnterosEnlazada calcularSucesion(int n) {
        ListaDeEnterosEnlazada le = null;
        if (n == 1) {
            le = new ListaDeEnterosEnlazada();
        } else {
            if (n % 2 == 0) {
                le=calcularSucesion(n / 2);
            } else {
                le=calcularSucesion((3 * n) + 1);
            }
        }
        le.agregarInicio(n);
        return le;
    }
    
    
    public static void calcularSucesion(ListaDeEnterosEnlazada<Integer> sucesion, Integer n){
        
    }
    public static void main(String[] args) {
        
        ListaDeEnterosEnlazada le= calcularSucesion(6);
        le.comenzar();
        while(!le.fin()){
            System.out.println(le.proximo());
        }
    }

}
