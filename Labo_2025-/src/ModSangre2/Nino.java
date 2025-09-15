package ModSangre2;
import java.time.LocalDate;

public class Nino extends Paciente implements Tratamiento {
    private int nivelTolerancia;
    private int diasTratamiento;

    public Nino(String nombre, String apellido, LocalDate fechaNacimiento, char genero, String tipoSangre, int nivelTolerancia) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
        this.nivelTolerancia = nivelTolerancia;
        this.diasTratamiento = 0;
    }

    @Override
    public String getCategoria() {
        return "Niño";
    }

    public boolean tieneMasDeTresAnios() {
        return getEdad() > 3;
    }

    @Override
    public void solicitarTratamiento() {
        if (tieneMasDeTresAnios()) {
            int dias = nivelTolerancia * 2;
            System.out.println(getNombreCompleto() + ": Tu tratamiento tardará esta cantidad de días: " + dias);
        } else {
            System.out.println(getNombreCompleto() + ": Aún es chico para probar el tratamiento");
        }
    }

    @Override
    public double calcularCosto() {
        return nivelTolerancia * 450000;
    }

    @Override
    public void actualizarDiasTratamiento() {
        diasTratamiento++;
    }

    @Override
    public int getDiasTratamiento() {
        return diasTratamiento;
    }
}

