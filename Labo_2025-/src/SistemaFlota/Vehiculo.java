package SistemaFlota;

import Colores.Color;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cRuedas;
    private int anioFabricacion;

    public Vehiculo(String marca, String modelo, Color color, int cantRuedas, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(){
        this.marca = "Toyota";
        this.modelo = "Gt 86";
        this.color = Color.ROJO;
        this.cRuedas = 4;
        this.anioFabricacion = 2024;
    }

    public Vehiculo(String marca, String modelo, Color color, int cRuedas, int anioFabricacion, String patente, int carga, int cargaMax){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cRuedas = cRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public int getCantRuedas() {
        return cRuedas;
    }
    public void setCantRuedas(int cantRuedas) {
        this.cRuedas = cantRuedas;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public static void main(String[] args) {

    }
}
