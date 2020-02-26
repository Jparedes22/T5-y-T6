package TrabajadoresHerencia;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajador;

    public Empresa() {
        listaTrabajador = new ArrayList();
    }

    public void agrearTrabajador(Trabajador trabajador) {
        if (listaTrabajador.isEmpty()) {
            listaTrabajador.add(trabajador);
        } else {
            int numeroJefe = 0;
            for (Trabajador item : listaTrabajador) {
                if (item.getClass().getSimpleName().equals("Jefe")) {
                    numeroJefe++;
                    break;
                }
            }

            if (trabajador.getClass().getSimpleName().equals("Jefe") && numeroJefe == 0) {
                boolean existe = false;
                for (Trabajador item : listaTrabajador) {
                    if (item.getDni().equals(trabajador.getDni())) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("Ya existe un jefe");
                } else {
                    listaTrabajador.add(trabajador);
                }
            } else if (!trabajador.getClass().getSimpleName().equals("Jefe")) {
                boolean existe = false;
                for (Trabajador item : listaTrabajador) {
                    if (item.getDni().equals(trabajador.getDni())) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("Ya existe un trabajador con ese dni");
                } else {
                    listaTrabajador.add(trabajador);
                }
            }
        }
    }

    public void listarTrabajadores(String clase) {
        if (listaTrabajador.isEmpty()) {
            System.out.println("La plantilla aun esta vacia");
        } else {
            for (Trabajador item : listaTrabajador) {
                if (item.getClass().getSimpleName().equals(clase)) {
                    System.out.println(item.mostrarDatos());
                    System.out.println();
                } else if (item.getClass().getSimpleName().equals("Todos")) {
                    System.out.println(item.mostrarDatos());
                    System.out.println();
                }
            }
        }
    }

    public void eliminarTrabajador(String dni) {
        if (listaTrabajador.isEmpty()) {
            System.out.println("La plantilla aun esta vacia");
        } else {
            for (Trabajador item : listaTrabajador) {
                if (item.getDni().equals(dni)) {
                    listaTrabajador.remove(item);
                    break;
                }
            }
        }
    }

        public void listarPersona (String dni){
            if (listaTrabajador.isEmpty()) {
                System.out.println("La plantilla aun esta vacia");
            } else {
                for (Trabajador item : listaTrabajador) {
                    if (item.getDni().equals(dni)) {
                        System.out.println(item.mostrarDatos());
                        System.out.println();
                    }
                }
            }
        }
    }
