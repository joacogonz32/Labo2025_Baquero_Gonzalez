package AlturaPeso;
import java.time.LocalDate;

public class Registro {
    private LocalDate fechaRegistro;
    private double peso;
    private double altura;

    public Registro(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {return peso;}
    public double getAltura() {return altura;}
    
    public static void main(String[] args) {
        Paciente p = new Paciente("Juan", "Pérez", LocalDate.of(2000, 5, 10));

        p.registraDatos(LocalDate.of(2022, 1, 10), 70.5, 1.75);
        p.registraDatos(LocalDate.of(2022, 6, 15), 72.0, 1.76);
        p.registraDatos(LocalDate.of(2023, 1, 5), 74.0, 1.78);

        System.out.println(p.obtenerRegistroPorFecha(LocalDate.of(2022, 6, 15)));
        System.out.println(p.promedioPorAnio(2022));
        System.out.println(p.porcentajeCrecimiento(LocalDate.of(2022, 1, 10), LocalDate.of(2023, 1, 5)));
    }
}