package Agenda;

import Agenda.Agenda;
import Agenda.Persona;

import java.util.Scanner;

public class EntradaAgenda {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        Agenda agenda = new Agenda();
        Persona contacto = new Persona();
        do {
            System.out.println("\n-----------------Menu-----------------------");
            System.out.println("1- Agregar Contacto");
            System.out.println("2- Borrar Contacto");
            System.out.println("3- Editar Contacto");
            System.out.println("4- Buscar Contacto");
            System.out.println("5- Listar Contacto");
            System.out.println("6- Salir");
            System.out.println("--------------------------------------------");
            System.out.print("\nIntroduzca la opcion que desea realizar: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduzca el nombre de contacto: ");
                    String nombre = teclado.next();

                    System.out.print("Introduzca el DNI de contacto: ");
                    String dni = teclado.next();

                    System.out.print("Introduzca el telefono de contacto: ");
                    String telefono = teclado.next();

                    contacto = new Persona(dni, nombre, telefono);
                    agenda.agregarPersona(contacto);
                    break;
                case 2:
                    System.out.print("Introduzca dni de la persona: ");
                    dni = teclado.next();
                    agenda.borrarPersona(dni, contacto);
                    break;
                case 3:
                    System.out.print("Introduzca dni de la persona: ");
                    dni = teclado.next();
                    if (agenda.verificar(dni)) {
                        System.out.println("\n<- Introduzca los nuevos datos ->");
                        System.out.print("\nIntroduzca el nombre de contacto: ");
                        String nuevoNombre = teclado.next();
                        System.out.print("Introduzca el DNI de contacto: ");
                        String nuevoDni = teclado.next();
                        System.out.print("Introduzca el telefono de contacto: ");
                        String nuevoTelefono = teclado.next();
                        agenda.editarPersona(dni, nuevoDni, nuevoNombre, nuevoTelefono);
                    } else {
                        System.out.println("La persona no existe");
                    }
                    break;
                case 4:
                    System.out.print("Introduzca dni de la persona: ");
                    dni = teclado.next();

                    System.out.print("\nIntroduzca el nombre de contacto: ");
                    String nombrenuevo = teclado.next();

                    System.out.print("Introduzca el DNI de contacto: ");
                    String dninuevo = teclado.next();

                    System.out.print("Introduzca el telefono de contacto: ");
                    String telefononuevo = teclado.next();
                    agenda.buscarPersona(dni);
                    break;
                case 5:
                    agenda.listarPersona();
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida, introduzca una correcta");
                    break;

            }

        } while (opcion != 6);

    }
}
