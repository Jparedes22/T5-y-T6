package LlamadasHerencia;

public final class LlamadasProvinciales extends Llamadas {

    public LlamadasProvinciales(long numOrigen, long numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
        this.coste = calcularCostes();
    }

    @Override
    public double calcularCostes() {
        return this.coste = duracion * 0.15;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }
}
