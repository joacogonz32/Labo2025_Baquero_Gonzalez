package AlumnoConMaterias;
import java.util.ArrayList;

public class Escuela {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Materias> materias;

    public Escuela() {
        alumnos = new ArrayList<>();
        materias = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void agregarMateria(Materias materia) {
        materias.add(materia);
    }

    public double promedioEdadAlumnos() {
        int suma = 0;
        for(Alumno a : alumnos){
            suma += a.Edad();
        }
        return suma/ alumnos.size();
    }

    public double promedioNotas() {
        int suma = 0;
        for(Alumno a : alumnos){
            for (int nota : a.getListaNotas())
            suma += nota;
        }
        return suma/ alumnos.size();
    }
}
