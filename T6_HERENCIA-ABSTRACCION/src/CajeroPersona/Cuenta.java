package CajeroPersona;

import java.util.Hashtable;

public class Cuenta {

    private int pin;
    private double saldo;
    private Persona persona;


    public Cuenta() {
        this.pin = 0;
        this.saldo = 0.0;
        this.persona = new Persona();
    }

    public Cuenta(int pin, Persona persona) {
        this.pin = pin;
        this.saldo = 0.0;
        this.persona = persona;
    }

    //METODOS SETTER

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    //METODOS GETTER

    public int getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    //METODOS

    public String getDatos() {
        String mensaje = "\nUsuario: %s ||  Ident: %s   ||  saldo: %.2f€\n";
        return String.format(mensaje, persona.getNombre(), persona.getIdentificador(), saldo);
    }
}
