package CampeonatoCurling;
import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaCampeonato {
    private ArrayList <Equipo> equipos;
    private ArrayList <Equipo> equiposManana;
    private ArrayList <Equipo> equiposTarde;
    private ArrayList <Equipo> equiposNoche;
    private ArrayList <Partido> partidos;

    public SistemaCampeonato(ArrayList<Equipo> equipos, ArrayList<Partido> partidos, ArrayList<Equipo> equiposManana, ArrayList<Equipo> equiposTarde, ArrayList<Equipo> equiposNoche) {
        this.equipos = equipos;
        this.partidos = partidos;
        this.equiposManana = equiposManana;
        this.equiposTarde = equiposTarde;
        this.equiposNoche = equiposNoche;
    }
    public SistemaCampeonato(ArrayList<Equipo> equipos){
        this.equipos = equipos;
        this.partidos = new ArrayList<>();
        this.equiposManana = new ArrayList<>();
        this.equiposTarde = new ArrayList<>();
        this.equiposNoche = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquiposManana() {
        return equiposManana;
    }

    public void setEquiposManana(ArrayList<Equipo> equiposManana) {
        this.equiposManana = equiposManana;
    }

    public ArrayList<Equipo> getEquiposTarde() {
        return equiposTarde;
    }

    public void setEquiposTarde(ArrayList<Equipo> equiposTarde) {
        this.equiposTarde = equiposTarde;
    }

    public ArrayList<Equipo> getEquiposNoche() {
        return equiposNoche;
    }

    public void setEquiposNoche(ArrayList<Equipo> equiposNoche) {
        this.equiposNoche = equiposNoche;
    }

    public void filtrarTurno(){
        for (Equipo equipo : equipos) {
            if (equipo.getDisponibilidad().equals(TurnoValido.MANIANA)) {
                equiposManana.add(equipo);
            } else if (equipo.getDisponibilidad().equals(TurnoValido.TARDE)) {
                equiposTarde.add(equipo);
            } else {
                equiposNoche.add(equipo);
            }
        }
    }
    public void enfrentarManana() {
        for (int i = 0; i < equiposManana.size(); i++) {
            for (int j = i + 1; j < equiposManana.size(); j++) {
                Equipo e1 = equiposManana.get(i);
                Equipo e2 = equiposManana.get(j);
                LocalDate fecha = LocalDate.of(2025, 6, 20);
                Partido partido = new Partido(e1, e2, fecha , TurnoValido.MANIANA);
                partidos.add(partido);
            }
        }
    }
    public void enfrentarTarde() {
        for (int i = 0; i < equiposTarde.size(); i++) {
            for (int j = i + 1; j < equiposTarde.size(); j++) {
                Equipo e1 = equiposTarde.get(i);
                Equipo e2 = equiposTarde.get(j);
                LocalDate fecha = LocalDate.of(2025, 6, 20);
                Partido partido = new Partido(e1, e2, fecha, TurnoValido.TARDE);
                partidos.add(partido);
            }
        }
    }
    public void enfrentarNoche() {
        for (int i = 0; i < equiposNoche.size(); i++) {
            for (int j = i + 1; j < equiposNoche.size(); j++) {
                Equipo e1 = equiposNoche.get(i);
                Equipo e2 = equiposNoche.get(j);
                Partido partido = new Partido(e1, e2, LocalDate.now(), TurnoValido.NOCHE);
                partidos.add(partido);
            }
        }
    }

    public static void main(String[] args) {
        Jugador j1 = new Jugador("juan",LocalDate.of(2008,1,21),47);
        Equipo eq1 = new Equipo();
        Equipo eq2 = new Equipo("pacifico","vdp",TurnoValido.TARDE);
        Equipo eq3 = new Equipo("alvear","avellaneda",TurnoValido.NOCHE);
        Equipo eq4 = new Equipo("banfield","banfield",TurnoValido.MANIANA);

        ArrayList<Equipo> aEquipos = new ArrayList<>();
        aEquipos.add(eq1);
        aEquipos.add(eq2);
        aEquipos.add(eq3);
        aEquipos.add(eq4);

        SistemaCampeonato c1 = new SistemaCampeonato(aEquipos);
        c1.filtrarTurno();
        c1.enfrentarManana();
        c1.enfrentarTarde();
        c1.enfrentarNoche();
        eq1.agregarJugador(j1);
        eq1.definirCapitan(j1);

    }
}