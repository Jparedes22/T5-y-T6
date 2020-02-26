package Carrera;

import Carrera.Coches;

public class EntradaCarreraCompleta {

    public static void main(String[] args) {
        Coches cocheA = new Coches();
        Coches cocheB = new Coches("ford", "123ABC", 50);
        int kilometrosEtapa = 10000;


        cocheA.setModelo("Ferrari");
        cocheA.setMatricula("111QWE");
        cocheA.setCv(50);


        do {
            cocheA.incrementarVelocidad((int) ((Math.random() * 20) + 10));
            cocheB.incrementarVelocidad((int) ((Math.random() * 20) + 10));
            if (cocheA.getKilometros() >= kilometrosEtapa || cocheB.getKilometros() >= kilometrosEtapa){
                break;
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        } while (cocheA.getKilometros() < kilometrosEtapa || cocheB.getKilometros() < kilometrosEtapa);

        System.out.println(cocheA.getDatos());
        System.out.println(cocheB.getDatos());

        if (cocheA.getKilometros() > cocheB.getKilometros()) {
            System.out.println("\nEl ganador es " + cocheA.getModelo() + " " + cocheA.getMatricula() + " con " + cocheA.getKilometros() + " km recorridos");
        } else {
            System.out.println("\nEl ganador es " + cocheB.getModelo() + " " + cocheB.getMatricula() + " con " + cocheB.getKilometros() + " km recorridos");
        }
    }
}
