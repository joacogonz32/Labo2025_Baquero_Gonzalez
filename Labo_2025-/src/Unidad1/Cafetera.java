package Unidad1;
import java.util.Scanner;

public class Cafetera {
    private static double cantidadMaxima=1000;
    private static double cantidadActual=0;


    public Cafetera(float cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    public Cafetera(double cantidadMaxima, double cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getMaxima() {
        return cantidadMaxima;
    }

    public double getActual() {
        return cantidadActual;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = cantidadMaxima;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidad) {
        if (cantidadActual + cantidad > cantidadMaxima) {
            cantidadActual = cantidadMaxima;
        } else {
            cantidadActual += cantidad;
        }
    }

    public void servirTaza(double taza) {
        if (taza <= cantidadActual) {
            cantidadActual -= taza;
        } else {
            cantidadActual = 0;
        }
    }

    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(1000, 0);

        cafetera.llenarCafetera();

        System.out.print("Ingrese la capacidad de la taza: ");
        double taza  = 100.00;
        cafetera.servirTaza(taza);

        cafetera.vaciarCafetera();

        double cantidad = 50.00;
        cafetera.agregarCafe(cantidad);

        System.out.println("Cantidad final de café: " + cafetera.getActual() + " ml");

    }
}