package SistemaBancos;
import java.time.LocalDate;

public class Trabajador {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate birthDate;
    private LocalDate registerDate;

    public Trabajador(){
        this.nombre = "Juan Pablo";
        this.apellido = "Baquero";
        this.dni = 48680605;
        this.birthDate = LocalDate.of(2008, 4, 30);
        this.registerDate = LocalDate.of(2025, 5, 7);
    }

    public Trabajador(String nombre, String apellido, int dni, LocalDate birthDate, LocalDate registerDate){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.birthDate = birthDate;
        this.registerDate = registerDate;
    }

    public Trabajador(String nombre, String apellido, int dni, LocalDate birthDate){
        this.nombre = "Juan Pablo";
        this.apellido = "Baquero";
        this.dni = 48680605;
        this.birthDate = LocalDate.of(2008, 4, 30);
        this.registerDate = LocalDate.now();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public LocalDate getRegisterDate() {
        return registerDate;
    }
    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public int antiguedad(){
        Trabajador t = new Trabajador();
        int anioFechaIngreso = t.getRegisterDate().getYear();
        int anioFechaNow = LocalDate.now().getYear();
        int fechaAntiguedad = 0;
        fechaAntiguedad = anioFechaNow - anioFechaIngreso;
        return fechaAntiguedad;
    }

    public static void main(String[] args) {

    }

}
