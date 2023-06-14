


package Ejercicio2;


public class Ej2 {
/**
 Ejercicio 2
a. Responda las siguientes preguntas considerando un grafo no dirigido de n vértices. Fundamentar.
i. ¿Cuál es el mínimo número de aristas que puede tener si se exige que el grafo sea conexo?
ii. ¿Cuál es el máximo número de aristas que puede tener si se exige que el grafo sea acíclico?
iii. ¿Cuál es el número de aristas que puede tener si se exige que el grafo sea conexo y acíclico?
iv. ¿Cuál es el número de aristas que puede tener si se exige que el grafo sea completo? (Un grafo 
    es completo si hay una arista entre cada par de vértices.)
b. En un grafo dirigido y que no tiene aristas que vayan de un nodo a sí mismo, ¿Cuál es el mayor número
   de aristas que puede tener? Fundamentar.

* RESPUESTAS -----------------------------------------------------------------------------------------
    
* A)
*   I-  El minimo de aristas que se necesitan para que sea conexo, si se tiene N vertices, deberia ser Aristas = N-1;
*   II- Si permitimos que haya más de un componente conexo, entonces el número máximo de aristas se mantiene en "n-1" donde N es el num de vertices
*       para cada componente conexo. Por lo tanto, en un grafo no dirigido acíclico con "n" vértices y múltiples componentes conexas (pero no conexas
*       entre si), el número máximo de aristas es "(n(1) - 1) + (n(2) - 1) ... (n(c)-1)" , donde "c" es el número de componentes conexas.
*   III-Al igual que el punto (I) debe ser el num de aristas = N-1 ; 
*   IV- Numero maximo de aristas de grafo no dirigido (CICLICO) = (n*(n-1))/2. 

*/
}
