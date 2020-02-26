package Gasolina;

import Gasolina.Coche;
import Gasolina.Gasolinera;
import Gasolina.Surtidor;

public class EntradaGasolinera {

    public static void main(String[] args) {

        Surtidor surtidor1 = new Surtidor(300,"Diesel");
        Surtidor surtidor2 = new Surtidor(500,"Gasolina");
        Surtidor surtidor3 = new Surtidor("Diesel Extra");

        Gasolinera gasolinera = new Gasolinera();

        gasolinera.getSurtidores().add(surtidor1);
        gasolinera.getSurtidores().add(surtidor2);
        gasolinera.getSurtidores().add(surtidor3);

        Coche coche = new Coche("Diesel", 80);

        coche.ponerGasolina(surtidor2,10);
        coche.ponerGasolina(surtidor1,40);
        coche.ponerGasolina(surtidor1,1000);
        surtidor2.apagarSurtidor();
        coche.ponerGasolina(surtidor2,40);


    }
}
