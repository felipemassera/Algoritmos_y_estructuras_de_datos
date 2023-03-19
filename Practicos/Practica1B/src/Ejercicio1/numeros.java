package Ejercicio1;

public class numeros {

    int num1;
    int num2;

    public numeros() {
    }

    public numeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String toString(int a, int b) {
        if (a != b) {
            return ("entre el numero 1: [" + a + "] y el numero 2: [" + b + "] imprimo faltantes: ");
        } else {
            return ("Los numeros son iguales, no hay numeros en medio de ellos para imprimir");
        }
    }

    public static void aFor(int a, int b) {
        System.out.println("Inciso A --> FOR");
        if (a > b) {
            int diferencia = a - b;
            for (int i = 0; i < (diferencia + 1); i++) {
                System.out.println("numero: " + (b++));
            }
        } else if (b > a) {
            int diferencia = b - a;
            for (int i = 0; i < (diferencia + 1); i++) {
                System.out.println("numero: " + (a++));
            }
        }
    }

    public static void bWhile(int a, int b) {
        System.out.println("Inciso B --> WHILE");
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
    public static void cNada(int a, int b) {
       System.out.println("Inciso C --> sin bucles no se me ocurre sin que quede horrendo");
       if (a>b){
           System.out.println("numero "+ b++);
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);}
           if (b!=a){System.out.println("numero "+ b++);} else{System.out.println("numero "+b);} 
       }else{
           System.out.println("numero "+ a++);
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);}
           if (b!=a){System.out.println("numero "+ a++);} else{System.out.println("numero "+a);} 
       }
    }
       public static void menu(){
           System.out.println("Que tarea desea realizar? \n"
                   +"1- bucle for \n"
                   +"2- bucle while \n"
                   + "3-sin bucles \n"
                   + "4- salir");
       }   
}
