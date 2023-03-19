package Ejercicio4;

public class ej4Main {

    public static void swap1(int x, int y) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        System.out.println("swap1 a=" + x + " b=" + y);
    }

    public static void swap2(Integer x, Integer y) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        System.out.println("swap2 c=" + x + " d=" + y);

    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        Integer c = 3, d = 4;
        System.out.println("ORIGINAL a=" + a + " b=" + b);
        System.out.println("ORIGINAL c=" + c + " d=" + d);
        swap1(a, b);
        swap2(c, d);
        System.out.println("FIN a=" + a + " b=" + b);
        System.out.println("FIN c=" + c + " d=" + d);
    }

}
/*¿Qué imprime el siguiente programa al ejecutar main?
a. Intente averiguarlo sin ejecutar el programa en su computadora.
    //no lo invierte ya que al ser datos simples los pasa por valor
    
b. Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado en el inciso anterior.
    ORIGINAL a=1 b=2
    ORIGINAL c=3 d=4
    swap1 a=2 b=1
    swap2 c=4 d=3
    FIN a=1 b=2
    FIN c=3 d=4
 */
