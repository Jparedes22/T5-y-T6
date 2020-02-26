package Inicial;

public class Motor {

    private int cv;
    private double cilindrada;

    public Motor(int cv, double cilindrada) {
        this.cilindrada = cilindrada;
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCv() {
        this.cv = cv;
    }

    public void setCilindrada() {
        this.cilindrada = cilindrada;
    }

}
