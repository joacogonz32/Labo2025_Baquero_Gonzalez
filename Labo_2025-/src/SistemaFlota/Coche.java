package SistemaFlota;
import Colores.Color;

public class Coche extends Vehiculo {
    private String patente;
    private double velocidad;
    private Boolean descapotable;

    public Coche(double velocidad, String patente){
        super("FIAT", "Palio", Color.ROJO, 4, 2024);
        this.patente=patente;
        this.velocidad=velocidad;
        this.descapotable=Boolean.FALSE;
    }

    public Coche(){
    super("FIAT", "Cronos", Color.BLANCO, 4, 2001);
        this.velocidad=100;
        this.patente="AA 340 KN";
        this.descapotable=false;
    }


    public double getVelocidad(){
        return velocidad;
    }
    public String getPatente(){return patente;}
    public Boolean getDescapotable(){return descapotable;}

    public void setPatente(String patente){this.patente=patente;}
    public void setDescapotable(Boolean descapotable){this.descapotable= descapotable;}

    public void setColor(String color) {
        this.setColor(color);
    }


    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad++;
    }
    public void frenar(){
        velocidad--;
    }
    public void mostrarVelocidadActual(){
        System.out.println("La velocidad es: "+ velocidad);
    }
}
