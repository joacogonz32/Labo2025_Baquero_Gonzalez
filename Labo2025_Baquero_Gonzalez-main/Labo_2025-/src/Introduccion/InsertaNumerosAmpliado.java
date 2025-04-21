package Unidad1;
import java.util.Scanner;

public class InsertaNumerosAmpliado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar numeros. Ingresa 000 para parar y contar los numeros ingresados: ");
        int n = entrada.nextInt();
        int numeroAux = 0;
        int cantNumeros = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;
        int sumaNumeros = 0;
        int sumaNumerosPositivos = 0;
        int sumaNumerosNegativos = 0;
        while (true) {
            System.out.println("Ingresa un numero: ");
            n = entrada.nextInt();
            if (n == 000) {
                System.out.print("Saliste del programa. Ingresaste " + cantNumeros + " numeros." +
                        " El numero mayor es " + numeroMayor+ "." +
                        " El numero menor es " + numeroMenor+ "." +
                        " La suma de todos los numeros da " + sumaNumeros+ "." +
                        " La suma de todos los numeros positivos da " + sumaNumerosPositivos+ "." +
                        " La suma de todos los numeros negativos da " + sumaNumerosNegativos);
                break;
            }
            else {
                cantNumeros++;
                sumaNumeros+= n;
            }
            if (n > 0) {
                sumaNumerosPositivos += n;
            }
                else if (n < 0){
                    sumaNumerosNegativos += n;
                }
            }
            if (n > numeroAux) {
                numeroMayor = n;
                numeroAux = n;
            }
            else if (n < numeroMenor){
                numeroMenor = n;
                numeroAux = n;

            }
    }
}
