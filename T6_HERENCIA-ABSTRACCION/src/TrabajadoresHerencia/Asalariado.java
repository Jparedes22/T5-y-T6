package TrabajadoresHerencia;

public final class Asalariado extends TrabajadorNoJefe{

    private double sueldo;
    private int numeroDePagas;

    public Asalariado(String nombre, String apellido, String dni, double sueldo, int numeroDePagas) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numeroDePagas = numeroDePagas;
    }

    //METODOS GETTER

    public double getSueldo() {
        return sueldo;
    }

    public int getNumeroDePagas() {
        return numeroDePagas;
    }

    //METODOS SETTER

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setNumeroDePagas(int numeroDePagas) {
        this.numeroDePagas = numeroDePagas;
    }

    //METODOS

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Sueldo: %.2f€ Numero de pagas: %d",sueldo,numeroDePagas);
    }
}
