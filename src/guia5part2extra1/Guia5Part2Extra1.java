/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los
guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se introduzca el
valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por
pantalla el número de valores que se han leído, su suma y su media (promedio).
 */
package guia5part2extra1;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia5Part2Extra1 {

   public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los números enteros (-99 para terminar):");
        
        int numero = scanner.nextInt();
        while (numero != -99) {
            numeros.add(numero);
            numero = scanner.nextInt();
        }
        
        int cantidad = numeros.size();
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        
        double media = (double) suma / cantidad;
        
        System.out.println("Cantidad de números leídos: " + cantidad);
        System.out.println("Suma de los números: " + suma);
        System.out.println("Media de los números: " + media);
    }
}