package CampeonatoCurling;
import Unidad1.Fecha;
import java.util.ArrayList;

public class Jugador{
    private String apellido;
    private Fecha fechaNacimiento;
    private int dorsal;
    private boolean esCapitan;

    public Jugador(){
        this.apellido = "Gonzalez";
        this.fechaNacimiento = new Fecha(13, 2, 2008);
        this.dorsal = 10;
    }

    public Jugador(String apellido, Fecha fechaNacimiento, int dorsal){
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dorsal = dorsal;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public static void main(String[] args) {

    }
}
