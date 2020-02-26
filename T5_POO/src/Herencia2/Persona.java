package Herencia2;

public abstract class Persona {

    protected String nombre, apellido; //Lo pongo protected para que solo lo hereden las clases que descienden de esta clase(las que son extends de Persona)

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //METODOS

    public void mostrarDatos(){
        System.out.println("Datos mostrados desde objeto persona");
    }
}
