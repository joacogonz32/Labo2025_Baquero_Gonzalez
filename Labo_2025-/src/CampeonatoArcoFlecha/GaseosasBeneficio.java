package CampeonatoArcoFlecha;
import java.util.HashSet;

public class GaseosasBeneficio implements Acumulable{
    private double precio;
    private HashSet<String> gaseosasConBeneficio;

    @Override
    public double aplicarDescuentoExtra() {
        return this.precio = 1000;
    }
}
