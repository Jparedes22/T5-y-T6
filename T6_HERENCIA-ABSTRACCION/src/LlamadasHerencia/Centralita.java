package LlamadasHerencia;

import java.util.ArrayList;

public class Centralita {

    protected ArrayList<Llamadas> listaLlamadas;

    public Centralita() {
        listaLlamadas = new ArrayList();
    }

    //METODOS

    public void registrarLlamadas(Llamadas llamadas) {
        listaLlamadas.add(llamadas);
        System.out.println("LLamada reigistrada correctamente");
    }

    public void mostrarCostes() {
        double costeTotal = 0;
        for (Llamadas llamadas : listaLlamadas) {
            costeTotal += llamadas.getCoste();
        }
        System.out.printf("El coste total es: %.2f€%n", costeTotal);
    }

    public void mostrarLlamadas() {
        for (Llamadas llamadas : listaLlamadas) {
            System.out.println(llamadas.mostrarDatos());
            System.out.println("");
        }
    }
}
