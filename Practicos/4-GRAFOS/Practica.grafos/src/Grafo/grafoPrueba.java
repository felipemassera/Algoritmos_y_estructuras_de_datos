package Grafo;

public class grafoPrueba {

    private Grafo<String> grafo;

    public grafoPrueba() {
        Vertice<String> v1 = new VerticeImplListAdy<>("Buenos Aires");
        Vertice<String> v2 = new VerticeImplListAdy<>("Santiago");
        Vertice<String> v3 = new VerticeImplListAdy<>("Lima");
        Vertice<String> v4 = new VerticeImplListAdy<>("Asuncion");
        Vertice<String> v5 = new VerticeImplListAdy<>("Caracas");
        Vertice<String> v6 = new VerticeImplListAdy<>("La Habana");
        Vertice<String> v7 = new VerticeImplListAdy<>("Montevideo");

        Grafo<String> ciudades = new GrafoImplListAdy<>();
        ciudades.agregarVertice(v1);
        ciudades.agregarVertice(v2);
        ciudades.agregarVertice(v3);
        ciudades.agregarVertice(v4);
        ciudades.agregarVertice(v5);
        ciudades.agregarVertice(v6);
        ciudades.agregarVertice(v7);

        ciudades.conectar(v1, v2, 3);
        ciudades.conectar(v1, v3, 2);
        ciudades.conectar(v1, v7, 4);
        ciudades.conectar(v1, v4, 10);
        ciudades.conectar(v2, v4, 500);
        ciudades.conectar(v2, v6, 4);
        ciudades.conectar(v7, v4, 6);
        ciudades.conectar(v3, v4, 4);
        ciudades.conectar(v5, v6,10);
        ciudades.conectar(v5, v4,11);
        
        this.grafo=ciudades;
    }
    
    public Grafo<String> getGrafo(){
        return this.grafo;
    }
}
