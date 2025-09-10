package CampeonatoArcoFlecha;

import java.util.HashSet;

public class GaseosasBeneficio extends Beneficio implements Acumulable {
    private double precio;
    private HashSet<String> gaseosasConBeneficio;

    public GaseosasBeneficio(String nombre, String creador, HashSet<String> gaseosasConBeneficio, double precio) {
        super(nombre, creador);
        this.gaseosasConBeneficio = gaseosasConBeneficio;
        this.precio = precio;
    }

    public HashSet<String> getGaseosasConBeneficio() {
        return gaseosasConBeneficio;
    }

    public void setGaseosasConBeneficio(HashSet<String> gaseosasConBeneficio) {
        this.gaseosasConBeneficio = gaseosasConBeneficio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double aplicarDescuentoExtra() {
        return precio - 1000 >= 0 ? precio - 1000 : 0;
    }
}
