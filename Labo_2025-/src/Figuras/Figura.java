package Figuras;

public abstract class Figura {
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
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
