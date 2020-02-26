package Llamadas;

public abstract class Llamada {

    protected long numeroOrigen, numeroDestino;
    protected double duracion;

    public Llamada() {
        this.numeroDestino = 0;
        this.numeroOrigen = 0;
        this.duracion = 0.0;
    }

    public Llamada(long numeroDestino, long numeroOrigen, double duracion) {
        this.numeroDestino = numeroDestino;
        this.numeroOrigen = numeroOrigen;
        this.duracion = duracion;
    }

    //METODOS GETTER

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public double getDuracion(){
        return duracion;
    }


    //METODOS SETTER

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public void setDuracion(double duracion){
        this.duracion = duracion;
    }


    // METODOS

    @Override
    public String toString() {
        return super.toString() + " " + numeroOrigen;
    }

    public String mostrarDatos() {
        String mensaje = "NUMERO ORIGEN: %d  ||  NUMERO DESTINO: %d ||  DURACION: %.0f segundos";
        return String.format(mensaje,numeroOrigen,numeroDestino,duracion);
    }
}
