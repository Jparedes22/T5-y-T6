package Agenda;

public class Persona {

    private String dni, nombre, telefono;

    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.telefono = "";
    }

    public Persona(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //METODOS GETTER

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    //METODOS SETTER

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //METODOS

    public String getDatos() {
        String mensaje = "DNI: %s   ||  NOMBRE: %s  ||  TELEFONO: %s";
        return String.format(mensaje, dni, nombre, telefono);
    }
}
