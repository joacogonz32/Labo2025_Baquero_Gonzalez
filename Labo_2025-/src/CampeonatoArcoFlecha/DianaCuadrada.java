package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private double ladoCm;

    public DianaCuadrada(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor,double ladoCm) {
        super(id, nivelDificultad, puntajeColor);
        this.ladoCm = ladoCm;
    }

    public double getLadoCm() {
        return ladoCm;
    }

    public void setLadoCm(double ladoCm) {
        this.ladoCm = ladoCm;
    }

    @Override
    public double calcularArea() {
        return ladoCm * ladoCm;
    }

}
