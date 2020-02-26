package CorreccionCajero;

import java.util.Hashtable;
import java.util.Scanner;

public class EtradaCajeroCorreccion {

    public static void main(String[] args) {

       /* Cuenta cuenta = new Cuenta(1, 123,1000);
        cuenta.ingresarDinero(500);
        cuenta.sacarDinero(2000);
        cuenta.mostrarEstado();

        Persona persona = new Persona("Borja", "Apellido", "ASD", cuenta);

        Cuenta cuenta2 = new Cuenta(2, 1234, 87654);
        persona.agregarCuenta(cuenta2);

        persona.listarCuentas();

        Persona persona2 = new Persona("pepe", "manolo", "dmx");
        persona2.listarCuentas();
        */
        Scanner teclado = new Scanner(System.in);
        Hashtable<String, Persona> listaBanco = new Hashtable();
        int opcion = 0;
        int id = 0;
        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Introduce opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduzca nombre del titular: ");
                    String nombre = teclado.next();
                    System.out.print("\nIntroduzca apellidos del titular: ");
                    String apellidos = teclado.next();
                    System.out.print("\nIntroduzca el identificador del titular: ");
                    String dni = teclado.next();
                    System.out.print("\nIntroduzca su pin: ");
                    int pin = teclado.nextInt();
                    System.out.println("Introduzca su saldo de la cuneta: ");
                    double saldo = teclado.nextDouble();
                    Cuenta cuenta = new Cuenta(id, pin, saldo);
                    if (listaBanco.containsKey(dni)) {
                        Persona persona = listaBanco.get(dni);
                        persona.agregarCuenta(cuenta);
                    } else {
                        Persona persona = new Persona(nombre, apellidos, dni, cuenta);
                        listaBanco.put(persona.getDni(), persona);
                    }
                    id++;
                    break;
                case 2:
                    System.out.println("Introduzca el dni: ");
                    String dniSacar = teclado.next();
                    if (listaBanco.containsKey(dniSacar)){
                        Persona persona = listaBanco.get(dniSacar);
                        System.out.println("Introduce numero de cuenta: ");
                        int idSacar = teclado.nextInt();
                        for (Cuenta cuentaIterada :persona.getListaCuentas()) {
                            if (cuentaIterada.getId()==idSacar){
                                System.out.println("Introduzca su pin: ");
                                int pinSacar = teclado.nextInt();
                                if (cuentaIterada.getPin()==pinSacar){
                                    System.out.println("Introduce dinero a ingresar: ");
                                    int saldoSacar = teclado.nextInt();
                                    cuentaIterada.ingresarDinero(saldoSacar);
                                    persona.agregarCuenta(cuentaIterada);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el dni: ");
                    String dniMeter = teclado.next();
                    if (listaBanco.containsKey(dniMeter)){
                        Persona persona = listaBanco.get(dniMeter);
                        System.out.println("Introduce numero de cuenta: ");
                        int idMeter = teclado.nextInt();
                        for (Cuenta cuentaIterada :persona.getListaCuentas()) {
                            if (cuentaIterada.getId()==idMeter){
                                System.out.println("Introduzca su pin: ");
                                int pinMeter = teclado.nextInt();
                                if (cuentaIterada.getPin()==pinMeter){
                                    System.out.println("Introduce dinero a ingresar: ");
                                    int saldoMeter = teclado.nextInt();
                                    cuentaIterada.sacarDinero(saldoMeter);
                                    persona.agregarCuenta(cuentaIterada);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce el dni: ");
                    String dniBuscar = teclado.next();
                    if (listaBanco.containsKey(dniBuscar)){
                        Persona persona = listaBanco.get(dniBuscar);
                        persona.listarCuentas();
                    }else{
                        System.out.println("No esta registrado ese dni");
                    }
                    break;
                case 5:

                    break;

            }
        } while (opcion != 5);

    }
}
