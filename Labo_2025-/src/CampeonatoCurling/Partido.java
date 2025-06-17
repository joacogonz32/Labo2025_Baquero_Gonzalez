package CampeonatoCurling;


import java.time.LocalDate;

public class Partido {
    private String diaPartido;
    private TurnoValido horario;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(){
        //this.diaPartido =;
        this.equipoLocal = new Equipo();
    }

    public Partido(String diaPartido, TurnoValido horario, Equipo equipoLocal, Equipo equipoVisitante) {
        this.diaPartido = diaPartido;
        this.horario = horario;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Partido(Equipo e1, Equipo e2, LocalDate now, TurnoValido turnoValido) {
    }

    public static void main(String[] args) {

    }
}
