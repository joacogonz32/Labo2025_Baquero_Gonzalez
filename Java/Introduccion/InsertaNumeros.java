package Unidad1;
import java.util.Scanner;

public class InsertaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar numeros. Ingresa -1 para parar y contar los numeros ingresados: ");
        int numero = entrada.nextInt();
        int cantNumeros = 0;
        while (true) {
            System.out.println("Ingresa un numero: ");
            numero = entrada.nextInt();
            if (numero == -1) {
                System.out.print("Saliste del programa. Ingresaste " + cantNumeros + " numeros");
                break;
            }
            else {
                cantNumeros++;
            }
        }
    }
}