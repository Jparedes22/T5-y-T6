package InterfazInicial;

public final class Imagen extends Elemento implements Ejecutable{

    private String ISBN;

    public Imagen(int identificador, int tamaño, String titulo, String autor, String formato, String ISBN) {
        super(identificador, tamaño, titulo, autor, formato);
        this.ISBN = ISBN;
    }

    //METODOS SETTER Y GETTER

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
