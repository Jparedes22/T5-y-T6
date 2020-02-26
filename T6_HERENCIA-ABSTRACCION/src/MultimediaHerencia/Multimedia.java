package MultimediaHerencia;

public abstract class Multimedia {

    protected int id, tamaño;
    protected String titulo, formato, autor;

    public Multimedia(int id, int tamaño, String titulo, String formato, String autor) {
        this.id = id;
        this.tamaño = tamaño;
        this.titulo = titulo;
        this.formato = formato;
        this.autor = autor;
    }

    //METODOS GETTER

    public int getId() {
        return id;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return formato;
    }

    public String getAutor() {
        return autor;
    }

    //METODOS SETTER

    public void setId(int id) {
        this.id = id;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.formato = descripcion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //METODOS

    public void mostrarDatos(){
        System.out.println("ID: "+id+" Tamaño: "+tamaño+" Titulo: "+titulo+" Formato: "+formato+" Autor: "+autor);
    }
}
