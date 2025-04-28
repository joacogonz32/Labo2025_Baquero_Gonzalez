package CampeonatoCurling;
import Unidad1.Fecha

public class Partido {
    private Fecha fechaPartido;
    private String horario;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        this.fechaPartido = new Fecha(27, 4, 2024);
        this.equipoLocal = new Equipo()
    }

    public Partido(Fecha fechaPartido, String horario, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fechaPartido = fechaPartido;
        this.horario = horario;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public static void main(String[] args) {

    }
}
