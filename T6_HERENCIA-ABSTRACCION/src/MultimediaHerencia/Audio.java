package MultimediaHerencia;

public final class Audio extends Multimedia {

    protected int duracion;
    protected String forma;

    public Audio(int id, int tamaño, String titulo, String descripcion, String autor, int duracion, String forma) {
        super(id, tamaño, titulo, descripcion, autor);
        this.duracion = duracion;
        this.forma = formato;
    }

    //METODOS GETTER

    public int getDuracion() {
        return duracion;
    }

    public String getForma() {
        return forma;
    }

    //METODOS SETTER

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    //METODOS

    public void mostrarDatos() {

        System.out.println("ID: " + id + " Tamaño: " + tamaño + " Titulo: " + titulo + " Formato: " + formato + " Autor: " + autor+ " Duración: "+duracion+" Forma: "+forma);
    }
}
