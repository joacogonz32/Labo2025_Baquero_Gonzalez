package Arrays;
import Unidad1.Fecha;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaNotas;

    public Alumno(){
        this.nombre = "Juan";
        this.apellido = "Baquero";
        this.fechaNacimiento = new Fecha(30, 4, 2008);
        this.listaNotas = new ArrayList<Integer>();
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void AgregarNota(String nombreParametro, String materia){
        for (int i = 0; i < listaNotas.size(); i++) {
            if()
        }
    }

    public Alumno menorNota(){
        int notaMinina = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            if (){

            }
        }
        return ("La nota minima es "+notaMinina+" y la tiene"+nombre);
    }

    public int mayorNota(){
        int notaMaxima = 0;
        for (int i = 0; i < listaNotas.size(); i++) {
            if (){
            }
        }
        return ("La nota minima es "+notaMaxima+" y la tiene"+nombre);
    }

    public static void main(String[] args) {
        String nombreParametro;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresar nombre del alumno: ");

        ArrayList<Integer> listaNotas = new ArrayList<Integer>();
        Alumno alumno1 = new Alumno("Joaquin", "Gonzalez", new Fecha(), listaNotas);
    }
}