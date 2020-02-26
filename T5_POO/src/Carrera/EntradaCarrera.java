package Carrera;

import Carrera.Coches;

public class EntradaCarrera {

    public static void main(String[] args) {

        Coches cocheA = new Coches();
        Coches cocheB = new Coches("ford", "123ABC", 50);


        cocheA.setModelo("Ferrari");
        cocheA.setMatricula("111QWE");
        cocheA.setCv(50);
        cocheA.incrementarVelocidad((int) ((Math.random() * 20) + 10));

        cocheB.incrementarVelocidad((int) ((Math.random() * 20) + 10));

        System.out.println(cocheA.getDatos());
        System.out.println(cocheB.getDatos());

        if (cocheA.getKilometros() > cocheB.getKilometros()) {
            System.out.println("\nEl ganador es " + cocheA.getModelo() + " " + cocheA.getMatricula() + " con " + cocheA.getKilometros() + " km recorridos");
        } else {
            System.out.println("El ganador es " + cocheB.getModelo() + " " + cocheB.getMatricula() + " con " + cocheB.getKilometros() + " km recorridos");
        }

        /*OTRA MANERA DE HACERLO Y CON MENOS SOUT

        Coches cocheGanador = new Coches();

        if (cocheA.getKilometros() > cocheB.getKilometros()) {
            cocheGanador = cocheA;
        } else if (cocheA.getKilometros() < cocheB.getKilometros()) {
            cocheGanador = cocheB;
        } else {
            System.out.println("Ha habido empate");
        }

        if (cocheGanador != null) {
            String mensaje = "\nMATRICULA: %s  || MODELO: %s  ||  CV: %d  ||  VELOCIDAD:  %d  ||  KILOMETROS: %.2f\n";
            System.out.println(String.format(mensaje, cocheGanador.getMatricula(), cocheGanador.getModelo(), cocheGanador.getCv(), cocheGanador.getVelocidad(), cocheGanador.getKilometros()));
        }else {
            System.out.println("Empate");
        }
        */
    }
}
