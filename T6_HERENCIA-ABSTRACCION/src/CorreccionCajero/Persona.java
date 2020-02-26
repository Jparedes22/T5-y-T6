package CorreccionCajero;

import java.util.ArrayList;

public class Persona {
    private String nombre, apellido, dni;
    private ArrayList<Cuenta> listaCuentas;

    public Persona(String nombre, String apellido, String dni, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaCuentas = new ArrayList();
        this.listaCuentas.add(cuenta);
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.listaCuentas = new ArrayList();
    }

    public void agregarCuenta(Cuenta nuevaCuenta) {
        this.listaCuentas.add(nuevaCuenta);
    }

    public void listarCuentas() {
        double saldoTotal = 0.0;
        if (listaCuentas.isEmpty()) {
            System.out.println("La persona no tiene cuentas abiertas");
        } else {
            System.out.println("EL saldo de cada una de las cuentas es: ");
            for (Cuenta cuenta : this.listaCuentas) {
                cuenta.mostrarEstado();
                saldoTotal += cuenta.getSaldo();
            }

            System.out.printf("El saldo total de tus cuentas es: %.2f%n", saldoTotal);
        }
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }


    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }
}
