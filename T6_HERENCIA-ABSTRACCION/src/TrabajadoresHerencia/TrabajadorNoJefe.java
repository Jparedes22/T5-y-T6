package TrabajadoresHerencia;

public abstract class TrabajadorNoJefe extends Trabajador {

    protected boolean contratado;

    public TrabajadorNoJefe(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.contratado = true;
    }

    //METODOS GETTER

    public boolean isContratado() {
        return contratado;
    }

    //METODOS SETTER

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    //METODOS


    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + String.format("Contratado: %b", contratado);
    }
}
