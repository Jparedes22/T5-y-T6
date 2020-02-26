package Herencia;

public abstract class Persona {

    protected String nombre, apellido, dni;

    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString(){
        return super.toString() + " " + nombre;
    }

    public  String mostrarDatos(){
        String mensaje = "Nombre: %s, Apellido:%s DNI: %s";
        return String.format(mensaje,nombre,apellido,dni);
    }

}
