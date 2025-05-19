package CampeonatoCurling;
import Unidad1.Fecha;
import CampeonatoCurling.Equipo;
import CampeonatoCurling.Jugador;

public class Partido {
    private String diaPartido;
    private String horario;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        //this.diaPartido =;
        this.equipoLocal = new Equipo();
    }

    public Partido(String diaPartido, String horario, Equipo equipoLocal, Equipo equipoVisitante) {
        this.diaPartido = diaPartido;
        this.horario = horario;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public static void main(String[] args) {

    }
}
