
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
           El programa deberá después mostrar el resultado de la suma */
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    int num1, num2;
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    num1 = leer.nextInt();
    System.out.print("Ingrese un segundo numero: ");
    num2 = leer.nextInt();
    System.out.print("La suma de ambos es: " + (num1 + num2));
  }
}
