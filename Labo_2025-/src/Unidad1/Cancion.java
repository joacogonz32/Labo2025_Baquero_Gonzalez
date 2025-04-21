package Unidad1;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo = "Indiferente";
        this.autor = new Persona();
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

    public static void main(String[] args) {

    }
}
