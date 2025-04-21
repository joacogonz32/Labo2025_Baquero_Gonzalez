package Unidad1;

import java.util.Scanner;

public class Reemplaza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        char letra = entrada.next().charAt(0);
        String texto = "Ayer me compré muñecos de la marca ToyCo por internet";
        String nuevoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter == 'e' || caracter == 'E' || caracter == 'é' || caracter == 'É') {
                nuevoTexto += letra;
            }
            else{
                nuevoTexto += caracter;
            }
        }
        System.out.println("El texto modificado queda asi: "+nuevoTexto);
    }
}
