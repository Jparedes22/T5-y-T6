package TrabajadoresHerencia;

public abstract class Trabajador {

    protected String nombre, apellido, dni;

    public Trabajador(String nombre, String apellido, String dni) {
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

    //METODOS

    public String mostrarDatos(){
        return String.format("Nombre: %s Apellido: %s dni: %s", nombre, apellido, dni);
    }
}
