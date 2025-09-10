package CampeonatoArcoFlecha;
import java.util.HashSet;

public class TragosBeneficio extends Beneficio{
    private double precio;
    private HashSet<TragosBeneficio> tragosBeneficios;

    public TragosBeneficio(String nombre, String creador, double precio, HashSet<TragosBeneficio> tragosBeneficios) {
        super(nombre, creador);
        this.precio = precio;
        this.tragosBeneficios = tragosBeneficios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public HashSet<TragosBeneficio> getTragosBeneficios() {
        return tragosBeneficios;
    }

    public void setTragosBeneficios(HashSet<TragosBeneficio> tragosBeneficios) {
        this.tragosBeneficios = tragosBeneficios;
    }
}
