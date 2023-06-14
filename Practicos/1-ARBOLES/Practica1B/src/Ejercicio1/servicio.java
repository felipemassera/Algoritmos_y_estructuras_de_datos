package Ejercicio1;

public class servicio {
    public static void aFor(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println("numero: " + (i));
            }
        } else if (b > a) {
            for (int i = b; i <=a; i++) {
                System.out.println("numero: " + (i));
            }
        }
    }

    public static void bWhile(int a, int b) {
        int i = 0;
        if (a > b) {
            int diferencia = a - b + 1;
            while (i != (diferencia)) {
                System.out.println("numero: " + (b++));
                i++;
            }
        } else if (b > a) {
            int diferencia = b - a +1;
            while (i != (diferencia)) {
                System.out.println("numero: " + (a++));
                i++;
            }
        }
    }
    public static void cRecursion(int a, int b) {
       if (a<b){
        System.out.println(a);
        cRecursion((a+1), b);
       } else if (a>b){
        System.out.println(b);
        cRecursion(a, (b+1));
       }else{
        System.out.println(a);
       }
       }
    
    public static void menu(){
           System.out.println("Que tarea desea realizar? \n"
                   +"1- bucle for \n"
                   +"2- bucle while \n"
                   + "3-Recursion \n"
                   + "4- salir");
       }   
}
