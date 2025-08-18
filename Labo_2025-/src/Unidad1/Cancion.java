package Unidad1;

import Persona.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo = "Indiferente";
        this.autor = new Persona("Almighty", 34, EnumPais.valueOf("Venezuela"));
    }

    public Cancion(String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDatosCancion (){
        autor.mostrarDatosPersona();
        System.out.println(titulo);
    }

    public static void main(String[] args) {

    }
}
