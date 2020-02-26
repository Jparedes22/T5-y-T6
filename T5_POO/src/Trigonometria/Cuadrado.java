package Trigonometria;

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {

    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = this.base * this.altura;
    }

    public void calcularPerimetro() {
        this.perimetro = (2 * this.area) + (2 * this.base);
    }
}
