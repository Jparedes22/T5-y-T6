package Llamadas;

public class LlamadaNacional extends Llamada {

    private int destino;
    private double coste;

    public LlamadaNacional() {
        this.destino = 0;
        this.coste = 0.0;
    }

    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, int destino) {
        super(numeroOrigen, numeroDestino, duracion);
        this.destino = destino;
        this.coste = calcularCoste(destino);
    }

    //METODOS GETTER


    public int getDestino() {
        return destino;
    }

    public double getCoste() {
        return coste;
    }

    //METODOS SETTER


    public void setDestino(int destino) {
        this.destino = destino;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    //METODOS

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " ||  DESTINO: " + destino + "  ||  COSTE:  €" + coste;
    }

    public double calcularCoste(int destino) {
        if (destino == 1) {
            this.coste = (duracion * 0.4) + 0.7;
        } else if (destino == 2) {
            this.coste = (duracion * 0.5) + 0.7;
        } else if (destino == 3) {
            this.coste = (duracion * 0.6) + 0.7;
        } else {
            System.out.println("Ese destino no esta disponible");
        }
        return this.coste;
    }


}

