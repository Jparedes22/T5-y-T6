package Asignatura;

import Asignatura.Asignatura;
import Asignatura.Alumno;
import Asignatura.Profesor;

public class EntradaAsignatura {

    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);
        Alumno alumno2 = new Alumno(1, 2, 3);

        System.out.println(alumno.getAsignatura1().getCalificacion());

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);
        System.out.println(alumno.getAsignatura1().getCalificacion());


    }
}
