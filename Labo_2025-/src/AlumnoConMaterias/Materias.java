package AlumnoConMaterias;

import java.util.ArrayList;

public class Materias {
    private MateriaEnum nombreMateriaEnum;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public Materias(){
        this.nombreMateriaEnum = MateriaEnum.HISTORIA;
        this.contenidos = new ArrayList<String>();
        this.alumnosInscriptos = new ArrayList<Alumno>();
    }
    public Materias(MateriaEnum nombreMateriaEnum, ArrayList<String> contenidos, ArrayList<Alumno> inscriptos) {
        this.nombreMateriaEnum = nombreMateriaEnum;
        this.contenidos = contenidos;
        this.alumnosInscriptos = inscriptos;
    }

    public MateriaEnum getNombreMateria() {
        return nombreMateriaEnum;
    }

    public void setNombreMateria(MateriaEnum nombreMateriaEnum) {
        this.nombreMateriaEnum = nombreMateriaEnum;
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

    public void InscribirAlumno(Alumno alumno){
        alumnosInscriptos.add(alumno);
    }

}
