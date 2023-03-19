package Ejercicio3;

public class persona {

    String nombre;
    String apellido;
    String email;

    public persona() {
    }

    public persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + "\n apellido: " + this.apellido + "\n email: " + this.email + "\n";
    }
}
