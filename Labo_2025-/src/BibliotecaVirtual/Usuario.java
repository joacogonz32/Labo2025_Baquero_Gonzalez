package BibliotecaVirtual;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;
    private String mail;
    private Membresia membresia;
    private HashSet<LibroElectronico> librosPrestados = new HashSet<>();

    public Usuario(String nombre, LocalDate fechaNacimiento, String dni, String mail, Membresia membresia) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.mail = mail;
        this.membresia = membresia;
    }

    public void prestarLibro(LibroElectronico libro) {
        try {
            if (librosPrestados.contains(libro)) {
                throw new LimiteDePrestamosAlcanzadoException("Ya tienes prestado el libro: " + libro.getTitulo());
            }
            if (librosPrestados.size() >= membresia.getLimitePrestamos()) {
                throw new MembresiaException("Has alcanzado el límite de tu membresía (" + membresia + ")");
            }
            librosPrestados.add(libro);
            System.out.println("Libro prestado correctamente: " + libro.getTitulo());
        } catch (LimiteDePrestamosAlcanzadoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MembresiaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void devolverLibro(LibroElectronico libro) {
        librosPrestados.remove(libro);
    }

    public HashSet<LibroElectronico> getLibrosPrestados() {
        return librosPrestados;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (" + membresia + ")";
    }
}

