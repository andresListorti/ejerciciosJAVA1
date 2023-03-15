// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class guia1Ejercicio5 {

    public static void main(String[] args) {
        double gradosC, gradosF;
        Scanner copiar = new Scanner(System.in);
        System.out.println("Ingrese ua cantidad de grados centigrados: ");
        gradosC = copiar.nextDouble();
        gradosF = 32 + ((gradosC * 9) / 5);
        System.out.println("En Fahrenheit el valor es de: " + gradosF);
    }
}
