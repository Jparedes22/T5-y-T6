package Herencia;

public class TrabajadorAutonomo extends Persona{

    //nombre, apellido, dni
    private int pagas;
    private double sueldo;
    //este es el constructor
    public TrabajadorAutonomo(String nombre, String apellido, String dni, int pagas, double sueldo){
        super(nombre, apellido, dni);
        this.pagas=pagas;
        this.sueldo = sueldo;
    }

    public double calcularSueldoMes(){
        return this.sueldo/this.pagas;
    }

    public void getDatos(){
        System.out.printf("Nombre: %s, Apellido:%s DNI: %s, Pagas: %d, Sueldo: %.2f%n", nombre, apellido,dni,pagas,sueldo);
    }
}
