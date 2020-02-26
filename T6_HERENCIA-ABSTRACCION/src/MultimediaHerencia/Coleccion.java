package MultimediaHerencia;

import java.util.ArrayList;
import java.util.Hashtable;

public class Coleccion {

    private ArrayList<Multimedia> coleccion;

    public Coleccion() {
        coleccion = new ArrayList();
    }

    //Metodos

    public void agregarElemento(Multimedia multimedia) {
        if (coleccion.isEmpty()) {
            coleccion.add(multimedia);
        } else {
            boolean existe = false;
            for (Multimedia item : coleccion) {
                if (item.getId() == multimedia.getId()) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("ya existe un elemento con este id");
            } else {
                coleccion.add(multimedia);
                System.out.println("Elemento añadido correctamente");
            }
        }
    }

    public void eliminarElemento(int id) {
        if (coleccion.isEmpty()) {
            System.out.println("La lista esta vacia aun");
        } else {
            boolean existe = false;
            Multimedia elemento = null;
            for (Multimedia item : coleccion) {
                if (item.getId() == id) {
                    existe = true;
                    elemento = item;
                    break;
                }
                if (existe) {
                    coleccion.remove(elemento);
                    System.out.println("Elemento borrado correctamente");
                }
            }
        }
    }

    public void listarElementos(String eleccionFormato) {
        for (Multimedia item : coleccion) {
            if (item.getClass().getSimpleName().equals(eleccionFormato)) {
                item.mostrarDatos();
                System.out.println("");
            } else if (eleccionFormato.equals("Todos")) {
                item.mostrarDatos();
                System.out.println("");
            }
        }
    }
}
