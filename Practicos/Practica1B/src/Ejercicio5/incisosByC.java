package Ejercicio5;

public class incisosByC {

    private int min;
    private int max;
    private double promedio;

    public incisosByC() {
    }

    public incisosByC(int min, int max, double promedio) {
        this.min = min;
        this.max = max;
        this.promedio = promedio;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "incisoB{" + "min=" + min + ", max=" + max + ", promedio=" + promedio + '}';
    }

    public void incisoC() {
        int[] vect = new int[10];
        
    //cargo el vector
        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 25 + 1);
        }
    //muestro
        System.out.println("Muestro nuevo vector INCISO C");    
    for (int i = 0; i < vect.length; i++) {
            System.out.println((i + 1) + "- " + vect[i]);
        }
    // calculo max, min y promedio
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
        this.min = min;
        this.max = max;
        this.promedio = promedio;
    }

}
