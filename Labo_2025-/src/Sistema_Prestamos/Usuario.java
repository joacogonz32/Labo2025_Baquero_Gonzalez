import Sistema_Prestamos.Publicacion;

import java.time.LocalDate;

class Usuario {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private double credito;
    private String mail;
    private java.util.HashSet<Publicacion> publicacionesLeidas;
    private java.util.HashMap<Publicacion, Integer> publicacionesPrestadas;
    private java.util.HashSet<Libro.Prestamo> prestamosActivos;

    public Usuario(String nombre, String apellido, java.time.LocalDate fechaNacimiento, String mail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.credito = 0;
        this.mail = mail;
        this.publicacionesLeidas = new java.util.HashSet<>();
        this.publicacionesPrestadas = new java.util.HashMap<>();
        this.prestamosActivos = new java.util.HashSet<>();
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public double getCredito() { return credito; }
    public java.util.HashSet<Libro.Prestamo> getPrestamosActivos() { return prestamosActivos; }

    public void agregarPublicacionLeida(Publicacion pub) {
        publicacionesLeidas.add(pub);
    }

    public void registrarPrestamoExitoso(Publicacion pub) {
        publicacionesPrestadas.put(pub, publicacionesPrestadas.getOrDefault(pub, 0) + 1);
    }

    public void restarCredito(double monto) {
        credito -= monto;
    }

    public void sumarCredito(double monto) {
        credito += monto;
    }

    public void agregarPrestamoActivo(Libro.Prestamo prestamo) {
        prestamosActivos.add(prestamo);
    }

    public void quitarPrestamoActivo(Libro.Prestamo prestamo) {
        prestamosActivos.remove(prestamo);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + mail + ") - Crédito: $" + credito;
    }
}
