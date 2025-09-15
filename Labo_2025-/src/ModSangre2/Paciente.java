package ModSangre2;
import java.time.LocalDate;
import java.time.Period;

public abstract class Paciente {
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaNacimiento;
    protected char genero;
    protected String tipoSangre;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, char genero, String tipoSangre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.tipoSangre = tipoSangre;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public abstract String getCategoria();
}
