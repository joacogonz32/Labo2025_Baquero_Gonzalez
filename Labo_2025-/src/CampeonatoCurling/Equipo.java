package CampeonatoCurling;
import java.util.ArrayList;

public class Equipo{
    private String nombreEquipo;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private Jugador capitan;
    private String horario;

    public Equipo(){
        this.nombreEquipo = "Racing Club";
        this.barrio = "Avellaneda";
        this.jugadores = new ArrayList<>();
        this.horario = "Noche";
    }

    // Constructor por parametro (usa solo horario)
    public Equipo(String horario){
        this.nombreEquipo = "Racing Club";
        this.barrio = "Avellaneda";
        this.jugadores = new ArrayList<>();
        this.horario = horario;
    }

    public Equipo(String nombreEquipo, String barrio, Jugador jugadores, String horario){
        this.nombreEquipo = nombreEquipo;
        this.barrio = barrio;
        this.jugadores = new ArrayList<>();
        this.horario = horario;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public static void main(String[] args) {

    }
}
