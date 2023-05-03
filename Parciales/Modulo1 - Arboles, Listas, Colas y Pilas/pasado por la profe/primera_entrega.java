
public class BuscadorDeArbol {
    private ArbolGeneral<Integer> arbol;

    public Integer buscarMayorEnPostOrden(){
        Integer max = null;
        if (!this.arbol.esVacio()){
            max = resolver(arbol);
        }
        return max;
    }
    private Integer resolver(ArbolGeneral<Integer> a){
        integer max = -1;
        if (a.tieneHijos()){
            listaGenerica <ArbolGeneral<integer>> hijos = a.getHijos();
            hijos.comenzar();
            while (!hijos.fim()){
                max = Math.max (max, resolver(hijos.proximo()));
            }

        }
        return Math.max(max,a.getDato);
    }
}
