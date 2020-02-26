package MultimediaHerencia;

public final class Libro extends Multimedia {

    protected int numPaginas, ISBN;

    public Libro(int id, int tamaño, String titulo, String descripcion, String autor, int numPaginas, int ISBN) {
        super(id, tamaño, titulo, descripcion, autor);
        this.numPaginas = numPaginas;
        this.ISBN = ISBN;
    }

    //METODOS SETTER

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    //METODOS GETTER

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    //METODOS

    public void mostrarDatos() {
        System.out.println("ID: " + id + " Tamaño: " + tamaño + " Titulo: " + titulo + " Formato: " + formato + " Autor: " + autor+ " Nº Paginas: "+numPaginas+" ISBN: "+ISBN);
    }
}
