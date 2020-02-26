package Equipo;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = (int) (Math.random() * 100);
        this.nivelDefensa = (int) (Math.random() * 100);
        this.nivelCentro = (int) (Math.random() * 100);
        this.goles = 0;
        this.jugadores = new ArrayList();
    }

    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
        this.goles = 0;
        this.jugadores = new ArrayList();
    }

    //METODOS

    public boolean atacar() {
        int estimacion = (int) ((nivelAtaque * ((Math.random() * 2))) + (nivelCentro * ((Math.random() * 2))) / 2);
        if (estimacion >= 90) {
            goles++;
            return true;
        } else {
            return false;
        }
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
        boolean existe = false;
        for (Jugador player : jugadores) {
            if (player.getNombre().toLowerCase().equals(jugador.getNombre())) {
                existe = true;
                break;


                //player.getNombre() hace referencia a los nombres de los jugadores que ya tengo añadidos

                //jugador.getNombre() hace referencia al nombre que yo estoy intentando darle al nuevo juagdor
                //que quiero añadir
            }

            if (existe){
                System.out.println("este jugador ya existe");
            }else{
                this.jugadores.add(jugador);
            }
        }
    }

    public void listarDelanteros(){
        for (Jugador item:jugadores) {
            if (item.getPosicion().toLowerCase().equals("delantero")){
                System.out.println(item.getDatos());
            }
        }
    }

    //METODOS GETTER

    public int getGoles() {
        return goles;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

}
