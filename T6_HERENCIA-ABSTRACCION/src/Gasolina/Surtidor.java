package Gasolina;

public class Surtidor {

    private int capacidadTotal, capacidadActual;
    private String tipo;
    private boolean funciona;

    public Surtidor(){
        this.capacidadActual = 0;
        this.capacidadTotal = 0;
        this.tipo = "";
        this.funciona = false;
    }

    public Surtidor(int capacidadTotal, String tipo){
        this.capacidadTotal = capacidadTotal;
        this.tipo = tipo;
        this.funciona = true;
        this.capacidadActual = capacidadTotal;
    }

    public Surtidor(String tipo){
        this.tipo = tipo;
    }

    //METODOS SETTER

    public void setCapacidadTotal(){
        this.capacidadTotal = capacidadTotal;
    }

    public void setCapacidadActual(){
        this.capacidadActual=capacidadActual;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

    //METODOS GETTER

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getFunciona() {
        return funciona;
    }

    //METODOS

    public void apagarSurtidor(){
        this.funciona = false;
    }

    public void rellenarGasolina(int gasolina){
        if (gasolina>0) {
            this.capacidadActual += gasolina;
        }else {
            System.out.println("Ponga un valor positivo");
        }
    }

    public void quitarGasolina(int gasolina){
        if (this.capacidadTotal<0 || (this.capacidadTotal-gasolina)<0){
            System.out.println("Imposible realizar esta operacion");
        }else{
            this.capacidadTotal-=gasolina;
        }
    }
}
