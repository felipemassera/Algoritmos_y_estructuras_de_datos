


package practica3.ejercicio4;

import Class.ArbolBinario;


public class RedBinariaLlena {
    
    private ArbolBinario<Integer> arbol;

    public RedBinariaLlena() {
        this.arbol = new ArbolBinario(1);
        
        ArbolBinario<Integer> ramaI1=new ArbolBinario(2);
        ramaI1.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
        ramaI1.agregarHijoDerecho(new ArbolBinario<Integer>(5));
        
        ArbolBinario<Integer> ramaD1=new ArbolBinario(3);
        ramaD1.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
        ramaD1.agregarHijoDerecho(new ArbolBinario<Integer>(7));
        this.arbol.agregarHijoIzquierdo(ramaI1);
        this.arbol.agregarHijoDerecho(ramaD1);
    }

    public ArbolBinario<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }
    
    private Integer alturaMaxArbol(ArbolBinario<Integer> a){
        int rd=0 , ri =0;
        if (a.esHoja()){
            return 0;
        }else{
            if (a.tieneHijoIzquierdo()){
                ri= 1+ alturaMaxArbol(a.getHijoIzquierdo());
            }
            if (a.tieneHijoDerecho()){
                rd=1+alturaMaxArbol(a.getHijoDerecho());
            }
        }
        return  Math.max(ri, rd);
    }
    
    private Integer cuentaArbol(ArbolBinario<Integer> a){
        int hi=0, hd=0;
        if (a.esHoja()){
            return a.getDato();
        } else{
//          if(a.tieneHijoIzquierdo()){  
            hi= cuentaArbol(a.getHijoIzquierdo());
//          }
//          if(a.tieneHijoDerecho()){  
            hd= cuentaArbol(a.getHijoDerecho());
//          }
            return Math.max(hi,hd)+a.getDato();
        }
        //En el caso del ejercicio este no hace falta preguntar por los IF(si tiene hijos)
        //dado que es un arbol lleno
    }
    
    public Integer retardoReenvio(){
        int total=cuentaArbol(this.getArbol());
        return total;
    }    
    
    public String toString() {
        return "RedBinariaLlena{" + "arbol=" + arbol + '}';
    }   
}
