package CampeonatoCurling;
import java.util.ArrayList;

public class Equipo{
    private String nombreEquipo;
    private Barrio barrio;
    private ArrayList<Jugador> jugadores;
    private Jugador capitan;
    private TurnoValido disponibilidad;

    public Equipo(){
        this.nombreEquipo = "Equipo 1";
        this.barrio = Barrio.AGRONOMIA;
        this.jugadores = new ArrayList<>();
        this.capitan = new Jugador();
        this.disponibilidad = TurnoValido.TARDE;
    }

    // Constructor por parametro (usa solo disponibilidad)
    public Equipo(TurnoValido horario){
        this.nombreEquipo = "Equipo Aux";
        this.barrio = Barrio.ALMAGRO;
        this.jugadores = new ArrayList<>();
        this.disponibilidad = disponibilidad;
    }

    public Equipo(String nombreEquipo, Barrio barrio, Jugador jugadores, TurnoValido disponibilidad){
        this.nombreEquipo = nombreEquipo;
        this.barrio = barrio;
        this.jugadores = new ArrayList<>();
        this.disponibilidad = disponibilidad;
    }

    public Equipo(String viejardas, String coghlan, TurnoValido turnoValido) {
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
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

    public void agregarJugador(Jugador j1) {
        jugadores.add(j1);
    }

    public void definirCapitan(Jugador jugador) {
        if (jugadores.contains(jugador)) {
            this.capitan = jugador;
            System.out.println(jugador.getApellido() + " ahora es el capitán del equipo " + this.nombreEquipo);
        } else {
            System.out.println("El jugador no pertenece al equipo y no puede ser capitán.");
        }
    }
}
