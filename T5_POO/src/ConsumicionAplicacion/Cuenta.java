package ConsumicionAplicacion;



import java.util.ArrayList;

public class Cuenta {

    private int identificador;
    private boolean estado; //PARA SABER SI ESTA PAGADA O NO LA CONSUMICION
    private ArrayList<Articulo> cuenta;

    public Cuenta(int identificador) {
        this.identificador = identificador;
        this.estado = false;
        this.cuenta = new ArrayList();
    }

    public void agregarArticulo(Articulo articulo) {
        if (cuenta.isEmpty()) {
            cuenta.add(articulo);
        } else {
            if (cuenta.contains(articulo)) {
                System.out.println("Este articulo ya existe");
            } else {
                cuenta.add(articulo);
            }
        }
    }

    public int numeroArticulos() {
        return cuenta.size();
    }

    public double costeTotal() {
        double coste = 0.0;
        for (Articulo a : cuenta) {
            coste += a.getCoste();
        }
        return coste;
    }

    //METODOS GETTER
    public int getIdentificador() {
        return identificador;
    }

    //METODO SETTER

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }


}
