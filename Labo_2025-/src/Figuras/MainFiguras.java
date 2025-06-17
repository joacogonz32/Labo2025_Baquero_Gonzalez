package Figuras;

public class MainFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(3);
        Figura figura2 = new Rectangulo(4, 5);
        Figura figura3 = new Circulo(7);
        Figura figura4 = new Rectangulo(10, 2);

        System.out.println("Figura 1 (Círculo):");
        System.out.println("Área: " + figura1.calcularArea());
        System.out.println("Perímetro: " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("Figura 2 (Rectángulo):");
        System.out.println("Área: " + figura2.calcularArea());
        System.out.println("Perímetro: " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("Figura 3 (Círculo):");
        System.out.println("Área: " + figura3.calcularArea());
        System.out.println("Perímetro: " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("Figura 4 (Rectángulo):");
        System.out.println("Área: " + figura4.calcularArea());
        System.out.println("Perímetro: " + figura4.calcularPerimetro());
    }
    }
