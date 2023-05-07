package Ejercicio7Tomi;
import Class.ArbolBinario;

public class Parcial {
    public Integer sumaImparesPosOrdenMayorA(ArbolBinario<Integer> a,int limite){
        Integer respuesta=-111;
        if (!a.esVacio()) {
            respuesta = resolver(a,limite);
        }
        return respuesta;
    }
    //POSORDEN I D R
    private Integer resolver(ArbolBinario<Integer> a,int limite){
        Integer suma =0;
        if (!a.esHoja()) {
            if (a.tieneHijoIzquierdo()) {
               suma+= resolver(a.getHijoIzquierdo(), limite);
            }
            if (a.tieneHijoDerecho()) {
               suma+= resolver(a.getHijoDerecho(), limite);
            }
        }
        if ((a.getDato()%2==1)&&(a.getDato()>limite)) {
            suma+=a.getDato();
        }
        return suma;
    }
}
