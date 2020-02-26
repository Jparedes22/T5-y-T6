package TrabajadoresHerencia;

import java.util.Scanner;

public class EntradaTrabajadores {

    public static void main(String[] args) {
        Empresa plantilla = new Empresa();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int tipoTrabajdor = 0;
        int opcionListar = 0;

        do {
            System.out.println("1. Registrar un trabajador");
            System.out.println("2. Listar trabajadores");
            System.out.println("3. Buscar un trabajador");
            System.out.println("4. Salir");
            System.out.print("Escoja la opcion que desee: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("1. Jefe");
                        System.out.println("2. Asalariado");
                        System.out.println("3. Autonomo");
                        System.out.print("Introduzca tipo de trabajador: ");
                        tipoTrabajdor = teclado.nextInt();
                        switch (tipoTrabajdor) {
                            case 1:
                                System.out.print("Introduza el nombre: ");
                                String nombre = teclado.next();
                                System.out.print("Introduza el apellido: ");
                                String apellido = teclado.next();
                                System.out.print("Introduza el dni: ");
                                String dni = teclado.next();
                                System.out.print("Introduza el beneficio: ");
                                double beneficio = teclado.nextDouble();
                                System.out.print("Introduza el numero de acciones: ");
                                int numAciones = teclado.nextInt();
                                Jefe jefe = new Jefe(nombre, apellido, dni, numAciones, beneficio);
                                plantilla.agrearTrabajador(jefe);
                                break;
                            case 2:
                                System.out.print("Introduza el nombre: ");
                                nombre = teclado.next();
                                System.out.print("Introduza el apellido: ");
                                apellido = teclado.next();
                                System.out.print("Introduza el dni: ");
                                dni = teclado.next();
                                System.out.print("Introduza el sueldo: ");
                                double sueldo = teclado.nextDouble();
                                System.out.print("Introduza el numero de pagas: ");
                                int numPagas = teclado.nextInt();
                                Asalariado asalariado = new Asalariado(nombre, apellido, dni, sueldo, numPagas);
                                plantilla.agrearTrabajador(asalariado);
                                break;
                            case 3:
                                System.out.print("Introduza el nombre: ");
                                nombre = teclado.next();
                                System.out.print("Introduza el apellido: ");
                                apellido = teclado.next();
                                System.out.print("Introduza el dni: ");
                                dni = teclado.next();
                                System.out.print("Introduza el sueldo: ");
                                sueldo = teclado.nextDouble();
                                Atonomo atonomo = new Atonomo(nombre, apellido, dni, sueldo);
                                plantilla.agrearTrabajador(atonomo);
                                break;
                            default:
                                System.out.println("Escoja una de las opciones validas");
                                break;
                        }
                    } while (tipoTrabajdor < 1 || tipoTrabajdor > 4);
                    break;
                case 2:
                    do {
                        System.out.println("1. Jefe");
                        System.out.println("2. Asalariado");
                        System.out.println("3. Autonomo");
                        System.out.println("4. Todos");
                        System.out.print("Introduzca tipo de trabajador: ");
                        tipoTrabajdor = teclado.nextInt();
                        switch (tipoTrabajdor) {
                            case 1:
                                String clase = "Jefe";
                                plantilla.listarTrabajadores(clase);
                                break;
                            case 2:
                                clase = "Asalariado";
                                plantilla.listarTrabajadores(clase);
                                break;
                            case 3:
                                clase = "Atonomo";
                                plantilla.listarTrabajadores(clase);
                                break;
                            case 4:
                                clase = "Todos";
                                plantilla.listarTrabajadores(clase);
                                break;
                            default:
                                System.out.println("Escoja una de las opciones validas");
                                break;
                        }
                    } while (tipoTrabajdor < 1 || tipoTrabajdor > 4);
                    break;
                case 3:
                    System.out.print("Introduza el dni: ");
                    String dni = teclado.next();
                    plantilla.listarPersona(dni);
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }
        } while (opcion != 4);
    }
}
