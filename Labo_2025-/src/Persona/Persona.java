package Persona;

import Unidad1.EnumPais;

import java.time.LocalDate;
import java.time.Period;

public class Persona{
    private String nombre;
    private String apellido;
    private int dni;

    private EnumPais pais;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngresoAlBanco;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 00;
        this.fechaNacimiento = LocalDate.now();
        this.fechaIngresoAlBanco = LocalDate.now();
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngresoAlBanco) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngresoAlBanco = fechaIngresoAlBanco;
    }
    //Se usa para dar de alta con la fecha de hoy a empleados.
    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngresoAlBanco = LocalDate.now();
    }

    public  Persona(String nombre, int edad, EnumPais pais){
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngresoAlBanco() {
        return fechaIngresoAlBanco;
    }

    public void setFechaIngresoAlBanco(LocalDate fechaIngresoAlBanco) {
        this.fechaIngresoAlBanco = fechaIngresoAlBanco;
    }

    public int antiguedad(){
        return LocalDate.now().getYear() - fechaIngresoAlBanco.getYear();
    }

    public int Edad() {
        if (fechaNacimiento == null) return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void mostrarDatosPersona() {
        System.out.println(this.nombre + ", "+ this.edad +", " + this.pais);
    }
}