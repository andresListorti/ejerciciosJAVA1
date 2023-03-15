
/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo
              muestre por pantalla */
import java.util.Scanner;

public class guia1Ejercicio3 {
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Hola " + nombre);
    }
}