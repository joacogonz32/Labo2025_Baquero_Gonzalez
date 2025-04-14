package Unidad1;
import java.util.Scanner;
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this.dia = 30;
        this.mes = 4;
        this.año = 2008;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void valida() {
        boolean validadia;
        boolean validames;
        boolean validaaño;
        if (año <= 2025 && año >= 1950) {
            System.out.println("El año de la fecha es correcto");
            validaaño = true;
            if (mes >= 1 && mes <= 12) {
                System.out.println("El mes de la fecha es correcto");
                if (dia >= 1 && dia <= 30) {
                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        if (dia >= 1 && dia <= 31) {
                            System.out.println("El dia de la fecha es correcta");
                            validadia = true;
                        } else if (mes == 2) {
                            if (dia >= 1 && dia <= 28) {
                                System.out.println("El dia de la fecha es correcta");
                            }
                        }
                    }
                }
            }
            System.out.println("El mes de la fecha es incorrecto");
        } else {
            System.out.println("El año de la fecha es incorrecta");
        }
    }

    public int cantDiasMes(int auxMes) {
        if (auxMes == 1 || auxMes == 3 || auxMes == 5 || auxMes == 7 || auxMes == 8 || auxMes == 10 || auxMes == 12){
            System.out.println("Cantidad de dias del mes " + auxMes + " es: " + cantidad);
        }
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int auxMes = 0;

        System.out.println("Ingresar un mes: ");
        auxMes = entrada.nextInt();
    }
}
