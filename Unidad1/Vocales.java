package Unidad1;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "Ayer me compré muñecos de la marca ToyCo por internet";
        int contadorVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                contadorVocales++;
            }
        }
        System.out.println("El total de vocales es:"+contadorVocales);
    }
}
