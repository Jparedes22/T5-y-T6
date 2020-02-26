package Cajero;

import Cajero.Cuenta;
import Cajero.Metodos;

import java.util.Hashtable;
import java.util.Scanner;

public class EntradaCajero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        Metodos metodo = new Metodos();
        Hashtable<String,Cuenta> cajero = new Hashtable();
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
                    System.out.print("\nIntroduzca su pin: ");
                    int pin = teclado.nextInt();
                    break;
                case 2:
                    System.out.print("\nIntroduzca la cantidad de dinero que quiere ingresar: ");
                    int dinero = teclado.nextInt();
                    cuenta.meterDinero(dinero);
                    break;
                case 3:
                    System.out.print("\nIntroduzca la cantidad de dinero que quiere ingresar: ");
                    dinero = teclado.nextInt();
                    cuenta.sacarDinero(dinero);
                    break;
                case 4:
                    System.out.println(cuenta.getDatos());
                    break;
                case 5:
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no permitida");
                    break;
            }
        } while (opcion != 5);
    }
}


