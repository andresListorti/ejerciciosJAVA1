/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
   Nota: investigar la función Math.sqrt() */

import java.util.Scanner;

public class guia1Ejercicio6 {
    public static void main(String[] args) {
        int num, numDupli, numTrip;
        double raiz;
        Scanner copiar = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = copiar.nextInt();
        numDupli = num * 2;
        numTrip = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("Duplicado: " + numDupli);
        System.out.println("Triplicado: " + numTrip);
        System.out.println("La raiz cuadrada es: " + raiz);
    }
}