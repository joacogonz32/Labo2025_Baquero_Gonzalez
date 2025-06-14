package CampeonatoCurling;
import java.util.ArrayList;

public class CampeonatoCurling {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> fixture;
    private String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    public CampeonatoCurling() {
        this.equipos = new ArrayList<>();
        this.fixture = new ArrayList<>();
    }

    public CampeonatoCurling(ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
        this.equipos = equipos;
        this.fixture = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getFixture() {
        return fixture;
    }

    public void setPartidos(ArrayList<Partido> fixture) {
        this.fixture = fixture;
    }

    public void crearFixture(){
        int diaIndex = 0;
        Equipo equipo = new Equipo();
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = 0; j < equipos.size(); j++) {
                Equipo equipoLocal = equipos.get(i);
                Equipo equipoVisitante = equipos.get(j);
                TurnoValido turno = obtenerTurnoIgual(equipoLocal, equipoVisitante);
                if (turno != null) {
                    fixture.add(new Partido(diasSemana[diaIndex % diasSemana.length], turno, equipoLocal, equipoVisitante));
                    diaIndex++;
                }
                    else{
                        System.out.println("No se puede agendar el partido entre " + equipoLocal.getNombreEquipo() + " y " + equipoVisitante.getNombreEquipo());
                    }
                }
            }
        }

    public TurnoValido obtenerTurnoIgual(Equipo equipoLocal, Equipo equipoVisitante) {
        if (equipoLocal.getDisponibilidad().equals(equipoVisitante.getDisponibilidad())) {
            return equipoLocal.getDisponibilidad();
        }
        return null;
    }

    public void imprimirFixture() {
        for (Partido partido : fixture) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        TurnoValido turno1 = TurnoValido.MAÑANA;
        TurnoValido turno2 = TurnoValido.TARDE;
        TurnoValido turno3 = TurnoValido.NOCHE;

        Equipo equipo2 = new Equipo(turno1);
        Equipo equipo3 = new Equipo(turno2);
        Equipo equipo4 = new Equipo(turno3);
        Equipo equipo5 = new Equipo(turno2);
        Equipo equipo6 = new Equipo(turno1);
        Equipo equipo7 = new Equipo(turno3);
    }
}
