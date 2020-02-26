package IMC;

import IMC.Persona;

import java.util.Scanner;

public class EntradaIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.next();
        System.out.print("Introduzca su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduzca su sexo: ");
        String sexo = scanner.next();
        System.out.print("Introduzca su peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Introduzca su altura: ");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo);
        Persona persona2 = new Persona(nombre,"qwe",sexo, peso, altura,edad);
        Persona persona3 = new Persona();
        persona3.setNombre("pepe");
        persona3.setDni("rty");
        persona3.setSexo("H");
        persona3.setPeso(80);
        persona3.setAltura(180);
        persona3.setEdad(24);

        persona1.calcularIMC();
        persona2.calcularIMC();
        persona3.calcularIMC();

        System.out.println(persona1.getDatos());
        System.out.println("");
        System.out.println(persona2.getDatos());
        System.out.println("");
        System.out.println(persona3.getDatos());
    }
}
