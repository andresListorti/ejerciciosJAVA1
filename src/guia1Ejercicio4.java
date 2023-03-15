/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java. */

import java.util.Scanner;

public class guia1Ejercicio4 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = leer.next();
        System.out.println("En mayusculas es: " + frase.toUpperCase());
        System.out.println("En minusculas es: " + frase.toLowerCase());
    }
}
