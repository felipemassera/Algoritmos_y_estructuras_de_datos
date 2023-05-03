

public class parcial{
    public integer resolver(arbolgeneral<integer> arbol){
        integer total = null;
        if (!arbol.esVacio()){
           Totales tot = new Totales();
            resolver2(arbol,tot);
            if ((tot.getPositivo() + tot.getNegativo())%2 ==0 ){
                total = tot.getPositivo;
            }else{ total = tot.getNegativo}
        }
        return total;
    }
    private class Totales{
        private integer positivo =0;
        private integer negativo =0;
        
        public  Totales(){
        }
        public getPositivo(){
            return positivo;
        }
        public getNegativo(){
            return negativo;
        }
        public sumarPositivo(integer a){
            this.positivo = this.positivo + a;
        }
        public sumarNegativo(integer a){
            this.negativo = this.negativo + a;
        }
    }
    public void resolver2(arbolgeneral<integer> arbol, Totales tot){

        if(arbol.TieneHijos()){
            ListaGenerica <arbolgeneral<Integer>> h = arbol.getHijos();
            h.comenzar();
            while (!h.Fin()){
               resolver2(h.proximo(),tot);  //quedeberia devolver el llamado ?
            }
        }
        if (arbol.getDato()>0){
            tot.sumarPositivo(arbol.getDato());
        }else{
            tot.sumarNegativo(arbol.getDato());
        } 
    }
}