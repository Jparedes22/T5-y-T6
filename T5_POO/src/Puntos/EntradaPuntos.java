package Puntos;


import java.awt.*;

public class EntradaPuntos {
    public static void main(String[] args) {

        Point punto2D = new Point();
        Punto3D punto3D = new Punto3D(5, 5, 5);
        Punto4D punto4D = new Punto4D(10, 10, 10, 10);

        System.out.println(punto2D.toString());
        System.out.println(punto3D.toString());
        System.out.println(punto4D.toString());

        punto2D.move(1,1);
        System.out.println("Movido 1,1");
        System.out.println(punto2D.toString());
        punto2D.translate(3,2);
        System.out.println("Transladado 3 2");
        System.out.println(punto2D.toString());

        punto3D.move(1,1,1);
        System.out.println(punto3D.toString());
        punto3D.translate(1,2,5);
        System.out.println(punto3D.toString());
    }


}
