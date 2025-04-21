package Objetos1;
import java.util.Scanner;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public Coche(){
        this.marca = "Fiat";
        this.modelo = "Cronos";
        this.color = "Gris";
        this.velocidad = 50.0;
    }

    public Coche(String marca, String modelo, String color, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public double acelerar(){
        int aceleracion = 0;
        System.out.println("Cuantos km/h acelera? ");
        aceleracion = entrada.nextInt();
        velocidad += aceleracion;
        return velocidad;
    }

    public double frenar(){
        int frenada = 0;
        System.out.println("Cuantos km/h disminuye? ");
        frenada = entrada.nextInt();
        velocidad -= frenada;
        return velocidad;
    }

    public void velocidadActual(){
        System.out.println("Velocidad actual: " + velocidad);
    }

    public void mostrarDatos(){
        System.out.println("La marca del coche es " + getMarca());
        System.out.println("La modelo del coche es " + getModelo());
        System.out.println("La color del coche es " + getColor());
        System.out.println("La velocidad del coche es " + getVelocidad());
    }

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String marca = "";
        String modelo = "";
        String color = "";
        double velocidad = 0.0;
        Coche c1 = new Coche();
        Coche c2 = new Coche(marca, modelo, color, velocidad);

        c2.setMarca("BMW");
        c2.setModelo("M3 Competition");
        c2.setColor("Negro");
        c2.setVelocidad(230.5);

        c1.acelerar();
        c1.frenar();
        c2.acelerar();
        c2.frenar();

        c1.mostrarDatos();
        c2.mostrarDatos();

    }
}
