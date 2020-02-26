package ConsumicionAplicacion;

import ConsumicionAplicacion.Articulo;
import ConsumicionAplicacion.Cuenta;

import java.util.Hashtable;

public class EntradaConsumicionAplicacion {

    public static void main(String[] args) {

        Hashtable<Integer, Cuenta> consumicion = new Hashtable();
        int contador=0;
        //CREAR ARTICULOS
        Articulo articulo1 = new Articulo("bocadillo",2.5);
        Articulo articulo2 = new Articulo("cafe",1.2);

        Cuenta cuenta = new Cuenta(1);
        cuenta.agregarArticulo(articulo1);
        cuenta.agregarArticulo(articulo2);

        consumicion.put(cuenta.getIdentificador(),cuenta);

        System.out.println(consumicion.get(1).costeTotal());

        articulo1.setNombre("sandwich");
        articulo1.setCoste(3.5);

        System.out.println(consumicion.get(1).costeTotal());








    }
}
