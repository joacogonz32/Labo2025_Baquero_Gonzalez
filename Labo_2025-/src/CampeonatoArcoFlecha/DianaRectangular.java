package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaRectangular extends Diana{
    private double alturaCm;
    private double baseCm;

    public DianaRectangular(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor) {
        super(id, nivelDificultad, puntajeColor);
    }

    @Override
    public double calcularArea() {
        return alturaCm * baseCm;
    }

}
