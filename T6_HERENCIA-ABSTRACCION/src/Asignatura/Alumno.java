package Asignatura;

public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int a1, int a2, int a3){
       this.asignatura1 = new Asignatura(a1);
       this.asignatura2 = new Asignatura(a2);
       this.asignatura3 = new Asignatura(a3);
    }

    //METODOS GETTER

    public Asignatura getAsignatura1(){
       return asignatura1;
    }

    public Asignatura getAsignatura2(){
       return asignatura2;
    }

    public Asignatura getAsignatura3(){
       return asignatura3;
    }

    @Override //ES UN DECORADOR EL @, SIEMPRE QUE VEAMOS UN @ HACE REFERENCIA  A ALGO
    public String toString() {
        return "ESTE ES UN ALUMNO";
    }
}

