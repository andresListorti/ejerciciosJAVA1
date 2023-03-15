// Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla

import java.util.Scanner;

public class guia1Ejercicio7 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        num2 = leer.nextInt();
        if (num1 == num2) {
            System.out.println("Son iguales");
        } else if (num1 > num2) {
            System.out.println("El mayor es el primero: " + num1);
        } else {
            System.out.println("El mayor es el segundo: " + num2);
        }
    }
}
