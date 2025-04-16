package Unidad1;
import java.time.LocalDate;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int cantPaginas;
    private String editorial;
    private Fecha fechaPublicado;

    public Libro(){
        this.titulo = "La Bella y La Bestia";
        this.autor = new Persona();
        this.ISBN = 167;
        this.cantPaginas = 382;
        this.editorial = "Santillana";
        this.fechaPublicado = new Fecha();
    }

    public Libro(String titulo, Persona autor, int ISBN, int cantPaginas, String editorial, Fecha fechaPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantPaginas = cantPaginas;
        this.editorial = editorial;
        this.fechaPublicado = fechaPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public Fecha getFechaPublicado() {
        return fechaPublicado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPublicado(Fecha fechaPublicado) {
        this.fechaPublicado = fechaPublicado;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("ISBN: " + ISBN);
        System.out.println("Cantidad Paginas: " + cantPaginas);
        System.out.println("Editorial: " + editorial);
        System.out.println("Fecha publicado: " + fechaPublicado.getMes()+"-" + fechaPublicado.getMes()+ "-" +fechaPublicado.getDia());
    }

    public void comparaFechas(Libro fecha) {
        getFechaPublicado();
        this.fechaPublicado.mayorQue(fechaPublicado);
        }

    public static void main(String[] args) {
        String titulo = "";
        Libro fecha;
        Persona autor = new Persona();
        int ISBN = 0;
        int cantPaginas = 0;
        String editorial = "";
        Fecha fechaPublicado = new Fecha();
        Libro l1 = new Libro();
        Libro l2 = new Libro(titulo, autor, ISBN, cantPaginas, editorial, fechaPublicado);

        l1.mostrarInfo();
        l1.comparaFechas();
        l2.mostrarInfo();
        l2.comparaFechas();
    }
}
