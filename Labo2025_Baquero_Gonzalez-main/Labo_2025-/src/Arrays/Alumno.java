package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<int> listaNotas;

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<int> getListaNotas() {
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
    public void setListaNotas(ArrayList<int> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void AgregarNota(){

    }

    public listaNotas menorNota(){

    }

    public listaNotas mayorNota(){

    }

    public static void main(String[] args) {

    }
}