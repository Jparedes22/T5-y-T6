package Equipo;

import Equipo.Equipo;

public class EntradaEquipo {

    public static void main(String[] args) {
        Equipo equipoA = new Equipo("Conejos Enrojecidos");
        Equipo equipoB = new Equipo("Koalas Furiosos", 95, 93, 95);

        int ataque = 3;



        while (ataque != 0) {
            equipoA.atacar();
            equipoB.atacar();
            System.out.printf("%nEl resultado es %s %d -- %d %s %n", equipoA.getNombre(), equipoA.getGoles(), equipoB.getGoles(), equipoB.getNombre());
            ataque--;
        }

        if (equipoA.getGoles() == equipoB.getGoles()) {
            System.out.print("\nLa jornada ha terminado en empate.");
        } else if (equipoA.getGoles() > equipoB.getGoles()) {
            System.out.printf("%nEl equipo ganador de la jornada es: %s", equipoA.getNombre().toUpperCase());
        } else {
            System.out.printf("%nEl equipo ganador de la jornada es: %s", equipoB.getNombre().toUpperCase());
        }


    }

}
