package MultimediaHerencia;


import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Coleccion coleccion = new Coleccion();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        String eleccionFormato = "";
        int id = 0;
        do {
            System.out.println("1. Añadir a la coleccion");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Listar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccion la opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca tamaño: ");
                    int tamaño = teclado.nextInt();
                    System.out.print("Introduzca el titulo: ");
                    String titulo = teclado.next();
                    System.out.print("Introduzca el autor: ");
                    String autor = teclado.next();
                    System.out.println("1. Audio");
                    System.out.println("2. Libro");
                    System.out.println("3. Video");
                    System.out.print("Seleccion el formato: ");
                    opcion2 = teclado.nextInt();
                    do {
                        switch (opcion2) {
                            case 1:
                                String formato = "Audio";
                                System.out.print("Introduzca la forma de su audio: ");
                                String forma = teclado.next();
                                System.out.print("Introduzca la duracion de su audio: ");
                                int duracion = teclado.nextInt();
                                id++;
                                Audio audio = new Audio(id, tamaño, titulo, formato, autor, duracion, forma);
                                coleccion.agregarElemento(audio);
                                break;
                            case 2:
                                formato = "Libro";
                                System.out.print("Intoduzca el ISBN del libro: ");
                                int ISBN = teclado.nextInt();
                                System.out.println("Introduzca el numero d epaginas del libro");
                                int numPag = teclado.nextInt();
                                id++;
                                Libro libro = new Libro(id, tamaño, titulo, formato, autor, numPag, ISBN);
                                coleccion.agregarElemento(libro);
                                break;
                            case 3:
                                formato = "Video";
                                System.out.print("Introduza el nombre del director: ");
                                String director = teclado.next();
                                System.out.print("Introduzca el nombre del actor: ");
                                String actores = teclado.next();
                                id++;
                                Video video = new Video(id, tamaño, titulo, formato, autor, director, actores);
                                coleccion.agregarElemento(video);
                                break;
                            default:
                                System.out.println("Opcion no disponible");
                                break;
                        }
                    } while (opcion2 < 1 || opcion2 > 3);
                    break;
                case 2:
                    System.out.println("Introduzca el id del elemento quiere eliminar: ");
                    int eleccionId = teclado.nextInt();
                    coleccion.eliminarElemento(eleccionId);
                    break;
                case 3:
                    do {
                        System.out.println("1. Audio");
                        System.out.println("2. Libro");
                        System.out.println("3. Video");
                        System.out.println("4. Todos");
                        System.out.print("Escoja el formato que desea listar: ");
                        opcion3 = teclado.nextInt();
                        switch (opcion3) {
                            case 1:
                                eleccionFormato = "Audio";
                                break;
                            case 2:
                                eleccionFormato = "Libro";
                                break;
                            case 3:
                                eleccionFormato = "Video";
                                break;
                            case 4:
                                eleccionFormato = "Todos";
                                break;
                            default:
                                System.out.println("Escoja una opcion de las que hay");
                                break;
                        }
                    } while (opcion3 < 1 || opcion2 > 4);
                    coleccion.listarElementos(eleccionFormato);
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:

                    break;
            }
        } while (opcion != 4);
    }
}