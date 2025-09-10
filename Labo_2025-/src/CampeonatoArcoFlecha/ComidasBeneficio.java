package CampeonatoArcoFlecha;
import java.util.HashSet;

public class ComidasBeneficio extends Beneficio implements Acumulable{
    private double precio;
    private HashSet<ComidasBeneficio> comidasBeneficios;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public HashSet<ComidasBeneficio> getComidasBeneficios() {
        return comidasBeneficios;
    }

    public void setComidasBeneficios(HashSet<ComidasBeneficio> comidasBeneficios) {
        this.comidasBeneficios = comidasBeneficios;
    }

    public ComidasBeneficio(String nombre, String creador, double precio, HashSet<ComidasBeneficio> comidasBeneficios) {
        super(nombre, creador);
        this.precio = precio;
        this.comidasBeneficios = comidasBeneficios;
    }

    @Override
    public double aplicarDescuentoExtra() {
        return this.precio = 4500;
    }
}
