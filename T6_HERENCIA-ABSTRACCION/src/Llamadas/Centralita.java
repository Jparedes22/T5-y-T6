package Llamadas;

import java.util.ArrayList;

public class  Centralita extends Llamada {

    private ArrayList<LlamadaLocal> llamadasLocales;
    private ArrayList<LlamadaNacional> llamadasNacionales;
    private double costeAcumulado;

    public Centralita() {
        this.llamadasLocales = new ArrayList();
        this.llamadasNacionales = new ArrayList();
        this.costeAcumulado = 0.0;
    }

    //METODOS GETTER


    public ArrayList<LlamadaLocal> getLlamadasLocales() {
        return llamadasLocales;
    }

    public ArrayList<LlamadaNacional> getLlamadasNacionales() {
        return llamadasNacionales;
    }

    public double getCosteAcumulado() {
        return costeAcumulado;
    }

    //METODOS SETTER


    public void setLlamadasLocales(ArrayList<LlamadaLocal> llamadasLocales) {
        this.llamadasLocales = llamadasLocales;
    }

    public void setLlamadasNacionales(ArrayList<LlamadaNacional> llamadasNacionales) {
        this.llamadasNacionales = llamadasNacionales;
    }

    public void setCosteAcumulado(double costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }

    //METODOS

    public void agregarLlamadaLocal(LlamadaLocal llamada){
        llamadasLocales.add(llamada);
    }

    public void agregarLlamadaNacional(LlamadaNacional llamada){
        llamadasNacionales.add(llamada);
    }

    public void listarLocales(){
        for (LlamadaLocal listaLlamadas:llamadasLocales) {
            System.out.println(listaLlamadas.mostrarDatos());
            System.out.println(" ");
        }
    }

    public void listarNacionales(){
        for (LlamadaNacional listaLlamadas:llamadasNacionales) {
            System.out.println(listaLlamadas.mostrarDatos());
            System.out.println(" ");
        }
    }

    public void mostrarCostes(){
        for (LlamadaLocal listaLlamadasLocal:llamadasLocales) {
            this.costeAcumulado += listaLlamadasLocal.getCoste();
        }
        for (LlamadaNacional listaLlamadasNacional:llamadasNacionales) {
            this.costeAcumulado += listaLlamadasNacional.getCoste();
        }
        System.out.printf("El coste total acumulado es: %.2f",this.costeAcumulado);
    }
}
