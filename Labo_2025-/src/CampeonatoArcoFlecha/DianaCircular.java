package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radioCm = 13;

    public DianaCircular(String id, Dificultad nivelDificultad, HashMap<ColorDiana, Integer> puntajeColor) {
        super(id, nivelDificultad, puntajeColor);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioCm * radioCm;
    }
}
