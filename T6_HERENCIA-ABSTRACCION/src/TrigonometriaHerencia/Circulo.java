package TrigonometriaHerencia;

public final class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        this.area = 2 * Math.PI * Math.pow(radio, 2);
        return area;
    }
}
