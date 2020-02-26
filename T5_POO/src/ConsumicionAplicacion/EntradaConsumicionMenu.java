package ConsumicionAplicacion;

import ConsumicionAplicacion.Articulo;
import ConsumicionAplicacion.Cuenta;

import java.util.Hashtable;
import java.util.Scanner;

public class EntradaConsumicionMenu {

    public static void main(String[] args) {
        Hashtable<Integer, Cuenta> consumiciones = new Hashtable();
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        Articulo bocadillo = new Articulo("bocadillo", 2.5);
        Articulo refresco = new Articulo("refresco", 2.0);
        Articulo agua = new Articulo("agua", 1.8);
        Cuenta cuenta = new Cuenta(contador);
        int opcion2 = 0;
        int opcion = 0;
        do {
            System.out.println("\n-----------------Menu-----------------------");
            System.out.println("1- Agregar Articulos a una cuenta");
            System.out.println("2- Obtener el coste de una cuenta");
            System.out.println("3- Pagar una cuenta");
            System.out.println("4- Listar cuenta");
            System.out.println("5- Salir");
            System.out.println("--------------------------------------------");
            System.out.print("\nIntroduzca la opcion que desea realizar: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Indique el articulo que desea añadir: ");
                    System.out.println("1- Bocadillo");
                    System.out.println("2- Refresco");
                    System.out.println("3- Agua");
                    do {
                        System.out.print("\nLa opcion añadida es: ");
                        opcion2= teclado.nextInt();
                        switch (opcion2) {
                            case 1:
                                cuenta.agregarArticulo(bocadillo);
                                System.out.println("\nHa añadido un bocadillo\n");
                                break;
                            case 2:
                                cuenta.agregarArticulo(refresco);
                                System.out.println("\nHa añadido un refresco\n");
                                break;
                            case 3:
                                cuenta.agregarArticulo(agua);
                                System.out.println("\nHa añadido una botella de agua\n");
                                break;
                            case 4:
                                System.out.println("\nSu pedido ha sido realizado.\n");
                                break;
                            default:
                                System.out.println("Ópcion no valida, no se ha añadido nada");
                                break;
                        }
                    }while (opcion2!=4);
                    consumiciones.put(cuenta.getIdentificador(),cuenta);
                    contador++;
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.print("introduzca el numero de cuenta: ");
                    int numCuenta = teclado.nextInt();
                    if (cuenta.getIdentificador()==numCuenta){
                        System.out.println(consumiciones.get(cuenta.getIdentificador()).costeTotal() + " €");
                    }
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Ha terminado su pedido, hasta pronto");
                    break;
                default:

                    break;


            }

        } while (opcion != 5);
    }
}
