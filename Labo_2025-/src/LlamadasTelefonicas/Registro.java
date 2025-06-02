package LlamadasTelefonicas;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Registro {
    private ArrayList<Llamada> llamadas;
    private ArrayList<Empleado> empleados;

    public Registro(ArrayList<Llamada> llamadas) {
        this.llamadas = new ArrayList<>();
    }

    public void registrarLlamada(Empleado empleadoOrigen, Empleado empleadoDestino, int duracionSegundos, LocalDateTime fechaLlamada) {
        llamadas.add(new Llamada(empleadoOrigen, empleadoDestino, duracionSegundos, fechaLlamada));
    }

    public ArrayList<Llamada> llamadasDeUnEmpleado(Empleado empleado) {
        ArrayList<Llamada> llamadasEmpleado = new ArrayList<>();
        for (Llamada l : llamadas) {
            if (l.getEmpleadoOrigen().equals(empleado)) {
                llamadasEmpleado.add(l);
            }
        }
        return llamadasEmpleado;
    }

    public void rankingEmpleados(EmpleadoTiempo empleadoTiempo) {
        ArrayList<EmpleadoTiempo> ranking = new ArrayList<>();
        int tiempoTotalExt = 0;
        for (Llamada l : llamadas) {
            if (l.esdelExterior()) {
                for (int i = 0; i < empleados.size(); i++) {
                    if (empleados.get(i).getDni() == (l.getEmpleadoOrigen().getDni())) {
                        tiempoTotalExt += l.getDuracionSeg();
                        ranking.add(empleadoTiempo);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }

}
