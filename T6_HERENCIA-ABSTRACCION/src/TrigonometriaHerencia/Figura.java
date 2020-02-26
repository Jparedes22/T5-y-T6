package TrigonometriaHerencia;

public abstract class Figura {

    protected double area;

    public abstract double calcularArea();

    public void lanzarMensaje() {
        System.out.println("Mensaje lanzado desde la clase figura");
    }
}
