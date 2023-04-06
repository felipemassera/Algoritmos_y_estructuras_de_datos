package ListasGenericas;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
            if (this.esVacio()){
		return 0;
            }else{
                if (this.esHoja()){
                    return 1;
                }else{
                    int total=0;
                    if (!this.hijoDerecho.esVacio()) {
                        total+= this.hijoDerecho.contarHojas();
                    }
                    if (!this.hijoIzquierdo.esVacio()) {
                        total+= this.hijoIzquierdo.contarHojas();
                    }
                    return total;
                }
            }
	}
	

    public ArbolBinario<T> espejo() {
		if (this.esVacio()){   
                    return null;
                }else{
                    ArbolBinario<T> aux = new ArbolBinario(this.getDato());
                    if (!this.esHoja()){
                        if (!this.hijoIzquierdo.esVacio()){
                        aux.agregarHijoDerecho(this.hijoIzquierdo.espejo());
                        }
                        if (!this.hijoDerecho.esVacio()){
                        aux.agregarHijoIzquierdo(this.hijoDerecho.espejo());
                        } 
                    }
                    return aux;
                }
	}


	public void entreNiveles(int n, int m){
		
	}

	

}
