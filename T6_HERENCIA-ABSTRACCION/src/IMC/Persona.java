package IMC;

public class Persona {

    private String nombre, dni, sexo;
    private double peso, altura;
    private int edad;

    public Persona(){
        this.nombre = "Defecto";
        this.dni = "Defecto";
        this.sexo = "Defecto";
        this.peso = 0.0;
        this.altura = 0.0;
        this.edad = 0;
    }

    public Persona(String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, String dni, String sexo, double peso, double altura, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    //METODOS SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODOS GETTER

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }


    //METODOS

    public int calcularIMC(){
        double pesoIdeal = (this.peso/(Math.pow(this.altura,2)));
        if (pesoIdeal<20){
            System.out.println("Estas por debajo del peso recomendado");
            return -1;
        }else if(pesoIdeal>=20 || pesoIdeal<25){
            System.out.println("Estas en el peso ideal");
            return 0;
        }else{
            System.out.println("Estas por encima del peso ideal");
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        if (this.edad>=18){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }

    public String getDatos(){
        return toString();
    }
}
