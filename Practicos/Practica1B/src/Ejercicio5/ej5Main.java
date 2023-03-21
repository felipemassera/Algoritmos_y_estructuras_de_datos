/*5. Dado un arreglo de valores tipo int se desea calcular el valor máximo, mínimo, y promedio en un único método. Escriba tres métodos de clase, donde respectivamente:
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de tipo arreglo).
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
 */
package Ejercicio5;

public class ej5Main {

    public static double[] incisoA(int[] vect, double[] res) {
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
        System.out.println("Promedio: " + promedio);
        res[0] = min;
        res[1] = max;
        res[2] = promedio;

        return res;
    }

    public static incisosByC metodoB(incisosByC B, int[] vect) {
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

    public static void cargarArray(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 25 + 1);
        }
    }

    public static void mostrarArray(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.println((i + 1) + "- " + vect[i]);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int[] array = new int[x];
        double[] res = new double[3];
        cargarArray(array);
        mostrarArray(array);

        //inciso A  retorno array con los datos pedidos
        incisoA(array, res);
        System.out.println("Inciso A: {" + "Min: " + (int) res[0] + " Max: " + (int) res[1] + " promedio: " + res[2] + "}");

        //inciso b (retorno un objeto con los datos)
        incisosByC B = new incisosByC();
        metodoB(B, array);
        System.out.println(B.toString());

        //inciso c (genero un objeto y utilizo metodos de instancia)
        incisosByC C = new incisosByC();
        C.incisoC();
        System.out.println("Inciso C { max: " + C.getMax() + " min: " + C.getMin() + " promedio: " + C.getPromedio() + "}");
    }
}
