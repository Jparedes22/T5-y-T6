package LlamadasHerencia;

public final class LlamadaLocal extends Llamadas{

    public LlamadaLocal(long numOrigen, long numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
        this.coste = calcularCostes();
    }

//METODOS


    @Override
    public double calcularCostes() {
        return 0;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }
}
