
/* 
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
         Nota: recordar el uso de la sentencia break
*/
import java.util.Scanner;

//
public class guiaEstructuras4Dice9 {
    //
    public static void main(String[] args) {
        int numIngresado, suma, contador;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        contador = 0;
        do {
            System.out.println("Ingrese un numero");
            numIngresado = leer.nextInt();
            if (numIngresado > 0) {
                suma = suma + numIngresado;
            }
            //
            contador++;
            //
            if (numIngresado == 0) {
                System.out.println("Se capturo el cero");
                break;
            }
        } while (contador < 20);
        System.out.println("la suma de los positivos es igual a: " + suma);
    }
}
