package CampeonatoArcoFlecha;
import java.util.HashMap;

public class DianaRectangular extends Diana{
    private double alturaCm;
    private double baseCm;

    public DianaRectangular(String id, Dificultad nivelDificultad, HashMap<Integer, ColorDiana> puntajeColor,double alturaCm,double baseCm) {
        super(id, nivelDificultad, puntajeColor);
        this.alturaCm = alturaCm;
        this.baseCm =  baseCm;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public double getBaseCm() {
        return baseCm;
    }

    public void setBaseCm(double baseCm) {
        this.baseCm = baseCm;
    }

    @Override
    public double calcularArea() {
        return alturaCm * baseCm;
    }

}
