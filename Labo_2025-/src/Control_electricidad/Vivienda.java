package Control_electricidad;

import java.time.LocalTime;
import java.util.HashMap;

import static javax.swing.UIManager.put;

public abstract class Vivienda{
    private  String direccion;
    private  int codigoPostal;
    private  Dueño dueñoAsignado;
    private HashMap<LocalTime,HashMap<Meses,Integer>> consumo;

    public String getDireccion() {
        return direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public Dueño getDueñoAsignado() {
        return dueñoAsignado;
    }

    public HashMap<LocalTime, HashMap<Meses, Integer>> getConsumo() {
        return consumo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDueñoAsignado(Dueño dueñoAsignado) {
        this.dueñoAsignado = dueñoAsignado;
    }

    public void setConsumo(HashMap<LocalTime, HashMap<Meses, Integer>> consumo) {
        this.consumo = consumo;
    }
    public abstract int calcularConsumo();
    public void cargarConsumo(LocalTime anio,Meses mes,Integer consumo){
        HashMap<Meses,Integer> consumo2 = this.consumo.get(anio);
        consumo2.put(mes,consumo);
        this.consumo.put(anio,consumo2);
    }
}
