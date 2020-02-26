import Inicial.Coche;
import Inicial.Motor;

public class Entrada {

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        //ASI RELLENO EL OBJETO CON EL METODO CONSTRUCTOR
        Coche otroCoche = new Coche("opel","corsa",100);
        Coche cocheCompleto = new Coche("ford","focus", 120, 100);

        //ASI RELLENO UN COCHE CON MOTOR
        Motor motor = new Motor(150,2.0);
        Coche cocheMotor = new Coche(motor);

        cocheMotor.getDatos();
        /*
        //Para darle cv al coche
        miCoche.setCv(100);
        //Para darle marca a mi coche
        miCoche.setMarca("ford");
        miCoche.setMatricula("ASD123");
        miCoche.setModelo("Fiesta");

        //Crear otro coche
        Coche otroCoche = new Coche();
        otroCoche.setCv(200);
        otroCoche.setVelocidad(200);
        otroCoche.setMarca("Mercedes");
        otroCoche.setModelo("CLC");
        otroCoche.setMatricula("QWE456");

        otroCoche.getDatos();

        System.out.println(miCoche.getDatosDos().toUpperCase());
                */
    }
}
