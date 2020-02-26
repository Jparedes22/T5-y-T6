package Asignatura;

public class Asignatura {

    private int identificador;
    private double calificacion;

    public Asignatura() {
        int identificador = 0;
        double calificacion = 0.0;
    }

    public Asignatura(int identificador) {
        this.identificador = identificador;
        calificacion = 0.0;
    }

    //METODOS GETTER

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    //METODOS SETTER

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
