package Ejercicio1;
public class Ej1 {

/*Ejercicio 1
Teniendo en cuenta las dos representaciones de grafos: Matriz de Adyacencias y Lista de Adyacencias.
a. Bajo qué condiciones usaría una Matriz de Adyacencias en lugar de una Lista de Adyacencias para representar un grafo.
    Y una Lista de Adyacencias en lugar de una Matriz de Adyacencias. Fundamentar.
b. ¿En función de qué parámetros resulta apropiado realizar la estimación del orden de ejecución para algoritmos sobre
    grafos densos? ¿Y para algoritmos sobre grafos dispersos? Fundamentar.
c. Si representamos un grafo no dirigido usando una Matriz de Adyacencias, ¿cómo sería la matriz resultante? Fundamentar.

RESPUESTAS : -------------------------------------------------------------------------------------------------------------------------

a- (Matriz de adyascencias) Sirve para grafos con numero pequeño de vertices, o para grafos densos.
    ~Cuando tenemos gran cantidad de vertices, nuestra matriz seria muy grande (ya que ocupa un numero total de Vertices²),
    ~cuando el grafo no es denso, en la matriz tendriamos mucho espacio sin utilizar;
   
   (Lista de adyascencias) Sirve para grafos que tienen la particularidad de tener (aristas < (Vertices)²).
    ~Sirve para aprovechar el espacio en memoria, solo ocupamos lo que necesitamos. La desventaja que tenemos es que debemos
        recorrer la lista para saber donde y que elementos hay en cada posicion.

b- Para realizar la estimación del orden de ejecución de algoritmos sobre grafos densos, se deben considerar los siguientes parámetros:
    1. Número de nodos (vértices): En grafos densos, el número de nodos tiende a ser grande. Por lo tanto, los algoritmos que dependen
        linealmente del número de nodos tendrán un mayor tiempo de ejecución en grafos densos. Por ejemplo, algoritmos de recorrido como 
        DFS (Búsqueda en Profundidad) y BFS (Búsqueda en Anchura) pueden tener un rendimiento más lento en grafos densos debido a la cantidad
        de nodos a visitar.
    2. Número de aristas: En grafos densos, el número de aristas tiende a ser cercano al máximo posible (completo). Los algoritmos que tienen
        una complejidad cuadrática o cúbica en términos del número de aristas, como el algoritmo de Floyd-Warshall para encontrar todos los
        caminos más cortos, pueden tener un tiempo de ejecución significativamente mayor en grafos densos.
    3. Estructura del grafo: En grafos densos, es más probable que existan conexiones directas entre la mayoría de los pares de nodos.
        Esto implica que los algoritmos que requieren explorar todas las conexiones, como el algoritmo de Kruskal para encontrar un árbol 
        de expansión mínima, pueden tener un rendimiento más lento en grafos densos debido a la mayor cantidad de operaciones necesarias
        para procesar todas las aristas.

En contraste, para algoritmos sobre grafos dispersos, los siguientes parámetros son relevantes:
    
    1. Número de nodos: En grafos dispersos, el número de nodos puede ser grande o pequeño. Sin embargo, como la densidad de aristas es baja,
        los algoritmos que dependen linealmente del número de nodos pueden tener un rendimiento relativamente mejor en comparación con grafos
        densos. Por ejemplo, algoritmos de recorrido como DFS y BFS pueden ser más eficientes en grafos dispersos debido a la menor cantidad de
        nodos a visitar.
    2. Número de aristas: En grafos dispersos, el número de aristas es significativamente menor en comparación con el número máximo posible de
        aristas. Esto implica que los algoritmos con complejidad cuadrática o cúbica en términos del número de aristas, como el algoritmo de
        Floyd-Warshall, pueden tener un tiempo de ejecución más rápido en grafos dispersos debido a la menor cantidad de operaciones necesarias.
    3. Estructura del grafo: En grafos dispersos, es más probable que existan regiones aisladas o componentes conectados de manera esporádica.
        Los algoritmos que se benefician de la estructura dispersa, como los algoritmos de búsqueda de componentes fuertemente conectados,
        pueden tener un rendimiento más rápido en grafos dispersos debido a la menor cantidad de operaciones necesarias para procesar regiones
        aisladas.

En resumen, los algoritmos sobre grafos densos tienden a verse afectados por el mayor número de nodos, aristas y conexiones directas,
lo que puede aumentar el tiempo de ejecución. Por otro lado, los algoritmos sobre grafos dispersos pueden beneficiarse de la menor cantidad de nodos,
aristas y conexiones directas, lo que puede resultar en un tiempo

c- Al ser una matriz basado en un GRAFO no dirigido, podriamos apreciar un matriz espejada  tomando en cuenta la diagonal mayor de la matriz. 
    Si vos tenes una arista que conecta dos vertices , se debe marcar dos veces, una por el camino de ida (Ejemplo :  de A a B) y otro cuando vuelve
    (de B a A). 
      a b c
    a - 1 -
    b 1 - -
    c - - -
*/}
