package Gasolina;

public class Coche {

    private String tipoGasolina;
    private int litrosDeposito;

    public Coche(){
        this.tipoGasolina = "";
        this.litrosDeposito = 0;
    }

    public Coche(String tipoGasolina, int litrosDeposito) {
        this.tipoGasolina = tipoGasolina;
        this.litrosDeposito = litrosDeposito;
    }

    public void ponerGasolina(Surtidor surtidor, int litros){
        if (surtidor.getCapacidadActual()==0 || (surtidor.getCapacidadActual()<litros)){
            System.out.println("\nNo hay suficientes litros de gasolina\n");
        }else if(surtidor.getFunciona()==false){
            System.out.println("\nEl surtidor esta averiado, lo siento\n");
        }else if (!surtidor.getTipo().toLowerCase().equals(tipoGasolina.toLowerCase())){
            System.out.println("\nUsted ha elegido una gasolina distinta\n");
        }else{
            surtidor.quitarGasolina(litros);
            this.litrosDeposito+=litros;
            System.out.println("Su coche ha sido repostado");
        }
    }
}
