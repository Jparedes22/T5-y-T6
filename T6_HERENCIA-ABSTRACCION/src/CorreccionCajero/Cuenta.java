package CorreccionCajero;

public class Cuenta {

    private int id, pin;
    private double saldo;

    public Cuenta(int id, int pin) {
        this.id = id;
        this.pin = pin;
    }

    public Cuenta(int id, int pin, double saldo) {
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
    }

    //METODOS SETTER


    public void setId(int id) {
        this.id = id;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS GETTER


    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    //METODOS

    public void ingresarDinero(int dineroIngresar) {
        if (dineroIngresar > 0) {
            this.saldo += dineroIngresar;
        } else {
            System.out.println("No puedes hacer la operacion");
        }
    }

    public void sacarDinero(int dineroSacar) {
        if (dineroSacar < 0 || (this.saldo - dineroSacar) < 0) {
            System.out.printf("No puedes hacer la operacion, tu saldo es de: %.2f",saldo);
        } else {
            this.saldo -= dineroSacar;
        }
    }

    public void mostrarEstado() {
        System.out.printf("El saldo de la cuenta es: %.2f€ %n", saldo);
    }
}
