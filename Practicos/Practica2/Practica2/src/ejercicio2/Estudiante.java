package ejercicio2;

public class Estudiante extends persona {

    int comision;
    int direccion;

    public Estudiante() {
    }

    public Estudiante(int comision, int direccion, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.comision = comision;
        this.direccion = direccion;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String tusDatos() {
        return "Estudiante: \n" + super.toString() + "comision: " + this.comision + "\n direccion: " + this.direccion + ".";
    }
}
