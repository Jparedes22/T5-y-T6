package Estaticos;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<Equipo> listaEquipos = DataSet.newInstace().getEquiposLaLiga();
        System.out.println("CLASIFICACIÓN LA LIGA");
        for (Equipo equipo : listaEquipos) {
            System.out.println(String.format("%d-  %s", equipo.getPosicion(), equipo.getNombre()));
        }

        listaEquipos = DataSet.newInstace().getEquiposPremier();
        System.out.println("CLASIFICACIÓN PREMIER");
        for (Equipo equipo : listaEquipos) {
            System.out.println(String.format("%d-  %s", equipo.getPosicion(), equipo.getNombre()));
        }

        listaEquipos = DataSet.newInstace().getEquiposCalcio();
        System.out.println("CLASIFICACIÓN CALCIO");
        for (Equipo equipo : listaEquipos) {
            System.out.println(String.format("%d-  %s", equipo.getPosicion(), equipo.getNombre()));
        }
    }
}
