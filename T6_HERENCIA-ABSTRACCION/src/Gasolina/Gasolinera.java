package Gasolina;

import java.util.ArrayList;

public class Gasolinera {

    private String nombre;
    private ArrayList<Surtidor> surtidores;
    private int ganancias;

    public Gasolinera(){
        this.nombre = "";
        this.surtidores= new ArrayList();
        this.ganancias = 0;
    }

    public Gasolinera(String nombre){
        this.nombre = nombre;
    }

    public int obtenerGanancias(){
        return ganancias;
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }
}
