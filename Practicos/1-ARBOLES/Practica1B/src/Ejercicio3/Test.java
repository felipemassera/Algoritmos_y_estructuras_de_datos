package Ejercicio3;

public class Test {

    public static void mostrarE(Estudiante[] e, int cant) {
        for (int i = 0; i < cant; i++) {
            System.out.println((i + 1) + "- " + e[i].tusDatos());
        }
    }

    public static void mostrarP(Profesor[] p, int cant) {
        for (int i = 0; i < cant; i++) {
            System.out.println((i + 1) + "- " + p[i].tusDatos());
        }
    }

    public static void cargoEstudiantes(Estudiante[] vector) {
        Estudiante e1;
        e1 = new Estudiante(1, 525, "Felipe", "Massera", "Felipemassera@gmail.com");
        vector[0] = e1;
        e1 = new Estudiante(2, 489, "Cacalibur", "Alvarez", "soy_coquito@gmail.com");
        vector[1] = e1;
    }

    public static void cargoProfesor(Profesor[] vector) {
        Profesor e1;
        e1 = new Profesor(1, "UNLP", "Ale", "Pedragoza", "soyLaCuki@gmail.com");
        vector[0] = e1;
        e1 = new Profesor(1, "Catolica", "virgi", "Marca", "virmarca@gmail.com");
        vector[1] = e1;
        e1 = new Profesor(1, "UNQUI", "Lali", "valde", "Lali_lp@gmail.com");
        vector[2] = e1;
    }

    public static void main(String[] args) {
        int e = 2, p = 3;
        Estudiante[] vectorE = new Estudiante[e];
        Profesor[] vectorP = new Profesor[p];

        //Cargo los vectores
        cargoEstudiantes(vectorE);
        cargoProfesor(vectorP);

        // Muestro los vectores
        mostrarE(vectorE, e);
        mostrarP(vectorP, p);

    }

}
