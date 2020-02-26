import Trigonometria.Circulo;
import Trigonometria.Cuadrado;
import Trigonometria.Triangulo;

import java.util.Scanner;

public class EntradaTrigonometria {

    public static void main(String[] args) {
        Triangulo miTri = new Triangulo();
        Circulo miCir = new Circulo();
        Cuadrado miCuad = new Cuadrado();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionT;
        int opcionC;
        int opcionCuad;

        do {
            System.out.println("1. Trabajar con triangulo");
            System.out.println("2. Trabajar con círculo");
            System.out.println("3. Trabajar con cuadrado");
            System.out.println("4. Salir");
            System.out.println("Introduce la opcion que quieras");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //TRIANGULO
                    do {
                        System.out.println("Introuce base");
                        int base = sc.nextInt();
                        System.out.println("Introduce altura");
                        int altura = sc.nextInt();
                        System.out.println("1. Calcular área");
                        System.out.println("2. Mostrar datos");
                        System.out.println("3. Salir");
                        System.out.println("Introduce la opción que quieras");
                        opcionT = sc.nextInt();
                        switch (opcionT) {
                            case 1:
                                miTri.calcularArea();

                                break;
                            case 2:
                                System.out.printf("La base es %d %n", base);
                                System.out.printf("La altura es %d %n", altura);

                                break;
                            case 3:
                                System.out.println("Saliendo...");

                                break;
                            default:
                                System.out.println("Introduce una opción válida");
                        }
                    } while (opcionT != 3);

                    break;
                case 2:
                    // CIRCULO
                    System.out.println("Introduce radio");
                    int radio = sc.nextInt();
                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular diametro");
                    System.out.println("3. Mostrar datos");
                    System.out.println("4. Salir");
                    opcionC = sc.nextInt();
                    switch (opcionC) {
                        case 1:
                            miCir.calcularArea();
                            break;
                        case 2:
                            miCir.calcularDiametro();
                            break;
                        case 3:
                            System.out.printf("El radio es: %d %n", radio);
                            break;
                        case 4:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Introduce una opción válida");
                            break;

                    }
                    break;
                case 3:
                    //CUADRADO
                    System.out.println("Introduce la base");
                    int baseC = sc.nextInt();
                    System.out.println("Introduce la altura");
                    int alturaC = sc.nextInt();

                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular perímetro");
                    System.out.println("3. Mostrar datos");
                    System.out.println("4. Salir");
                    System.out.println("¿Qué operación quieres hacer?");
                    opcionCuad = sc.nextInt();
                    switch (opcionCuad) {
                        case 1:
                            miCuad.calcularArea();
                            break;

                        case 2:
                            miCuad.calcularPerimetro();
                            break;

                        case 3:
                            System.out.printf("La base es %d %n", baseC);
                            System.out.printf("La altura es %d %n", alturaC);
                            break;

                        case 4:
                            System.out.println("Saliendo...");
                            break;

                        default:
                            System.out.println("Introduce una opción válida");
                            break;

                    }

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opcion correcta");
            }
        } while (opcion != 4);
    }
}
