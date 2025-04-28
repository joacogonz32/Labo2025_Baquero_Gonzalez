package Arrays;
import Unidad1.Fecha;
import Arrays.Materias;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaNotas;
    private ArrayList<Materias> materiaInscripto;

    public Alumno(){
        this.nombre = "Juan";
        this.apellido = "Baquero";
        this.fechaNacimiento = new Fecha(30, 4, 2008);
        this.listaNotas = new ArrayList<Integer>();
        this.listaNotas.add(4);
        this.listaNotas.add(5);
        this.listaNotas.add(7);
        this.materiaInscripto = new ArrayList<Materias>();
        this.materiaInscripto.add("Matematica", new ArrayList<String>(), new ArrayList<Alumno>());
        this.materiaInscripto.add("Lengua");
        this.materiaInscripto.add("Ingles");
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Integer> listaNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaNotas = listaNotas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
            Fecha fechaJuanpi = new Fecha(30, 4, 2008);
            ArrayList<Integer> listaNotas = new ArrayList<Integer>();
            listaNotas.add(4);
            listaNotas.add(5);
            listaNotas.add(7);
            Alumno alumno = new Alumno("Ana", "Gómez", fechaJuanpi, listaNotas);

            alumno.agregarMateria(Matematica);
            alumno.agregarNota(8);
            System.out.println("Notas: " + alumno.getListaNotas());
            System.out.println("Menor nota: " + alumno.menorNota());
            System.out.println("Mayor nota: " + alumno.mayorNota());
        }
    }
