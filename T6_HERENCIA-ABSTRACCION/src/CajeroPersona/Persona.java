package CajeroPersona;

import java.util.ArrayList;

public class Persona {

    private String nombre, apellido, identificador;
    private ArrayList<Cuenta> listas;

    public Persona() {
        this.nombre = "#####";
        this.apellido = "####";
        this.identificador = "####";

    }

    public Persona(String nombre, String apellido, String identificador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificador = identificador;
        this.listas = listas;
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificador() {
        return identificador;
    }
}

//METODOS



