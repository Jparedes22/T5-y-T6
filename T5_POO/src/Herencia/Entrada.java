package Herencia;

public class Entrada {

    public static void main(String[] args) {

        //TRES FORMAS DE CREAR PERSONA
        //Persona persona1 = new Persona("nombre", "apellido", "asd");
       // Persona persona2 = new Persona();
        TrabajadorAutonomo persona3 = new TrabajadorAutonomo("nombre", "apellido", "asd", 14,30000);
        TrabajadorAsalariado persona4 = new TrabajadorAsalariado("nombre", "apellido", "asd",300);
        //System.out.println(persona3.calcularSueldoMes());

        //persona3.getDatos();
        System.out.println(persona4.mostrarDatos());
        System.out.println(persona4.toString());



    }
}
