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
        int cantidad = 0;
        if (auxMes == 1 || auxMes == 3 || auxMes == 5 || auxMes == 7 || auxMes == 8 || auxMes == 10 || auxMes == 12){
            cantidad = 31;
            System.out.println("Cantidad de dias del mes " + auxMes + " es: " + cantidad);
        }
        else if(auxMes == 2){
            cantidad = 28;
        }
        else if (auxMes == 4 || auxMes == 6 || auxMes == 9 || auxMes == 11){
            cantidad = 30;
        }
        else{
            System.out.println("Ingrese un mes valido.");
        }
        return cantidad;
    }

    public void fechaCorta(int dia, int mes, int año){
        System.out.println("Fecha formato corto: " + dia + "-" + mes + "-" + año);
    }

    public void fechaLarga(int dia, int mes, int año){
        System.out.println("Fecha formato largo: " + dia + " del mes " + mes + " del año " + año);
    }

    public void siguienteDia(int dia, int mes, int año){
        int nuevoDia = dia + 1;
        System.out.println("Nueva fecha: " + nuevoDia + "-" + mes + "-" + año);
    }

    public void anteriorDia(int dia, int mes, int año){
        int nuevoDia = dia - 1;
        System.out.println("Nueva fecha: " + nuevoDia + "-" + mes + "-" + año);
    }

    public boolean igualQue(Fecha fecha){
    boolean resultado;
    if(dia == fecha.dia && mes == fecha.mes && año == fecha.año) {
        resultado = true;
    }
        else{
            resultado =false;
        }
        return resultado;
        }

    public boolean menorQue(Fecha fecha){
        boolean resu;
        if(año < fecha.año) {
            resu = true;
            return resu;
        }
        else if(año == fecha.año && mes < fecha.mes) {
            resu= true;
            return resu;
        }
        else if(año == fecha.año && mes == fecha.mes && dia < fecha.dia){
            resu= true;
            return resu;
                }
        else{
            resu= false;
            return resu;
        }
    }
    public boolean mayorQue(Fecha fecha){
        boolean resu;
        if(año > fecha.año) {
            resu = true;
            return resu;
        }
        else if(año == fecha.año && mes > fecha.mes) {
            resu= true;
            return resu;
        }
        else if(año == fecha.año && mes == fecha.mes && dia > fecha.dia){
            resu= true;
            return resu;
        }
        else{
            resu= false;
            return resu;
        }
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int año = 0;
        int auxMes = 0;
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha();

        f1.setAño(2008);
        f1.setMes(2);
        f1.setDia(13);

        f1.valida();
        f1.cantDiasMes(auxMes);
        f1.fechaCorta(dia, mes, año);
        f1.fechaLarga(dia, mes, año);
        f1.siguienteDia(dia, mes, año);
        f1.anteriorDia(dia, mes, año);

        f2.valida();
        f2.cantDiasMes(auxMes);
        f2.fechaCorta(dia, mes, año);
        f2.fechaLarga(dia, mes, año);
        f2.siguienteDia(dia, mes, año);
        f2.anteriorDia(dia, mes, año);

        System.out.println("f1 < f2: " + f1.menorQue(f2));
        System.out.println("f1 = f2: " + f1.igualQue(f2));
        System.out.println("f1 > f2: " + f1.mayorQue(f2));
    }
}

