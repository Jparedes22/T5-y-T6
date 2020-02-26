package CajeroPersona;

import java.util.Scanner;

public class EntradaCajeroPersona {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Cuenta cuenta = new Cuenta();
            Persona persona = new Persona();
            Cajero cajero = new Cajero();

            int opcion = 0;

            do {
                System.out.println("\n-----------------Menu-----------------------");
                System.out.println("1- Ingresar cuenta");
                System.out.println("2- Ingresar saldo");
                System.out.println("3- Sacar dinero");
                System.out.println("4- Consultar cuenta");
                System.out.println("5- Salir");
                System.out.println("--------------------------------------------");
                System.out.print("\nIntroduzca la opcion que desea realizar: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("\nIntroduzca nombre del titular: ");
                        String nombre = teclado.next();
                        System.out.print("\nIntroduzca apellidos del titular: ");
                        String apellidos = teclado.next();
                        System.out.print("\nIntroduzca el identificador del titular: ");
                        String identificador = teclado.next();
                        System.out.print("\nIntroduzca su pin: ");
                        int pin = teclado.nextInt();
                        persona = new Persona(nombre, apellidos, identificador);
                        cuenta = new Cuenta(pin,persona);
                        cajero.agregarCuenta(cuenta,persona.getIdentificador());
                        System.out.println(cuenta.getDatos());

                        break;
                    case 2:
                        System.out.print("\nIntroduzca la cantidad de dinero que quiere ingresar: ");
                        int dinero = teclado.nextInt();
                        System.out.print("\nIntroduzca su pin: ");
                        pin = teclado.nextInt();
                        cajero.ingresarDinero(dinero,pin);

                        break;
                    case 3:
                        System.out.print("\nIntroduzca la cantidad de dinero que quiere ingresar: ");
                        dinero = teclado.nextInt();
                        System.out.print("\nIntroduzca su pin: ");
                        pin = teclado.nextInt();
                        cajero.sacarDinero(dinero,pin);

                        break;
                    case 4:
                        System.out.print("\nIntroduzca el identificador del titular: ");
                        identificador = teclado.next();
                        if (persona.getIdentificador().equals(identificador)) {
                            System.out.println(cuenta.getDatos());
                        }
                        break;
                    case 5:
                        System.out.println("Vuelva pronto");
                        break;
                    default:
                        System.out.println("Opcion no permitida");
                        break;
                }
            }while (opcion!=5);
        }
    }

