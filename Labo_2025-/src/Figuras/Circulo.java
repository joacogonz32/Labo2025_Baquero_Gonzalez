package Figuras;

public class Circulo extends Figura {
    private double radio;


    public Circulo() {
        super();
        this.radio = 5;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(double area, double perimetro, double radio) {
        super(area, perimetro);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double area = 0.0;
        area = 3.14 * (radio*radio);
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 0.0;
        perimetro = 2 * (3.14 * radio);
        return perimetro;
    }
    public static void main(String[] args) {
        int radio = 10;
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(radio);

        System.out.println("Radio = " + c1.getRadio());
        System.out.println("Area = " + c1.calcularArea());
        System.out.println("Perimetro = " + c1.calcularPerimetro());
    }
}