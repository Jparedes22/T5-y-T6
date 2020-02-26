package Asignatura;

public class Profesor {

    public void ponerNotas(Alumno alumno) {
        Asignatura asignatura1 = alumno.getAsignatura1();
        Asignatura asignatura2 = alumno.getAsignatura2();
        Asignatura asignatura3 = alumno.getAsignatura3();

        asignatura1.setCalificacion(Math.random() * 10);
        asignatura2.setCalificacion(Math.random() * 10);
        asignatura3.setCalificacion(Math.random() * 10);


        /*

        alumno.getAsignatura1().setCalificacion(Math.random());
        alumno.getAsignatura2().setCalificacion(Math.random());
        alumno.getAsignatura3().setCalificacion(Math.random());

         */
    }

    public double calcularMedia(Alumno alumno) {
        Asignatura asignatura1 = alumno.getAsignatura1();
        Asignatura asignatura2 = alumno.getAsignatura2();
        Asignatura asignatura3 = alumno.getAsignatura3();

        double media = (asignatura1.getCalificacion()
                + asignatura2.getCalificacion()
                + asignatura3.getCalificacion()) / 3;

        return media;
    }
}
