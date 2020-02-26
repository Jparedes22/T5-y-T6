package CajeroPersona;

import java.util.Enumeration;
import java.util.Hashtable;

public class Cajero {

    private Hashtable<String, Cuenta> cajero = new Hashtable();

    public void agregarCuenta(Cuenta cuenta, String identificador) {
        if (cajero.isEmpty()) {
            cajero.put(cuenta.getPersona().getIdentificador(), cuenta);
        }/* else {
            boolean existe = false;
            Enumeration<Cuenta> cuentas = cajero.elements();
            while (cuentas.hasMoreElements()){
                Cuenta listaCuentas = cuentas.nextElement();
                if (listaCuentas.getPersona().getIdentificador().toLowerCase().equals(identificador)){
                    existe = true;
                    break;
                }

                if (existe){

                }
            }
        }*/
    }

    public void ingresarDinero(double dinero, int pin) {
        if (cajero.isEmpty()) {
            System.out.println("NO hay ninguna cuenta registrada");
        } else {
            Enumeration<Cuenta> cuentas = cajero.elements();
            while (cuentas.hasMoreElements()) {
                Cuenta listaCuentas = cuentas.nextElement();
                if (listaCuentas.getPin() == pin) {
                    double saldo = 0.0;
                    saldo += dinero;
                    if (dinero > 0) {
                        listaCuentas.setSaldo(saldo);
                        System.out.println("Se ha introducido el dinero correctamente.");
                    } else {
                        System.out.println("Tienes que meter una cantidad positiva");
                    }
                }
            }
        }
    }

    public void sacarDinero(double dinero, int pin) {
        if (cajero.isEmpty()) {
            System.out.println("No hay ninguna cuenta registrada");
        } else {
            Enumeration<Cuenta> cuentas = cajero.elements();
            while (cuentas.hasMoreElements()) {
                Cuenta listaCuentas = cuentas.nextElement();
                if (listaCuentas.getPin() == pin) {
                    double saldo = listaCuentas.getSaldo();
                    if (saldo <= 0) {
                        System.out.println("No puedes sacar dinero");
                    } else {
                        saldo -= dinero;
                        listaCuentas.setSaldo(saldo);
                        System.out.println("Se ha sacado el dinero correctamente");
                    }
                }
            }
        }
    }


}

