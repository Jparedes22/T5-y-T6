package Llamadas;

import java.util.Scanner;

public class EntradaLlamada {

    public static void main(String[] args) {
        Centralita centralita = new Centralita();

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n|--------------Menú-----------------|");
            System.out.println("|   1. Agregar llamada local        |");
            System.out.println("|   2. Agregar llamada nacional     |");
            System.out.println("|   3. Listar llamadas locales      |");
            System.out.println("|   4. Listar llamadas nacionales   |");
            System.out.println("|   5. Mostrar coste acumulado      |");
            System.out.println("|   6. Salir                        |");
            System.out.println("|-----------------------------------|\n");
            System.out.print("Introduzca la opcion que desea realizar: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el numero de origen: ");
                    long numeroOrigen = teclado.nextLong();
                    System.out.print("Introduzca el numero de destino: ");
                    long numeroDestino = teclado.nextLong();
                    System.out.print("Introduzca la duracion de la llamada: ");
                    double duracion = teclado.nextDouble();
                    LlamadaLocal llamadaLocal = new LlamadaLocal(numeroOrigen, numeroDestino, duracion);
                    centralita.agregarLlamadaLocal(llamadaLocal);
                    break;
                case 2:
                    System.out.print("Introduzca el numero de origen: ");
                    numeroOrigen = teclado.nextLong();
                    System.out.print("Introduzca el numero de destino: ");
                    numeroDestino = teclado.nextLong();
                    System.out.print("Introduzca la duracion de la llamada: ");
                    duracion = teclado.nextDouble();
                    int opcionDestino = 0;
                    int destino = 0;
                    do {
                        System.out.print("Introduzca destino: ");
                        opcionDestino = teclado.nextInt();
                        switch (opcionDestino) {
                            case 1:
                                destino = 1;
                                break;
                            case 2:
                                destino = 2;
                                break;
                            case 3:
                                destino = 3;
                                break;
                            default:
                                System.out.println("Destino no valido, introduzca el 1, 2 o 3");
                                break;
                        }
                    } while (opcionDestino <1 || opcionDestino >3);
                    LlamadaNacional llamadaNacional = new LlamadaNacional(numeroOrigen, numeroDestino, duracion, destino);
                    centralita.agregarLlamadaNacional(llamadaNacional);
                    break;
                case 3:
                    centralita.listarLocales();
                    break;
                case 4:
                    centralita.listarNacionales();
                    break;
                case 5:
                    centralita.mostrarCostes();
                    break;
                case 6:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida, escoja otra.");
                    break;

            }
        } while (opcion != 6);
    }
}
