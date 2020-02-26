package InterfazInicial;

public final class Audio extends Elemento implements Ejecutable{

    private int duracion;
    private String soporte;

    public Audio(int identificador, int tamaño, String titulo, String autor, String formato, int duracion, String soporte) {
        super(identificador, tamaño, titulo, autor, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    //METODOS SETTER Y GETTER

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }

    //METODOS
}
