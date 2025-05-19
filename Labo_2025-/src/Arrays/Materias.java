package Arrays;
import Unidad1.Fecha;
import Arrays.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materias {
    private String nombreMateria;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materias(){
        this.nombreMateria = "Fisica";
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
/*
    public double promedioEdadAlumnos(){

    }

    public double promedioNotasAlumnos() {

    }

 */
    public static void main(String[] args) {
        LocalDate fechaJuanpi = new LocalDate.of(2008,4,30);
        ArrayList<Integer> listaNotas = new ArrayList<>();
        listaNotas.add(4);
        listaNotas.add(5);
        listaNotas.add(7);
        Alumno alumno = new Alumno("Ana", "Gómez", 48680605, fechaJuanpi, listaNotas);
        ArrayList<String> contenidos = new ArrayList<>();
        contenidos.add("limites");
        contenidos.add("funciones");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);
        Materias matematica = new Materias("matematica",contenidos,alumnos);

        alumno.agregarMateria(matematica);
        alumno.agregarNota(8);
        System.out.println("Notas: " + alumno.getListaNotas());
        System.out.println("Menor nota: " + alumno.menorNota());
        System.out.println("Mayor nota: " + alumno.mayorNota());
    }
}
