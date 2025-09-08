package CampeonatoArcoFlecha;
import java.util.HashSet;

public class ComidasBeneficio implements Acumulable{
    private double precio;
    private HashSet<ComidasBeneficio> comidasBeneficios;

    @Override
    public double aplicarDescuentoExtra() {
        return this.precio = 4500;
    }
}
