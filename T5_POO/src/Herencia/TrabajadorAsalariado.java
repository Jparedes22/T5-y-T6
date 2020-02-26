package Herencia;

public class TrabajadorAsalariado extends Persona {

    private int cuota;

    public TrabajadorAsalariado(String nombre, String apellido, String dni, int cuota){
        super(nombre,apellido,dni);
        this.cuota = cuota;
    }

    //YA NO ME SIRVE ESTE PORQUE TENGO UNO EN LA CLASE BASE PERSONA
    /*
    public void getDatos(){
        System.out.printf("Nombre: %s, Apellido:%s DNI: %s, Cuota: %d%n",nombre, apellido,dni,cuota);
    }*/

    //AHORA USARIA ESTE:

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + "cuota: "+cuota;
    }

    @Override
    public String toString() {
        return "TrabajadorAsalariado{" +
                "cuota=" + cuota +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
