import Sistema_Prestamos.Prestable;
import Sistema_Prestamos.Publicacion;
import Sistema_Prestamos.TipoPublicacion;

import java.time.LocalDate;
import java.util.HashSet;

public class Revista extends Publicacion implements Prestable {
    private String distribuidora;
    private static TipoPublicacion tipoPublicacion = TipoPublicacion.REVISTA;

    public Revista(String titulo, String autor, int anioPublicacion, int stock, String distribuidora) {
        super(titulo, autor, anioPublicacion, stock, TipoPublicacion.REVISTA);
        this.distribuidora = distribuidora;
    }
    @Override
    public TipoPublicacion tipo(){
        return TipoPublicacion.REVISTA;
    }

    @Override
    public LocalDate darPrestamo() {
        int diasPrestamo;
        if (getAnioPublicacion() < 2020) {
            diasPrestamo = 10;
        } else {
            diasPrestamo = 3;
        }
        return LocalDate.now().plusDays(diasPrestamo);
    }
    @Override
    public double calcularMulta() {
        return 3500.0;
    }


    @Override
    public boolean puedeExtenderse(Usuario usuario) {
        if (usuario.getCredito() < 0){
            return false;
        }
        for (Libro.Prestamo p : usuario.getPrestamosActivos()) {
            if (p.getArticulo() instanceof Revista  && !p.getArticulo().equals(this)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String obtenerInfo() {
        return "Revista: " + getTitulo() + " por " + getAutor() + " (" + getAnioPublicacion() + ") - Distribuidora: " + distribuidora;
    }

    public static class SistemaBibliotecario {
        private HashSet<Publicacion> publicacionesTotales;
        private HashSet<Prestable> publicacionesPrestables;
        private HashSet<Libro.Prestamo> prestamosRealizados;

        public SistemaBibliotecario() {
            this.publicacionesTotales = new HashSet<>();
            this.publicacionesPrestables = new HashSet<>();
            this.prestamosRealizados = new HashSet<>();
        }

        public void agregarPublicacion(Publicacion pub) {
            publicacionesTotales.add(pub);
            if (pub instanceof Prestable) {
                publicacionesPrestables.add((Prestable) pub);
            }
        }

        public void buscarPublicacion(String nombre) throws Exception {
            for (Publicacion pub : publicacionesTotales) {
                if (pub.getTitulo().equalsIgnoreCase(nombre)) {
                    System.out.println("Título: " + pub.getTitulo());
                    System.out.println("Autor: " + pub.getAutor());
                    System.out.println("Año de publicación: " + pub.getAnioPublicacion());

                    if (pub instanceof Prestable) {
                        System.out.println("Si quiere tómelo prestado");
                    }
                    return;
                }
            }
            throw new Exception("No tenemos el libro");
        }

        public void verificarDisponibilidad(Publicacion pub) throws Exception {
            if (!(pub instanceof Prestable)) {
                throw new Exception("No se puede dar a prestamo");
            }

            if (pub.getStock() <= 0) {
                throw new Exception("No hay stock suficiente");
            }

            System.out.println("Esta disponible para ser prestado");
        }

        public void agregarPrestamo(Prestable articulo, int numeroSocio, Usuario usuario) throws Exception {
            Publicacion pub = (Publicacion) articulo;
            verificarDisponibilidad(pub);

            Libro.Prestamo prestamo = new Libro.Prestamo(articulo, numeroSocio, usuario);
            prestamosRealizados.add(prestamo);
            usuario.agregarPrestamoActivo(prestamo);
            pub.reducirStock();

            System.out.println("Préstamo agregado correctamente");
        }

        public void extenderPrestamo(Libro.Prestamo prestamo, int diasExtension) throws Exception {
            prestamo.extenderPrestamo(diasExtension);
            System.out.println("Libro.Prestamo extendido");
        }

        public HashSet<Libro.Prestamo> getPrestamosRealizados() {
            return prestamosRealizados;
        }
    }
}
