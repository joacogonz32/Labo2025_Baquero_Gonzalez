package Unidad1;
import Persona.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int cantPaginas;
    private EditorialValida editorial;
    private Fecha fechaPublicado;

    public Libro(){
        this.titulo = "La Bella y La Bestia";
        this.autor = new Persona();
        this.ISBN = 167;
        this.cantPaginas = 382;
        this.editorial = EditorialValida.INTERZONA_SUR;
        this.fechaPublicado = new Fecha();
    }

    public Libro(String titulo, Persona autor, int ISBN, int cantPaginas, EditorialValida editorial, Fecha fechaPublicado){
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

    public EditorialValida getEditorial() {
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

    public void setEditorial(EditorialValida editorial) {
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

    public void comparaFechas(LocalDate fecha) {
        getFechaPublicado();
        this.fechaPublicado.mayorQue(fechaPublicado);
        }

    public static void main(String[] args) {
        String titulo = "";
        Persona autor = new Persona();
        int ISBN = 0;
        int cantPaginas = 0;
        EditorialValida editorial = EditorialValida.EL_ATENEO;
        Fecha fechaPublicado = new Fecha();
        Libro l1 = new Libro();
        Libro l2 = new Libro(titulo, autor, ISBN, cantPaginas, editorial, fechaPublicado);
        LocalDate fecha1 = LocalDate.of(2025,04,30);
        l1.mostrarInfo();
        l1.comparaFechas(fecha1);
        l2.mostrarInfo();
        l2.comparaFechas(fecha1);
    }
}
