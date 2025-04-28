package Arrays;
import Unidad1.Fecha;
import Arrays.Alumno;
import java.util.ArrayList;

public class Materias {
    private String nombreMateria;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materias(){
        this.nombreMateria = "Matematica";
        this.contenidos = new ArrayList<String>();
        this.alumnosInscriptos = new ArrayList<Alumno>();
    }
    public Materias(String nombreMateria, ArrayList<String> contenidos, ArrayList<Alumno> inscriptos) {
        this.nombreMateria = nombreMateria;
        this.contenidos = contenidos;
        this.alumnosInscriptos = inscriptos;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }

    public ArrayList<Alumno> getInscriptos() {
        return alumnosInscriptos;
    }

    public void setInscriptos(ArrayList<Alumno> inscriptos) {
        this.alumnosInscriptos = inscriptos;
    }

    public Materias agregarMateria (){
        materiaInscripto.add();
    }

    public double promedioEdadAlumnos(){

    }

    public double promedioNotasAlumnos(){

    }

    public static void main(String[] args) {

    }
}
