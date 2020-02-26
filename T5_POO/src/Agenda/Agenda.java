package Agenda;

import java.util.Enumeration;
import java.util.Hashtable;

public class Agenda {

    private Hashtable<String, Persona> agenda = new Hashtable();

    public void agregarPersona(Persona contacto) {

        if (agenda.isEmpty()) {
            agenda.put(contacto.getDni(), contacto);
        } else {
            if (agenda.containsKey(contacto.getDni())) {
                System.out.println("\nEste dni ya esta registrado, no se puede añadir");
            } else {
                agenda.put(contacto.getDni(), contacto);
                System.out.println("\nContacto guardado correctamente");
            }
        }
    }

    public void borrarPersona(String dni, Persona contacto) {
        if (agenda.isEmpty()) {
            System.out.println("Opcion no disponible, la agenda esta vacia");
        } else {

            Enumeration<Persona> contactos = agenda.elements();
            while (contactos.hasMoreElements()) {
                Persona contactoEncontrado = contactos.nextElement();
                if (contactoEncontrado.getDni().equals(dni)) {
                    agenda.remove(contactoEncontrado.getDni(), contactoEncontrado);
                    System.out.println("Contacto borrado");
                } else {
                    System.out.println("No existe ese dni en la agenda");
                }
            }
        }
    }

    public void editarPersona(String dni, String nuevodni,String nuevonombre,String nuevotelefono) {
        if (agenda.isEmpty()) {
            System.out.println("Opcion no disponible, la agenda esta vacia");
        } else {

            Enumeration<Persona> contactos = agenda.elements();
            while (contactos.hasMoreElements()) {
                Persona listaContactos = contactos.nextElement();
                if (dni.equals(listaContactos.getDni())) {

                    listaContactos.setDni(nuevodni);
                    listaContactos.setNombre(nuevonombre);
                    listaContactos.setTelefono(nuevotelefono);

                    agenda.replace(dni, listaContactos);
                    System.out.println("Contacto editado");
                    break;
                } else {
                    System.out.println("No existe ese dni en la agenda");
                }
            }
        }
    }

    public void buscarPersona(String dni) {
        if (agenda.isEmpty()) {
            System.out.println("Opcion no disponible, la agenda esta vacia");
        } else {

            Enumeration<Persona> contactos = agenda.elements();
            while (contactos.hasMoreElements()) {
                Persona listaPersonas = contactos.nextElement();
                if (listaPersonas.getDni().equals(dni)) {
                    System.out.println(listaPersonas.getDatos());
                } else {
                    System.out.println("No existe ese dni en la agenda");
                }
            }
        }
    }

    public void listarPersona() {
        if (agenda.isEmpty()) {
            System.out.println("Opcion no disponible, la agenda esta vacia");
        } else {
            Enumeration<Persona> contactos = agenda.elements();
            while (contactos.hasMoreElements()) {
                Persona listaContactos = contactos.nextElement();
                System.out.println(listaContactos.getDatos());
            }
        }
    }

    public boolean verificar (String dni){
        if (agenda.containsKey(dni)){
            return true;
        }else{
            return false;
        }
    }
}
