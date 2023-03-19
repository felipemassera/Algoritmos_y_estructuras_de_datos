package Ejercicio3;

public class Profesor extends persona {

    int catedra;
    String facultad;

    public Profesor() {
    }

    public Profesor(int catedra, String facultad) {
        this.catedra = catedra;
        this.facultad = facultad;
    }

    public Profesor(int catedra, String facultad, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.catedra = catedra;
        this.facultad = facultad;
    }

    public int getCatedra() {
        return catedra;
    }

    public void setCatedra(int catedra) {
        this.catedra = catedra;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String tusDatos() {
        return "Profesor: \n" + super.toString() + "catedra: " + this.catedra + "\n facultad: " + this.facultad + ".";
    }

}
