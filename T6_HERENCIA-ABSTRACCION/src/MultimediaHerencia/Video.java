package MultimediaHerencia;

public final class Video extends Multimedia {

    protected String director, actores;

    public Video(int id, int tamaño, String titulo, String descripcion, String autor, String director, String actores) {
        super(id, tamaño, titulo, descripcion, autor);
        this.director = director;
        this.actores = actores;
    }

    //METODOS GETTER

    public String getDirector() {
        return director;
    }

    public String getActores() {
        return actores;
    }

    //METODOS SETTER

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    //METODOS

    public void mostrarDatos() {
        System.out.println("ID: " + id + " Tamaño: " + tamaño + " Titulo: " + titulo + " Formato: " + formato + " Autor: " + autor + " Director: " + director + " Actores: " + actores);
    }
}
