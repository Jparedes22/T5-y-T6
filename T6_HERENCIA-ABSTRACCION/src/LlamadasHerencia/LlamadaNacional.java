package LlamadasHerencia;

public final class LlamadaNacional extends Llamadas {

    private int franja;

    public LlamadaNacional(long numOrigen, long numDestino, int duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
        this.coste = calcularCostes();
    }

    @Override
    public double calcularCostes() {

        if (this.franja == 1) {
            this.coste = 0.2 * duracion;
        } else if (this.franja == 2) {
            this.coste = 0.25 * duracion;
        } else if (this.franja == 3) {
            this.coste = 0.3 * duracion;
        }
        return this.coste;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " || Franja: " + franja;
    }
}
