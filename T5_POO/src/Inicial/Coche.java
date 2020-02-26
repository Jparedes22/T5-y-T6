package Inicial;

public class Coche {

    // variables de clase --> PROPIEDADES, CARACTERISTICAS, CUALIDADES
    private int cv, velocidad;
    private String marca, modelo, matricula;
    private Motor motor;

    public Coche() {
        this.velocidad = 0;
        this.cv = 0;
        this.marca = "generico";
        this.modelo = "generico";
        this.matricula = "generica";
    }

    public Coche(String marca, String modelo, int cv){
        this.modelo = modelo;
        this.cv = cv;
        this.marca = marca;
    }

    public Coche(String marca, String modelo, int cv, int velocidad){
        this.velocidad = velocidad;
        this.cv = cv;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public Coche(Motor motor){
        this.motor=motor;
    }

    // metodos --> ACCIONES
    public void setCv(int cv) {
        this.cv = cv;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Metodos get


    public int getCv() {
        return cv;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void getDatos() {
        String mensaje = "Marca: %s Modelo: %s CV: %d Velocida: %d";
        System.out.println(String.format(mensaje, marca, modelo, cv, velocidad));
    }

    public String getDatosDos() {
        String mensaje = "Marca: %s Modelo: %s CV: %d Velocida: %d";
        return String.format(mensaje, marca, modelo, cv, velocidad);
        //System.out.println(String.format(mensaje, marca, modelo, cv, velocidad));
    }

    private void metodoPrivado(){
        // TODO tengo que hacer lo que sea
    }
}
