/*5. Dado un arreglo de valores tipo int se desea calcular el valor máximo, mínimo, y promedio en un único método. Escriba tres métodos de clase, donde respectivamente:
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de tipo arreglo).
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
 */
package Ejercicio5;

/**
 *
 * @author Felipe
 */
public class ej5Main {

    public static String incisoA(int[] vect) {
        int max = 0, min = 9999, total = 0, aux;

        for (int i = 0; i < vect.length; i++) {
            aux = vect[i];
            if (aux > max) {
                max = aux;
            }
            if (aux < min) {
                min = aux;
            }
            total += aux;
        }
        double promedio = (double) (total) / (double) (vect.length);
        return ("numero maximo: " + max + "\n numero minimo: " + min + "\n promedio: " + promedio);
    }

    public static incisoB metodoB(incisoB B, int[] vect) {
        int max = 0, min = 9999, total = 0, aux;

        for (int i = 0; i < vect.length; i++) {
            aux = vect[i];
            if (aux > max) {
                max = aux;
            }
            if (aux < min) {
                min = aux;
            }
            total += aux;
        }
        double promedio = (double) (total) / (double) (vect.length);
        B.setMax(max);
        B.setMin(min);
        B.setPromedio(promedio);
        return B;
    }

    public static void cargarArray(int[] vect, int x) {
        for (int i = 0; i < x; i++) {
            vect[i] = (int) (Math.random() * 25 + 1);
        }
    }

    public static void mostrarArray(int[] vect, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1) + "- " + vect[i]);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int[] array = new int[x];

        cargarArray(array, x);
        mostrarArray(array, x);
        //inciso A
        System.out.println("Inciso A: \n" + incisoA(array));
        //inciso b
        incisoB B = new incisoB();
        metodoB(B, array);
        System.out.println(B.toString());
        //inciso c
        incisoB C = new incisoB();
        C.incisoC();
        System.out.println("Inciso C \n max: "+C.getMax() +"\n min: "+C.getMin()+"\n promedio: "+C.getPromedio());
    }
}
