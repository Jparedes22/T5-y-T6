package Cajero;

public class Cuenta {

    private int pin;
    private String titular, dni;
    private double saldo;

    public Cuenta() {
        this.pin = 0;
        this.titular = "***";
        this.dni = "****";
        this.saldo = 0.0;
    }

    public Cuenta(int pin, String titular, String dni) {
        this.pin = pin;
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0.0;
    }

    //METODOS SETTER

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //METODOS GETTER

    public int getPin() {
        return pin;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDni() {
        return dni;
    }

    //METODOS

    public void meterDinero(double dinero) {
        this.saldo += dinero;
    }

    public void sacarDinero(double dinero) {
        this.saldo -= dinero;
    }

    public String getDatos(){
        String mensaje = "\nTITULAR: %s || SALDO ACTUAL: %.2f€";
        return String.format(mensaje,titular,saldo);
    }

}
