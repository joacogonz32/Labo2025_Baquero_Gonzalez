package Unidad1;
import java.util.Scanner;
public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar la primera palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.println("Ingresar la segunda palabra: ");
        String palabra2 = entrada.nextLine();
        if (palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales.");
        }
        else {
            System.out.println("Las palabras son distintas.");
        }
    }
}
