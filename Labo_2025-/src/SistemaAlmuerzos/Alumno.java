package SistemaAlmuerzos;
import Unidad1.Persona;

public class Alumno extends Persona{
    private String division;

    public Alumno(String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division = division;
    }

    public Alumno(){
        super();
        this.division = "3°CSTC";
    }

    public String getDivision(){
        return division;
    }
    public void setDivision(String division){
        this.division = division;
    }

}

