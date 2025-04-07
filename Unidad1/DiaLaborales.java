package Unidad1;

import java.util.Scanner;

public class DiaLaborales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String diaElegido = "";
        System.out.println("Elegi un dia de la semana: ");
        diaElegido = entrada.nextLine();
        if (diaElegido.equals("Sabado") || diaElegido.equals("Domingo")){
            System.out.println("Dia no laboral");
        }
        else{
            System.out.println("Dia laboral");
        }
    }
}
