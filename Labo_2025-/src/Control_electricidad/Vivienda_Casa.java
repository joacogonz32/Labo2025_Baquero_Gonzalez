package Control_electricidad;

import java.util.HashMap;

public class Vivienda_Casa extends Vivienda{

    private Integer metrosCubiertos;
    private Integer metrosDescubiertos;
    private static Integer precioKWH = 100;

    public Vivienda_Casa(Integer metrosCubiertos, Integer metrosDescubiertos) {
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public Integer getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(Integer metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public Integer getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(Integer metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public static Integer getPrecioKWH() {
        return precioKWH;
    }

    public static void setPrecioKWH(Integer precioKWH) {
        Vivienda_Casa.precioKWH = precioKWH;
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
