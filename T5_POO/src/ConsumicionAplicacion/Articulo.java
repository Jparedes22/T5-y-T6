package ConsumicionAplicacion;

public class Articulo {

    private String nombre;
    private double coste;

    public Articulo(){
        this.nombre = "";
        this.coste = 0.0;
    }

    public Articulo(String nombre, double coste){
        this.nombre = nombre;
        this.coste = coste;
    }

    //METODOS GETTER

    public String getNombre(){
        return nombre;
    }

    public double getCoste(){
        return coste;
    }

    //METODOS SETTER

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCoste(double coste){
        this.coste = coste;
    }

    //METODOS

}
