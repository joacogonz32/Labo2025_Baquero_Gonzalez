package Sistema_bebida;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Bebidas> bebidasConsumidas;

    public Persona(String nombre, String apellido, int dni, ArrayList<Bebidas> bebidasConsumidas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.bebidasConsumidas = bebidasConsumidas;
    }

    public ArrayList<Bebidas> getBebidasConsumidas() {
        return bebidasConsumidas;
    }

    public void setBebidasConsumidas(ArrayList<Bebidas> bebidasConsumidas) {
        this.bebidasConsumidas = bebidasConsumidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
