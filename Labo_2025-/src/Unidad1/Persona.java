package Unidad1;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre = "Joaquin";
        this.edad = 17;
        this.direccion = "Av. de Los Incas 3279";
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Direccion: " + getDireccion());
    }

    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        String direccion = "";
        Persona p1 = new Persona();
        Persona p2 = new Persona(nombre, edad, direccion);

        p2.setNombre("Juan Pablo");
        p2.setEdad(17);
        p2.setDireccion("Av. San Martin 6782");

        p1.mostrarDatos();
        p2.mostrarDatos();

    }

}
