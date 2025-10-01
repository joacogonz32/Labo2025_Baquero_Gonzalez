import Sistema_Prestamos.Prestable;
import Sistema_Prestamos.Publicacion;
import Sistema_Prestamos.TipoPublicacion;

import java.time.LocalDate;

class Libro extends Publicacion implements Prestable {
    private boolean tieneSaga;
    private static TipoPublicacion tipoPublicacion = TipoPublicacion.LIBRO;

    public Libro(String titulo, String autor, int anioPublicacion, int stock, boolean tieneSaga) {
        super(titulo, autor, anioPublicacion, stock, TipoPublicacion.LIBRO);
        this.tieneSaga = tieneSaga;
    }
    @Override
    public TipoPublicacion tipo(){
        return TipoPublicacion.LIBRO;
    }

    @Override
    public java.time.LocalDate darPrestamo() {
        return java.time.LocalDate.now().plusDays(15);
    }

    @Override
    public double calcularMulta() {
        return 7500.0;
    }

    @Override
    public boolean puedeExtenderse(Usuario usuario) {
        return usuario.getCredito() >= 0 && getStock() > 5;
    }

    @Override
    public String obtenerInfo() {
        return "Libro: " + getTitulo() + " por " + getAutor() + " (" + getAnioPublicacion() + ") - Saga: " + (tieneSaga ? "Sí" : "No");
    }

    static class Prestamo {
        private Prestable articulo;
        private int numeroSocio;
        private LocalDate fechaPrestamo;
        private LocalDate fechaDevolucionEstimada;
        private Usuario usuario;

        public Prestamo(Prestable articulo, int numeroSocio, Usuario usuario) {
            this.articulo = articulo;
            this.numeroSocio = numeroSocio;
            this.usuario = usuario;
            this.fechaPrestamo = LocalDate.now();
            this.fechaDevolucionEstimada = articulo.darPrestamo();  // ← Ahora funciona
        }

        public Prestable getArticulo() { return articulo; }
        public LocalDate getFechaDevolucionEstimada() { return fechaDevolucionEstimada; }
        public Usuario getUsuario() { return usuario; }


        public void extenderPrestamo(int dias) throws Exception {
            if (!articulo.puedeExtenderse(usuario)) {
                throw new Exception("No es posible extender el préstamo");
            }

            fechaDevolucionEstimada = fechaDevolucionEstimada.plusDays(dias);
        }

        public void devolverPrestamo() throws Exception {
            LocalDate hoy = LocalDate.now();

            if (hoy.isAfter(fechaDevolucionEstimada)) {
                double multa = articulo.calcularMulta();
                usuario.restarCredito(multa);
                throw new Exception("Libro.Prestamo devuelto fuera de fecha. Multa aplicada: $" + multa);
            }


            usuario.quitarPrestamoActivo(this);
        }

        @Override
        public String toString() {
            return "Préstamo: " + ((Publicacion) articulo).getTitulo() +
                    " - Devolución: " + fechaDevolucionEstimada +
                    " - Usuario: " + usuario.getNombre();
        }
    }
}