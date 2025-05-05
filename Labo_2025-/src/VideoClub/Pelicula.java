package VideoClub;
import Unidad1.Persona;
import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion; //En minutos
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomasDisponibles;

    public Pelicula(String nombre, String genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomasDisponibles) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomasDisponibles = idiomasDisponibles;
    }

    public Pelicula() {
        this.nombre = "Gladiador";
        this.genero = "Accion";
        this.duracion = 160;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomasDisponibles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<String> getIdiomasDisponibles() {
        return idiomasDisponibles;
    }

    public void setIdiomasDisponibles(ArrayList<String> idiomasDisponibles) {
        this.idiomasDisponibles = idiomasDisponibles;
    }

    public ArrayList<Persona> actoresMayoresEdad (){
        ArrayList<Persona> actoresMayores = new ArrayList<>();
        for (Persona actor : actores){
            if (actor.getEdad() >= 18){
                actoresMayores.add(actor);
            }
        }
        return actoresMayores;
    }


    public static void main(String[] args) {

    }
}