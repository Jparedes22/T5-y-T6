package Herencia2;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

      //  Persona persona = new Persona("nombre persona","apellido persona"); //Ya no se puede crear una persona porque la clase es abstracta
        Trabajador trabajador = new Trabajador("nombre trabajador", "apellido trabajador");
        Trabajador trabajador2 = new Trabajador("nombre trabajador", "apellido trabajador", 2500);

        JefeSupremo jefeSupremo = new JefeSupremo("nombre jefe", "apellido jefe", 3500, 40);
        Jefe jefe = new Jefe("nombre jefe", "apellido jefe", 3500, 40);
        trabajador.getApellido();
        trabajador.mostrarDatos();

        jefe.despedir();

        System.out.println(trabajador.getClass());
        System.out.println(trabajador.getClass().getName());
        System.out.println(trabajador.getClass().getSimpleName());


        ArrayList<Jefe> arrayListJefes = new ArrayList();
        arrayListJefes.add(jefe);
        arrayListJefes.add(jefeSupremo);//en el arraylist de jefe puede entrar jefeSupremo porque desciende de la clase jefe

        ArrayList<JefeSupremo> arrayListJefeSupremos = new ArrayList();
        arrayListJefeSupremos.add(jefeSupremo);//En el arraylist de jefeSupremo no puedes añadir jefe porque es la clase anterior a JefeSupremo

        ArrayList<Trabajador> trabajadores = new ArrayList();
        trabajadores.add(trabajador);
        trabajadores.add(trabajador2);
        trabajadores.add(jefe);
        trabajadores.add(jefeSupremo);

        for (Persona item:trabajadores) {
            item.mostrarDatos();
        }
        System.out.println(trabajador.getClass());
        System.out.println(trabajador.getClass().getSimpleName());
        if (trabajador.getClass().getSimpleName().equals("Trabajador")){
            System.out.println("lo soy");
        }else{
            System.out.println("no lo soy");
        }
    }
}
