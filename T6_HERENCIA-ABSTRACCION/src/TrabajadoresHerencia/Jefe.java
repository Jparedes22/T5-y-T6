package TrabajadoresHerencia;

public final class Jefe extends Trabajador {

    private int acciones;
    private double benefio;

    public Jefe(String nombre, String apellido, String dni, int acciones, double benefio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.benefio = benefio;
    }

    //METODOS GETTER

    public int getAcciones() {
        return acciones;
    }

    public double getBenefio() {
        return benefio;
    }

    //METODOS SETTER

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public void setBenefio(double benefio) {
        this.benefio = benefio;
    }

    //METODOS


    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Beneficios: %.2f€ Acciones: %d", benefio, acciones);
    }

    public void despedirTrabajador(TrabajadorNoJefe trabajador) {
        trabajador.setContratado(false);
    }
}
