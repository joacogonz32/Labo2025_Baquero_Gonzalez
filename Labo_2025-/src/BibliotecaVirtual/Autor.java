package BibliotecaVirtual;
import java.time.LocalDate;
import java.util.HashSet;

public class Autor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;
    private HashSet<LibroElectronico> bibliografia = new HashSet<>();

    public Autor(String nombre, LocalDate fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public void agregarLibro(LibroElectronico libro) {
        bibliografia.add(libro);
    }

    public HashSet<LibroElectronico> getBibliografia() {
        return bibliografia;
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}
