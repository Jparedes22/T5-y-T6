package LlamadasHerencia;

import java.util.Scanner;

public class EntradaLlamadaHerencia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Centralita centralita = new Centralita();

        LlamadaLocal llamadaLocal = new LlamadaLocal(1,2,30);
        LlamadaNacional llamadaNacional = new LlamadaNacional(3,4,30,1);
        LlamadasProvinciales llamadasProvinciales = new LlamadasProvinciales(5,7,60);


        centralita.registrarLlamadas(llamadasProvinciales);
        centralita.registrarLlamadas(llamadaLocal);
        centralita.registrarLlamadas(llamadaNacional);

        llamadaNacional.calcularCostes();

        centralita.mostrarLlamadas();
        centralita.mostrarCostes();
    }
}
