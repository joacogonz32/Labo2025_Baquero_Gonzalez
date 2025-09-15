package ModSangre2;
import java.time.LocalDate;
import java.util.List;

public class Joven extends Paciente implements Tratamiento {
    private static final int EDAD_MIN = 20;
    private static final int EDAD_MAX = 30;

    private List<String> actividadesDeportivas;
    private int diasTratamiento;

    public Joven(String nombre, String apellido, LocalDate fechaNacimiento, char genero, String tipoSangre, List<String> actividadesDeportivas) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
        this.actividadesDeportivas = actividadesDeportivas;
        this.diasTratamiento = 0;
    }

    @Override
    public String getCategoria() {
        return "Joven";
    }

    public boolean estaEnCategoria() {
        int edad = getEdad();
        return edad >= EDAD_MIN && edad <= EDAD_MAX;
    }

    public int añosRestantesCategoria() {
        int edad = getEdad();
        if (edad > EDAD_MAX) return 0;
        return EDAD_MAX - edad;
    }

    @Override
    public void solicitarTratamiento() {
        int cantidadActividades = actividadesDeportivas.size();
        int añosRestantes = añosRestantesCategoria();

        if (cantidadActividades % 2 == 1 && añosRestantes <= 2) {
            System.out.println(getNombreCompleto() + ": Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        } else {
            System.out.println(getNombreCompleto() + ": Será un tratamiento costoso, pero lo vamos a lograr");
        }
    }

    @Override
    public double calcularCosto() {
        int añoNacimiento = fechaNacimiento.getYear();
        int mesNacimiento = fechaNacimiento.getMonthValue();
        int diaNacimiento = fechaNacimiento.getDayOfMonth();

        if (añoNacimiento % 2 == 1) {
            return mesNacimiento * 760000;
        } else {
            return diaNacimiento * 145400;
        }
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

