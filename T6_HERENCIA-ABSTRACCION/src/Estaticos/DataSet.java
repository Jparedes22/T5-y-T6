package Estaticos;

import java.util.ArrayList;

public class DataSet {

    private ArrayList<Equipo> listaEquipos;

    public static DataSet newInstace() {

        DataSet dataset = new DataSet();
        return dataset;
    }

    public ArrayList<Equipo> getEquiposLaLiga() {
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Barcelona", 1));
        listaEquipos.add(new Equipo("Madrid", 2));
        listaEquipos.add(new Equipo("Atleti", 3));
        return listaEquipos;


    }

    public ArrayList<Equipo> getEquiposPremier() {
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("City", 1));
        listaEquipos.add(new Equipo("Liverpool", 2));
        listaEquipos.add(new Equipo("United", 3));
        return listaEquipos;


    }

    public ArrayList<Equipo> getEquiposCalcio() {
        listaEquipos = new ArrayList();
        listaEquipos.add(new Equipo("Juventus", 1));
        listaEquipos.add(new Equipo("Inter", 2));
        listaEquipos.add(new Equipo("Roma", 3));
        return listaEquipos;


    }
}
