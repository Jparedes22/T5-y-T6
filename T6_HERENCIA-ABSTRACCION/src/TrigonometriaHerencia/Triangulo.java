package TrigonometriaHerencia;

public final class Triangulo extends FiguraLados {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        this.area = (this.base * this.altura) / 2;
        return this.area;
    }
}
