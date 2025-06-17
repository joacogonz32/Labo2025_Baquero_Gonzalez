package AlumnoConMaterias;
import Persona.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Integer> listaNotas;
    private ArrayList<Materias> materiaInscripto;

    public Alumno(){
        super("Juan","Baquero",88,LocalDate.of(30, 4, 2008));
        this.listaNotas = new ArrayList<Integer>();
        this.listaNotas.add(4);
        this.listaNotas.add(5);
        this.listaNotas.add(7);
        this.materiaInscripto = new ArrayList<Materias>();
    }

    public Alumno(String nombre, String apellido, int dni, LocalDate fechaNacimiento, ArrayList<Integer> listaNotas) {
        super();
        this.listaNotas = listaNotas;
    }


    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void agregarNota(int nota) {
        listaNotas.add(nota);
    }

    public double menorNota() {
        int nota = listaNotas.get(0);
        for (int i = 0; i < listaNotas.size(); i++) {
            if (nota > listaNotas.get(i)) {
                nota = listaNotas.get(i);
            }
        }
        return nota;
    }
    public double mayorNota() {
        int nota = listaNotas.get(0);
        for (int i = 0; i < listaNotas.size(); i++) {
            if (nota < listaNotas.get(i)) {
                nota = listaNotas.get(i);
            }
        }
        return nota;
    }

    public void agregarMateria(Materias materia){
        materiaInscripto.add(materia);
    }

        public static void main(String[] args) throws Exception {

        }

}
