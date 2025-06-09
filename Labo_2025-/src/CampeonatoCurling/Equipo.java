package CampeonatoCurling;
import java.util.ArrayList;

public class Equipo{
    private String nombreEquipo;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private Jugador capitan;
    private TurnoValido disponibilidad;

    public Equipo(){
        this.nombreEquipo = "Equipo 1";
        this.barrio = "Buenos Aires";
        this.jugadores = new ArrayList<>();
        this.capitan = new Jugador();
        this.disponibilidad = TurnoValido.TARDE;
    }

    // Constructor por parametro (usa solo disponibilidad)
    public Equipo(TurnoValido horario){
        this.nombreEquipo = "Equipo Aux";
        this.barrio = "Buenos Aires";
        this.jugadores = new ArrayList<>();
        this.disponibilidad = disponibilidad;
    }

    public Equipo(String nombreEquipo, String barrio, Jugador jugadores, TurnoValido disponibilidad){
        this.nombreEquipo = nombreEquipo;
        this.barrio = barrio;
        this.jugadores = new ArrayList<>();
        this.disponibilidad = disponibilidad;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public TurnoValido getDisponibilidad() {
        return disponibilidad;
    }

    public void setHorario(TurnoValido disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public static void main(String[] args) {

    }
}
