package Control_electricidad;

import java.util.HashMap;

public class Vivienda_Departamento extends Vivienda{
    private Integer cantidadAmbientes;
    private static Integer precioKWH = 50;

    public Vivienda_Departamento(Integer cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }

    public Integer getCantidadAmbientes() {
        return cantidadAmbientes;
    }

    public void setCantidadAmbientes(Integer cantidadAmbientes) {
        this.cantidadAmbientes = cantidadAmbientes;
    }

    public static Integer getPrecioKWH() {
        return precioKWH;
    }

    public static void setPrecioKWH(Integer precioKWH) {
        Vivienda_Departamento.precioKWH = precioKWH;
    }
    @Override
    public int calcularConsumo() {
        int total = 0;
        for (HashMap<Meses, Integer> consumoAnual : getConsumo().values()) {
            for (Integer valorMes : consumoAnual.values()) {
                total += valorMes;
            }
        }
        return total * precioKWH;
    }
}
