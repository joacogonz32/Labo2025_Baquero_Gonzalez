package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private double ladoCm;

    public DianaCuadrada(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor) {
        super(id, nivelDificultad, puntajeColor);
    }

    @Override
    public double calcularArea() {
        return ladoCm * ladoCm;
    }

}
