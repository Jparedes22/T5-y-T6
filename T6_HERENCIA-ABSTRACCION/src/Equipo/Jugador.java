package Equipo;

public class Jugador {

    private String nombre, posicion;
    private boolean estrella;
    private int calidad;

    public Jugador() {
        this.nombre = "";
        this.posicion = "";
        this.calidad = 0;
        if (calidad>90){
            this.estrella = true;
        }

    }

    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.estrella = false;
        this.calidad = calidad;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    //METODOS

    public String getDatos(){
       String  mensaje = "\nNOMBRE: %s  ||  POSICION:   %s  ||  CALIDAD:    %d  ||  ESTRELLA: %b\n";
        return String.format(mensaje,nombre,posicion,calidad,estrella);
    }
}
