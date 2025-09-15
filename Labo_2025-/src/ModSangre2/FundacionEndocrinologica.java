package ModSangre2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FundacionEndocrinologica {
    private List<Paciente> todosPacientes;
    private List<Tratamiento> pacientesEnTratamiento;

    public FundacionEndocrinologica() {
        todosPacientes = new ArrayList<>();
        pacientesEnTratamiento = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        todosPacientes.add(p);
        if (p instanceof Tratamiento) {
            pacientesEnTratamiento.add((Tratamiento) p);
        }
    }

    public void actualizarDiasTratamiento() {
        for (Tratamiento t : pacientesEnTratamiento) {
            t.solicitarTratamiento();
            t.actualizarDiasTratamiento();
            System.out.println("Días en tratamiento de " + t.getNombreCompleto() + ": " + t.getDiasTratamiento());
        }
    }

    public int cantidadNoAplicaTratamiento() {
        int contador = 0;
        for (Paciente p : todosPacientes) {
            if (p instanceof Adulto || p instanceof Geronte) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarCostosTratamiento() {
        for (Tratamiento t : pacientesEnTratamiento) {
            System.out.println(t.getNombreCompleto() + " - Costo tratamiento: $" + t.calcularCosto());
        }
    }

    public static void main(String[] args) {
        FundacionEndocrinologica fundacion = new FundacionEndocrinologica();

        Nino nino1 = new Nino("Juan", "Perez", LocalDate.of(2018, 5, 10), 'M', "AB+", 5);
        Nino nino2 = new Nino("Ana", "Gomez", LocalDate.of(2021, 3, 15), 'F', "AB-", 8);

        List<String> actividades1 = new ArrayList<>();
        actividades1.add("Futbol");
        actividades1.add("Natacion");
        actividades1.add("Tenis");

        Joven joven1 = new Joven("Carlos", "Lopez", LocalDate.of(1995, 7, 20), 'M', "A+", actividades1);

        List<String> actividades2 = new ArrayList<>();
        actividades2.add("Basquet");
        actividades2.add("Ciclismo");

        Joven joven2 = new Joven("Lucia", "Martinez", LocalDate.of(1996, 12, 5), 'F', "A+", actividades2);

        Adulto adulto1 = new Adulto("Pedro", "Sanchez", LocalDate.of(1980, 1, 1), 'M', "O-");

        Geronte geronte1 = new Geronte("Marta", "Diaz", LocalDate.of(1940, 6, 30), 'F', "B+");

        fundacion.agregarPaciente(nino1);
        fundacion.agregarPaciente(nino2);
        fundacion.agregarPaciente(joven1);
        fundacion.agregarPaciente(joven2);
        fundacion.agregarPaciente(adulto1);
        fundacion.agregarPaciente(geronte1);

        System.out.println("Costos de tratamiento:");
        fundacion.mostrarCostosTratamiento();
        System.out.println();

        System.out.println("Actualización diaria de tratamiento:");
        fundacion.actualizarDiasTratamiento();
        System.out.println();

        System.out.println("Cantidad de pacientes que no aplican al tratamiento: " + fundacion.cantidadNoAplicaTratamiento());
    }
}

