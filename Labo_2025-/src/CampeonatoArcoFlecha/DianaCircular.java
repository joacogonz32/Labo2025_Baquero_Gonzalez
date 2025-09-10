package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radioCm = 13;

    public DianaCircular(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor) {
        super(id, nivelDificultad, puntajeColor);
    }

    public static int getRadioCm() {
        return radioCm;
    }

    public static void setRadioCm(int radioCm) {
        DianaCircular.radioCm = radioCm;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioCm * radioCm;
    }

}
