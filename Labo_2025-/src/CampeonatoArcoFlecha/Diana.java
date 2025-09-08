package CampeonatoArcoFlecha;
import java.util.HashMap;

public abstract class Diana {
    private String id;
    private Dificultad nivelDificultad;
    private HashMap<ColorDiana, Integer> puntajeColor;

    public Diana(String id, Dificultad nivelDificultad, HashMap<ColorDiana, Integer> puntajeColor) {
        this.id = id;
        this.nivelDificultad = nivelDificultad;
        this.puntajeColor = puntajeColor;
    }

    public abstract double calcularArea();
}
