package CampeonatoArcoFlecha;
import java.util.HashSet;

public class GaseosasBeneficio implements Acumulable{
    private double precio;
    private HashSet<String> gaseosasConBeneficio;
     public GaseosaBeneficio(String nombre, String creador, HashSet<String> gaseosas) {
        super(nombre, creador);
        this.gaseosas = gaseosas;
    }

    public HashSet<String> getGaseosasConBeneficio() {
        return gaseosasGaseosasConBeneficio;
    }

    public void setGaseosas(HashSet<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public double aplicarDescuentoExtra() {
        return this.precio = 1000;
    }
}
