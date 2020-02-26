package LlamadasHerencia;

public abstract class Llamadas {

    protected long numOrigen, numDestino;
    protected int duracion;
    protected double coste;

    public Llamadas(long numOrigen, long numDestino, int duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
    }

    //METODOS GETTER

    public long getNumOrigen() {
        return numOrigen;
    }

    public long getNumDestino() {
        return numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCoste() {
        return coste;
    }
    //METODOS SETTER

    public void setNumOrigen(long numOrigen) {
        this.numOrigen = numOrigen;
    }

    public void setNumDestino(long numDestino) {
        this.numDestino = numDestino;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    //METODOS

    public String mostrarDatos(){
        return String.format("Num.Origen: %d || Num.Destino: %d || Duracion: %d || Coste: %.2f€",numOrigen,numDestino,duracion,coste);
    }

    public abstract double calcularCostes();
}
