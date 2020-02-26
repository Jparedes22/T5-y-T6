package Cajero;

import java.util.Enumeration;
import java.util.Hashtable;

public class Metodos {

    public void ingresarDinero(Hashtable<String,Cuenta> cuenta, int pin, double dinero){

        Enumeration<Cuenta> cuentas = cuenta.elements();
        while (cuentas.hasMoreElements()){
            Cuenta recorrerCuenta = cuentas.nextElement();
            if(pin==recorrerCuenta.getPin()){
                double saldo = 0.0;
                saldo = saldo+dinero;
                recorrerCuenta.setSaldo(saldo);
            }
        }
    }

    public  void registrarCuenta(Cuenta cuenta, int pin, String nombre){
        cuenta.setTitular(nombre);
        cuenta.setPin(pin);

    }

}
