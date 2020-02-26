package Llamadas;

public class LlamadaLocal extends Llamada {

    private double coste;

    public LlamadaLocal() {
        this.coste = 0.0;
    }

    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion) {
        super(numeroOrigen, numeroDestino,duracion);
        this.coste = calcularCoste(duracion);
    }

    //METODOS GETTER


    public double getCoste() {
        return coste;
    }

    //METODOS SETTER


    public void setCoste(double coste) {
        this.coste = coste;
    }

    //METODOS

    public double calcularCoste(double duracion) {
        double costeTotal = 0.5 + (duracion * 0.15);
        return costeTotal;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " || COSTE: €" + coste;
    }

}
    /*public String getDatos(){
        String mensaje = "\nNUMERO ORIGEN: %l   ||  NUMERO DESTINO: %l";
    }*/

