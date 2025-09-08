package CampeonatoArcoFlecha;
import java.util.HashMap;

public abstract class Diana {
    private String id;
    private Dificultad nivelDificultad;
    private HashMap<Integer, ColorDiana> puntajeColor;

    public Diana(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor) {
        this.id = id;
        this.nivelDificultad = nivelDificultad;
        this.puntajeColor = puntajeColor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dificultad getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Dificultad nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public HashMap<Integer, ColorDiana> getPuntajeColor() {
        return puntajeColor;
    }

    public void setPuntajeColor(HashMap<Integer, ColorDiana> puntajeColor) {
        this.puntajeColor = puntajeColor;
    }

    public abstract double calcularArea();

}
