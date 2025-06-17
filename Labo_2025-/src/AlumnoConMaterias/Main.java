package AlumnoConMaterias;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaJuanpi = LocalDate.of(2008, 4, 30);
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
        Materias matematica = new Materias(MateriaEnum.MATEMATICA,contenidos,alumnos);

        alumno.agregarMateria(matematica);
        alumno.agregarNota(8);
        System.out.println("Notas: " + alumno.getListaNotas());
        System.out.println("Menor nota: " + alumno.menorNota());
        System.out.println("Mayor nota: " + alumno.mayorNota());
    }
}
