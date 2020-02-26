package Herencia2;

public class Jefe extends Trabajador { //Al poner final nadie puede sobreescribir o cambiar esta clase

   protected int horas;

    public Jefe(String nombre, String apellido, int sueldo, int horas) {
        super(nombre, apellido, sueldo);
        this.horas = horas;
    }

    public void despedir(){
        System.out.println("despedido");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("mostrado impreso desde jefe");
    }
}
