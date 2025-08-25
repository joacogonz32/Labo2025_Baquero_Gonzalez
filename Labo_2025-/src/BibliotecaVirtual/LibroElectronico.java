package BibliotecaVirtual;

import java.util.Objects;

public class LibroElectronico {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String archivoPdf;
    private static int descargasDisponibles = 145;

    public LibroElectronico(String titulo, Autor autor, Genero genero, String archivoPdf) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.archivoPdf = archivoPdf;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ") de " + autor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
