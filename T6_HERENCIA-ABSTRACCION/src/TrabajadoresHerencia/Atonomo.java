package TrabajadoresHerencia;

public final class Atonomo extends TrabajadorNoJefe {

    private double sueldo;

    public Atonomo(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

//METODOS GETTER

    public double getSueldo() {
        return sueldo;
    }

    public boolean isContratado() {
        return contratado;
    }

    //METODOS SETTER

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    //METODOS


    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Sueldo: %.2f€",sueldo);
    }
}
