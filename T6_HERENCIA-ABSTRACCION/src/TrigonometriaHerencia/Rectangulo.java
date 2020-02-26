package TrigonometriaHerencia;

public final class Rectangulo extends FiguraLados {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        this.area = this.base * this.altura;
        return this.area;
    }

    @Override
    public void lanzarMensaje() {
        System.out.println("Mensaje lanzado desde rectangulo");
    }

    public void mostrarDatosRectangulo(){
        System.out.println("Datos rectangulo");
    }
}
