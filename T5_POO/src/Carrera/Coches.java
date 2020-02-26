package Carrera;

public class Coches {

    private int cv, velocidad;
    private String matricula, modelo;
    private double kilometros;

    public Coches() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "000AAA";
        this.modelo = "sin especificar";
        this.kilometros = 0.0;
    }

    public Coches(String modelo, String matricula, int cv) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    //METODOS SETTER

    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    //METODOS GETTER

    public int getCv() {
        return cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometros() {
        return kilometros;
    }

    //METODOS

    public void incrementarVelocidad(int velocidad) {
        this.velocidad += velocidad;
        if (this.velocidad >= 180) {
            this.velocidad = 180;
            System.out.println("La velocidad maxima es 180, se ha ajustado a ese valor");
        }
        this.kilometros += this.velocidad * ((this.cv) * ((Math.random() * 9)+1));
        if (this.kilometros>10000){
            this.kilometros=10000;
        }
    }

    public void decrementarVelocidad(int velocidad) {
        this.velocidad -= velocidad;
        if (this.velocidad <= 0) {
            this.velocidad = 0;
            System.out.println("La velocidad no puede ser negativa, se ha ajustado a 0 ese valor");
        }
    }

    public void aumentarKilometros(){
        this.kilometros = this.velocidad * ((this.cv) * ((Math.random() * 9)+1));
        if (this.kilometros>10000){
            this.kilometros=10000;
        }
    }

    public void cocheParado() {
        this.velocidad = 0;
    }

    public void resetearCoche() {
        this.velocidad = 0;
        this.kilometros = 0.0;
    }

    public String getDatos() {
        String mensaje = "\nMATRICULA: %s  || MODELO: %s  ||  CV: %d  ||  VELOCIDAD:  %d  ||  KILOMETROS: %.2f\n";
        return String.format(mensaje, matricula, modelo, cv, velocidad, kilometros);
    }
}
