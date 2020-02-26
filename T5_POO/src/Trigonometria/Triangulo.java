package Trigonometria;

public class Triangulo {
    private int base, altura;
    private double area;

    public Triangulo() {

    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public double getArea() {
        return area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = (this.base * this.altura) / 2;

    }

}
