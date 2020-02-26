package Herencia2;

public class Trabajador extends Persona{

    protected int sueldo;

    public Trabajador(String nombre, String apellido, int sueldo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }

    public Trabajador(String nombre, String apellido) {
        super(nombre, apellido);
    }

    //METODOS

    @Override
    public void mostrarDatos(){
        //super.mostrarDatos(); //Estoy llamando al metodo y de la clase persona
        System.out.println("Tambien lo llamo desde objeto trabajador");
    }


    public void mostrarDatos(String sobrecargo){ //De esta manera sobrecargo porque se llama igual pero este es otro metodo porque le he pasado parametro
        System.out.println("Tambien lo llamo desde objeto trabajador");
    }
}
