import java.util.Scanner;

public class guiaEstructuras1 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese un Segundo numero");
        num2 = leer.nextInt();

        if ((num1 > 25) && (num2 > 25)) {
            System.out.println("Ambos son mayores a 25");
        } else if ((num1 > 25) && !(num2 > 25)) {
            System.out.println("Solo el primero es mayor a 25");
        } else if (!(num1 > 25) && (num2 > 25)) {
            System.out.println("Solo el segundo es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }

    }
}
