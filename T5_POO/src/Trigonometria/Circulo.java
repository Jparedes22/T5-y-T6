package Trigonometria;

public class Circulo {
    private double radio, diametro, area;

    public Circulo() {

    }

    public Circulo(double radio, double diametro, double area) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcularArea() {
        this.area = Math.PI * (Math.pow(this.radio, 2));


    }

    public void calcularDiametro() {
        this.diametro = 2 * this.radio;

    }
}
