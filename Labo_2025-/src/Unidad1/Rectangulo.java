package Unidad1;
import java.util.Scanner;
public class Rectangulo {
    private double base = 0.0;
    private double altura = 0.0;

    public Rectangulo(){
        this.base = 6;
        this.altura = 4;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea(){
        double area = 0.0;
        area = base * altura;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 0.0;
        perimetro = base*2 + altura*2;
        return perimetro;
    }

    public static void main(String[] args) {
        double base = 0.0;
        double altura = 0.0;
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(base, altura);

        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
    }
}
