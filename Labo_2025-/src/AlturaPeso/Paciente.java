package AlturaPeso;
import Persona.Persona;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {
    private HashMap<LocalDate, Registro> registros;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento){
        super(nombre, apellido, fechaNacimiento);
        this.registros = new HashMap<>();
    }

    public void registraDatos(LocalDate fechaRegistro, double pesokg, double alturacm){
        registros.put(fechaRegistro, new Registro(pesokg, alturacm));
    }

    public String obtenerRegistroPorFecha(LocalDate fechaRegistro) {
        for (Map.Entry<LocalDate, Registro> entry : registros.entrySet()) {
            LocalDate fecha = entry.getKey();
            Registro r = entry.getValue();
            if (r != null) {return "Peso: " + r.getPeso() + " kg, Altura: " + r.getAltura() + " cm";}
        }
        return "No hay registro para esa fecha.";
    }

    public String promedioPorAnio(int anio) {
        double sumaPeso = 0;
        double sumaAltura = 0;
        int contador = 0;
        for (Map.Entry<LocalDate, Registro> entry : registros.entrySet()) {
            if (entry.getKey().getYear() == anio) {
                sumaPeso += entry.getValue().getPeso();
                sumaAltura += entry.getValue().getAltura();
                contador++;
            }
        }
        if (contador == 0){
            return "No hay registros en ese año.";
        }
        else{
            return "Promedio peso: " + (sumaPeso / contador) + " kg. Promedio altura: " + (sumaAltura / contador) + " m";
        }
    }

    public String porcentajeCrecimiento(LocalDate fechaInicio, LocalDate fechaFin) {
        Registro rFechaInicio = registros.get(fechaInicio);
        Registro rFechaFin = registros.get(fechaFin);

        if (rFechaInicio == null || rFechaFin == null){return "Faltan registros para calcular.";}

        double porcentaje = ((rFechaFin.getAltura() - rFechaInicio.getAltura()) / rFechaInicio.getAltura()) * 100;
        return String.format("Crecimiento: %.2f%%", porcentaje);
    }

}
