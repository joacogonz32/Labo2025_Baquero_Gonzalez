package Figuras;

public class Figura {
    private double area;
    private double perimetro;
    public Figura() {
        this.area = 4;
        this.perimetro = 8;
    }
    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double calcularArea(){
        double area = 0.0;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 0.0;
        return perimetro;
    }
}
