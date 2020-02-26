package TrigonometriaHerencia;

public class Entrada {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(2,5);
        Rectangulo rectangulo = new Rectangulo(2,5);
        Circulo circulo = new Circulo(6);

        triangulo.lanzarMensaje();
        triangulo.calcularArea();

        Figura figura = new Rectangulo(24,50);
        figura.lanzarMensaje();

    }
}
