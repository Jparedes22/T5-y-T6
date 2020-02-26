package Herencia2;

public final class JefeSupremo extends Jefe{
    public JefeSupremo(String nombre, String apellido, int sueldo, int horas) {
        super(nombre, apellido, sueldo, horas);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("mostrado desde jefeSupremo");
    }
}
