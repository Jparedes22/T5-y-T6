package InterfazInicial;

public abstract class Elemento {

    protected int identificador, tamaño;
    protected String titulo, autor, formato;

    public Elemento(int identificador, int tamaño, String titulo, String autor, String formato) {
        this.identificador = identificador;
        this.tamaño = tamaño;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }

  //METODOS SETTER Y GETTER

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    //METODOS

    public String mostrarDatos(){
        String mensaje = "Identificador: %d Tamaño: %d Titulo: %s Autor: %s Formato: %s%n";
        return String.format(mensaje,identificador,tamaño,titulo,autor,formato);
    }
}
